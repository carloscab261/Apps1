package com.example.eva2_1_intentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Intent inte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String Tele = "tel:5465489";
        inte = new Intent(Intent.ACTION_DIAL, Uri.parse(Tele));
    }
    public void onClick(View v){
    //"sadsadsa"


    }
}