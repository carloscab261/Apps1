package com.example.eva1_6_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imVwLogo;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imVwLogo = findViewById(R.id.imgVwLogo);
        textView =findViewById(R.id.textView);
        imVwLogo.setImageResource(R.drawable.logo);
        textView.setText(R.string.mis_datos);
    }
}