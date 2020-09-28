package com.example.eva1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bntListener, btnPorClaseAnonima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bntListener = findViewById(R.id.btnListener);
        btnPorClaseAnonima = findViewById(R.id.btnPorClaseAnonima);
        bntListener.setOnClickListener(this);
        //final Context context =getApplicationContext();


        btnPorClaseAnonima.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "por clase anonima", Toast.LENGTH_SHORT).show();
                    }
                }


        );


    }
    //Evento click
    public void miClick(View v){
        Toast.makeText(this, "Hola Mundo", Toast.LENGTH_SHORT).show();
}

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Evento por interfaz", Toast.LENGTH_SHORT).show();
    }
}