package com.example.eva_3_widgets_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declarar un objeto del mismo tipo del widget a modificar
    TextView txtVwHolaMundo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //no existe la interfaz grafica
        setContentView(R.layout.activity_main);
        //Ya existe la interfaz grafica
        //Vincular  el componente

        txtVwHolaMundo = findViewById(R.id.txtVwDatos);
        txtVwHolaMundo.setText("Mi primer codigo en android");






    }
}