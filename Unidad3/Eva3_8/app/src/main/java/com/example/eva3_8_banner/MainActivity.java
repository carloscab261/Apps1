package com.example.eva3_8_banner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView   imgn;
    int[] Imggs= {R.drawable.f1,R.drawable.f2,R.drawable.f3};
    int indq = 0;
    Handler hm = new Handler();
    Runnable backRun= new Runnable() {
        @Override
        public void run() {

            while(true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();}
                hm.post(foreRun);

            }
        }
    };

    Runnable foreRun= new Runnable() {
        @Override
        public void run() {
            imgn.setImageResource(Imggs[indq]);
            if (indq==2){
                indq=0;
        }else{
                indq++;
            }
    }};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgn=findViewById(R.id.imgg);
        Thread hilo = new Thread(backRun);
        hilo.start();
    }
}