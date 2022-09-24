package com.example.randomfacts.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.randomfacts.R;
import com.example.randomfacts.core.ServiceLocator;
import com.example.randomfacts.core.domain.FactEntity;
import com.example.randomfacts.core.domain.GetRandomFactUseCase;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

public class HomeScreen extends AppCompatActivity {

    Button button;
    TextView textView;

    HomeController homeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ServiceLocator serviceLocator = new ServiceLocator();
        homeController = serviceLocator.homeController;

        setContentView(R.layout.activity_home);

        textView = findViewById(R.id.textView);

        button = findViewById(R.id.btn_get_fact);
        button.setOnClickListener(view -> {

            FactEntity entity = null;
            try {
                entity = homeController.getGetRandomFact();
            } catch (Exception e) {
                e.printStackTrace();
            }
            textView.setText(entity.text);

        });

    }


}
