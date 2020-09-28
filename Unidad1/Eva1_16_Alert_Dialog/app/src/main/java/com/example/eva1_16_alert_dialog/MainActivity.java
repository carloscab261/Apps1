package com.example.eva1_16_alert_dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        public void onShowAlertDialog(View v) {
            new AlertDialog.Builder(this )
                    .setTitle("Cuadro de dialogo android")
                    .setMessage("Cuadro de dialogo")
                    .setIcon(R.drawable.ic_launcher_background)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Log.wtf("Alerta Dialogo", "yes");
                        }
                    })
                    .setNegativeButton("no", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Log.wtf("Alerta Dialogo", "No ");

                        }
                    })
                    .setNeutralButton("canell", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Log.wtf("Alerta Dialogo", "Cancel");
                        }
                    })
                    .create()
                    .show();
        }
    }
}