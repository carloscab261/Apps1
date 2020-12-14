package com.example.eva3_8_banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView   imgV;
    int[] Imgs= {R.drawable.f1,R.drawable.f2,R.drawable.f3};
    int indice = 0;
    Handler hImg = new Handler();
    Runnable backRun= new Runnable() {
        @Override
        public void run() {

            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();}
                hImg.post(foreRun);

            }
        }
    };

    Runnable foreRun= new Runnable() {
        @Override
        public void run() {
            imgV.setImageResource(Imgs[indice]);
            if (indice==2){
                indice=0;
        }else{
                indice++;
            }
    }};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgV=findViewById(R.id.imgV);
        Thread hilo = new Thread(backRun);
        hilo.start();
    }
}