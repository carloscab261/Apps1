package com.example.exa_prac_5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnReiniciar;
    TextView txtView;
    int conJugador=0, comA1=0,  comA2=0,  comA3=0,  comA4=0,  comA5=0,  comA6=0,  comA7=0,  comA8=0;
    int comB1=0,  comB2=0,  comB3=0,  comB4=0,  comB5=0,  comB6=0,  comB7=0,  comB8=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        txtView = findViewById(R.id.txtView);


    }
    public void botReiniciar(View v){
        btn1.setText("-");
        btn1.setEnabled(true);
        btn2.setText("-");
        btn2.setEnabled(true);
        btn3.setText("-");
        btn3.setEnabled(true);
        btn4.setText("-");
        btn4.setEnabled(true);
        btn5.setText("-");
        btn5.setEnabled(true);
        btn6.setText("-");
        btn6.setEnabled(true);
        btn7.setText("-");
        btn7.setEnabled(true);
        btn8.setText("-");
        btn8.setEnabled(true);
        btn9.setText("-");
        btn9.setEnabled(true);
        txtView.setText("-----");
        comA1=0;comA2=0;comA3=0;comA4=0;comA5=0;comA6=0;comA7=0;comA8=0;
        comB1=0;comB2=0;comB3=0;comB4=0;comB5=0;comB6=0;comB7=0;comB8=0;
    }
    public void button1(View v){
        if(conJugador==0) {
            btn1.setText("X");
            comA1=comA1+1;
            comA2=comA2+1;
            comA3=comA3+1;
            conJugador = conJugador + 1;
        }else {
            btn1.setText("O");
            comB1=comB1+1;
            comB2=comB2+1;
            comB3=comB3+1;
            conJugador = conJugador - 1;
        }
        btn1.setEnabled(false);
        if(comA1==3|comA2==3|comA3==3|comA4==3|comA5==3|comA6==3|comA7==3|comA8==3){
            txtView.setText("Gano X");
            onShowAlertDialog(2);
        }if(comB1==3|comB2==3|comB3==3|comB4==3|comB5==3|comB6==3|comB7==3|comB8==3){
            txtView.setText("Gano O");
            onShowAlertDialog(1);
        }

    }


    public void button2(View v){
        if(conJugador==0){
            btn2.setText("X");
            comA1=comA1+1;
            comA6=comA6+1;
            conJugador=conJugador+1;
        }else {
            btn2.setText("O");
            comB1=comB1+1;
            comB6=comB6+1;
            conJugador = conJugador - 1;
        }
        btn2.setEnabled(false);
        if(comA1==3|comA2==3|comA3==3|comA4==3|comA5==3|comA6==3|comA7==3|comA8==3){
            txtView.setText("Gano X");
            onShowAlertDialog(2);
        }if(comB1==3|comB2==3|comB3==3|comB4==3|comB5==3|comB6==3|comB7==3|comB8==3){
            txtView.setText("Gano O");
            onShowAlertDialog(1);
        }

    }


    public void button3(View v){
        if(conJugador==0){
            btn3.setText("X");
            comA1=comA1+1;
            comA4=comA4+1;
            comA8=comA8+1;
            conJugador=conJugador+1;
        }else {
            btn3.setText("O");
            comB1=comB1+1;
            comB4=comB4+1;
            comB8=comB8+1;
            conJugador = conJugador - 1;
        }
        btn3.setEnabled(false);
        if(comA1==3|comA2==3|comA3==3|comA4==3|comA5==3|comA6==3|comA7==3|comA8==3){
            txtView.setText("Gano X");
            onShowAlertDialog(2);
        }if(comB1==3|comB2==3|comB3==3|comB4==3|comB5==3|comB6==3|comB7==3|comB8==3){
            txtView.setText("Gano O");
            onShowAlertDialog(1);
        }

    }


    public void button4(View v){
        if(conJugador==0){
            btn4.setText("X");
            comA2=comA2+1;
            comA7=comA7+1;
            conJugador=conJugador+1;
        }else {
            btn4.setText("O");
            comB2=comB2+1;
            comB7=comB7+1;
            conJugador = conJugador - 1;
        }
        btn4.setEnabled(false);
        if(comA1==3|comA2==3|comA3==3|comA4==3|comA5==3|comA6==3|comA7==3|comA8==3){
            txtView.setText("Gano X");
            onShowAlertDialog(2);
        }if(comB1==3|comB2==3|comB3==3|comB4==3|comB5==3|comB6==3|comB7==3|comB8==3){
            txtView.setText("Gano O");
            onShowAlertDialog(1);
        }

    }


    public void button5(View v){
        if(conJugador==0){
            btn5.setText("X");
            comA3=comA3+1;
            comA6=comA6+1;
            comA7=comA7+1;
            comA8=comA8+1;
            conJugador=conJugador+1;
        }else {
            btn5.setText("O");
            comB3=comB3+1;
            comB6=comB6+1;
            comB7=comB7+1;
            comB8=comB8+1;
            conJugador = conJugador - 1;
        }
        btn5.setEnabled(false);
        if(comA1==3|comA2==3|comA3==3|comA4==3|comA5==3|comA6==3|comA7==3|comA8==3){
            txtView.setText("Gano X");
            onShowAlertDialog(2);
        }if(comB1==3|comB2==3|comB3==3|comB4==3|comB5==3|comB6==3|comB7==3|comB8==3){
            txtView.setText("Gano O");
            onShowAlertDialog(1);
        }

    }


    public void button6(View v){
        if(conJugador==0){
            btn6.setText("X");
            comA4=comA4+1;
            comA7=comA7+1;
            conJugador=conJugador+1;
        }else {
            btn6.setText("O");
            comB4=comB4+1;
            comB7=comB7+1;
            conJugador = conJugador - 1;
        }
        btn6.setEnabled(false);
        if(comA1==3|comA2==3|comA3==3|comA4==3|comA5==3|comA6==3|comA7==3|comA8==3){
            txtView.setText("Gano X");
            onShowAlertDialog(2);
        }if(comB1==3|comB2==3|comB3==3|comB4==3|comB5==3|comB6==3|comB7==3|comB8==3){
            txtView.setText("Gano O");
            onShowAlertDialog(1);
        }

    }


    public void button7(View v){
        if(conJugador==0){
            btn7.setText("X");
            comA2=comA2+1;
            comA5=comA5+1;
            comA8=comA8+1;
            conJugador=conJugador+1;
        }else {
            btn7.setText("O");
            comB2=comB2+1;
            comB5=comB5+1;
            comB8=comB8+1;
            conJugador = conJugador - 1;
        }
        btn7.setEnabled(false);
        if(comA1==3|comA2==3|comA3==3|comA4==3|comA5==3|comA6==3|comA7==3|comA8==3){
            txtView.setText("Gano X");
            onShowAlertDialog(2);
        }if(comB1==3|comB2==3|comB3==3|comB4==3|comB5==3|comB6==3|comB7==3|comB8==3){
            txtView.setText("Gano O");
            onShowAlertDialog(1);
        }

    }


    public void button8(View v){
        if(conJugador==0){
            btn8.setText("X");
            comA5=comA5+1;
            comA6=comA6+1;
            conJugador=conJugador+1;
        }else {
            btn8.setText("O");
            comB5=comB5+1;
            comB6=comB6+1;
            conJugador = conJugador - 1;
        }
        btn8.setEnabled(false);
        if(comA1==3|comA2==3|comA3==3|comA4==3|comA5==3|comA6==3|comA7==3|comA8==3){
            txtView.setText("Gano X");
            onShowAlertDialog(2);
        }if(comB1==3|comB2==3|comB3==3|comB4==3|comB5==3|comB6==3|comB7==3|comB8==3){
            txtView.setText("Gano O");
            onShowAlertDialog(1);
        }

    }


    public void button9(View v){
        if(conJugador==0){
            btn9.setText("X");
            conJugador=conJugador+1;
            comA3=comA3+1;
            comA4=comA4+1;
            comA5=comA5+1;
        }else {
            btn9.setText("O");
            comB3=comB3+1;
            comB4=comB4+1;
            comB5=comB5+1;
            conJugador = conJugador - 1;
        }
        btn9.setEnabled(false);
        if(comA1==3|comA2==3|comA3==3|comA4==3|comA5==3|comA6==3|comA7==3|comA8==3){
            txtView.setText("Gano X");
            onShowAlertDialog(2);
        }
        if(comB1==3|comB2==3|comB3==3|comB4==3|comB5==3|comB6==3|comB7==3|comB8==3){
            txtView.setText("Gano O");
            onShowAlertDialog(1);
        }

    }


    public void onShowAlertDialog(int i){
        String s;
        if(i==2){
            s="Gano X";
        }else{
            s="Gano O";
        }
        new AlertDialog.Builder(this)
                .setTitle("Ganador")
                .setMessage(s)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                })
                .create()
                .show();
    }


}