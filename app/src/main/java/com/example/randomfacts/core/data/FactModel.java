package com.example.randomfacts.core.data;


import androidx.annotation.NonNull;

import com.example.randomfacts.core.domain.FactEntity;

import org.json.JSONException;
import org.json.JSONObject;


public class FactModel extends FactEntity {
   public FactModel(){ }
   public static FactModel fromJson(JSONObject json) throws JSONException {
       FactModel model = new FactModel();
           model.id = json.getString("id");
           model.language =  json.getString("language");
           model.permalink =  json.getString("permalink");
           model.text =  json.getString("text");
          return model;

   }

    @NonNull
    @Override
    public String toString() {
        return this.text;
    }
}
