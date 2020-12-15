package com.example.eva2_4_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn = findViewById(R.id.btn);
         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 intent = new Intent(getApplicationContext(), DetailActivity.class);
                 intent.putExtra("Mensaje","Hola ");
                 intent.putExtra("Entero", 300+" ");
                 intent.putExtra("Precio", 30.0f);
                 startActivity(intent);
             }
         });
    }
}