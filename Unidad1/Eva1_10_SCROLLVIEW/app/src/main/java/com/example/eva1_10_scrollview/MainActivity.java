package com.example.eva1_10_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtVwTexto;
    final String cade= "composición de caracteres imprimibles generados por un algoritmo de cifrado que, aunque no tienen sentido para cualquier persona, sí puede ser descifrado por su destinatario original. De acuerdo a Greimas, es un enunciado ya sea gráfico o fónico que nos permite visualizar las palabras que escuchamos y que es utilizado para manifestar el proceso lingüístico. Mientras Hjelmslev usa ese término para designar el todo de una cadena lingüística ilimitada (§1). ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwTexto = findViewById(R.id.txtVwTexto);
        txtVwTexto.setText(cade);

    }
}