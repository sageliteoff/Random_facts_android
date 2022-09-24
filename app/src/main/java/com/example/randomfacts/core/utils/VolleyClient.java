package com.example.randomfacts.core.utils;

import java.util.Map;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;



public class VolleyClient implements  Client{
    String baseUrl;
    RequestQueue queue;
    JSONObject res;
    public  VolleyClient(RequestQueue queue, String baseUrl){
        this.baseUrl = baseUrl;
        this.queue = queue;
    }

    void onSuccess(JSONObject response){};
    void onError(Object error){};

    @Override
    public JSONObject get(String url, JSONObject params) throws Exception {
            res = new JSONObject();
            JsonObjectRequest request = new JsonObjectRequest(
                    Request.Method.GET,
                    url,
                    params,
                    response -> {
                        this.res  = response;
                    },
                    this::onError);

       this.queue.add(request);
       return  res;
    }

    @Override
    public JSONObject post(String url, JSONObject data) {

        return  new JSONObject();
    }
}
