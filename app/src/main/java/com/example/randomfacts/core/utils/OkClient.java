package com.example.randomfacts.core.utils;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.util.HashMap;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkClient implements  Client{
    OkHttpClient client = new OkHttpClient();
    Gson gson = new Gson();


    private JSONObject parseResponse(Response response) throws  Exception{
        String body = response.body().string();
        HashMap res = this.gson.fromJson(body, HashMap.class);
        return  new JSONObject(res);
    }

    @Override
    public JSONObject get(String url, JSONObject params) throws Exception {

            Request request = new Request.Builder()
                    .url(url)
                    .build();
            Response response = client.newCall(request).execute();
        return this.parseResponse(response) ;
    }

    @Override
    public JSONObject post(String url, JSONObject data) throws Exception {
        return null;
    }
}
