package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView Da;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Da = findViewById(R.id.Da);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Da.append(bundle.getString("Ciudad"));
        Da.append(bundle.getInt("Posicion")+"   ");

    }
}