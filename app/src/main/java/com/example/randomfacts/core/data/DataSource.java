package com.example.randomfacts.core.data;

import  com.example.randomfacts.core.utils.Client;

import org.json.JSONObject;
import java.util.Map;




public class DataSource {
    Client client;
   public DataSource(Client client){
        this.client = client;
    }

    public FactModel fetchFact(Map params) throws Exception {
        return FactModel.fromJson(this.client.get("https://uselessfacts.jsph.pl/random.json?language=en", new JSONObject(params)));
   }
}
