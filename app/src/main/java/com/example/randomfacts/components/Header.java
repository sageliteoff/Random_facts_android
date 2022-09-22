package com.example.randomfacts.components;

import androidx.annotation.Nullable;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.randomfacts.History.HistoryScreen;
import com.example.randomfacts.R;

public class Header extends LinearLayout {
    Button viewHistoryButton;
    Context context;

    public Header(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        this.context = context;

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.header, this, true);

        this.initializeButton();

    }

    void initializeButton(){
        viewHistoryButton = findViewById(R.id.btn_go_to_history);
        viewHistoryButton.setOnClickListener(this::gotoHistory);
    }

    void gotoHistory(View view) {
        Intent intent = new Intent(this.context, HistoryScreen.class);
        this.context.startActivity(intent);
    }
}