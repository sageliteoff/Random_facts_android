package com.example.randomfacts.home;

import android.os.AsyncTask;
import android.os.StrictMode;

import com.example.randomfacts.core.domain.FactEntity;
import com.example.randomfacts.core.domain.GetRandomFactUseCase;

public class HomeController extends AsyncTask {
    GetRandomFactUseCase getRandomFactUseCase;
    public HomeController(GetRandomFactUseCase getRandomFactUseCase){
        this.getRandomFactUseCase = getRandomFactUseCase;
    }

    public FactEntity  getGetRandomFact()  throws Exception{

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        return getRandomFactUseCase.execute();
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }
}
