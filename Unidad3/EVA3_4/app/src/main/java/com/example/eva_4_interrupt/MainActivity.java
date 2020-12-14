package com.example.eva_4_interrupt;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            int i=0;
            while(true){
                try {
                    Thread.sleep(1000);
                    Log.w("Runnable", i + "");
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };


    Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread((runnable ));
        thread.start();


    }


    protected void onStop() {
        super.onStop();
        thread.interrupt();
    }

}