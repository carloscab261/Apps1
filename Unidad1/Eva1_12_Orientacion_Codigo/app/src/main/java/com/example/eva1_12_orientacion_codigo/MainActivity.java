package com.example.eva1_12_orientacion_codigo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int iOrienta = getResources().getConfiguration().orientation;
        if(iOrienta == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(this, "Modo portrait", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "Modo LANDSPACE", Toast.LENGTH_SHORT).show();


        }
    }
}