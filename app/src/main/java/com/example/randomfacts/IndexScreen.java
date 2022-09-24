package com.example.randomfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.randomfacts.home.HomeScreen;

public class IndexScreen extends AppCompatActivity {
    Button getFactButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        getFactButton = findViewById(R.id.btn_get_fact);

        getFactButton.setOnClickListener(this::gotoHome);
    }


    public void gotoHome(View view) {
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }

}