package com.example.examenpractico_acreditanoacredita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


     TextView Texto1, Texto2,Texto3;
     SeekBar Ajuste1, Ajuste2;
     int a,b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Texto1 = (TextView) findViewById(R.id.Texto1);
        Texto2 = (TextView) findViewById(R.id.Texto2);
        Texto3 = (TextView) findViewById(R.id.Texto3);
        Ajuste1= (SeekBar) findViewById(R.id.Ajuste1);
        Ajuste2= (SeekBar) findViewById(R.id.Ajuste2);

        Ajuste1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                a=progress;
                Texto1.setText("Puntos para acredirar: " + progress);
                if(b>=a) {
                    Texto3.setText("Acredita!!");

                }
                else{
                    Texto3.setText("No Acredita!!");
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        Ajuste2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                b=progress;
                Texto2.setText("Calificacion: " + progress);
                if(b>=a){
                    Texto3.setText("Acredita!!");

                }
                else{
                    Texto3.setText("No Acredita!!");

                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}