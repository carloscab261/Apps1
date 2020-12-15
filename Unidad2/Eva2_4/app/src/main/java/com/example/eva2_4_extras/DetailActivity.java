package com.example.eva2_4_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txt = findViewById(R.id.textView);
        Intent intent = getIntent();
        txt.append(intent.getStringExtra("Mensaje"));
        txt.append(""+intent.getIntExtra("Entero",200));
        txt.append(""+intent.getFloatExtra("Precio", 30.0f));
    }
}