package com.example.randomfacts.core.utils;

import com.example.randomfacts.core.data.Model;

import org.json.JSONObject;

import java.util.Map;

public interface  Client {
    JSONObject get (String url, JSONObject params) throws  Exception;
    JSONObject post(String url, JSONObject data) throws  Exception;
}