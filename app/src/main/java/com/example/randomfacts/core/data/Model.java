package com.example.randomfacts.core.data;

import org.json.JSONException;
import org.json.JSONObject;

public interface Model {
      Model fromJson(JSONObject json)  throws JSONException;
}
