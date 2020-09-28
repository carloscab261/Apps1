package com.example.eva1_9_idiomas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdGrpIdioma;
    RadioButton español,ingles;
    TextView nombre, nombre2,apellido,apellido2,sexo,poco,mucho,nohay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGrpIdioma=findViewById(R.id.rdGrpIdioma);

        español =findViewById(R.id.español);
        ingles =findViewById(R.id.ingles);
        nombre = findViewById(R.id.nombre);
        nombre2 = findViewById(R.id.nombre2);
        apellido = findViewById(R.id.apellido);
        apellido2 = findViewById(R.id.apellido2);
        sexo = findViewById(R.id.sexo);
        poco = findViewById(R.id.poco);
        mucho = findViewById(R.id.mucho);
        nohay = findViewById(R.id.nohay);



        rdGrpIdioma.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);
                Toast.makeText(getApplicationContext(),radioButton.getText(),Toast.LENGTH_SHORT).show();
                if(checkedId == R.id.español){
                            español.setText(R.string.btn_es_español);
                            ingles.setText(R.string.btn_es_inges);
                            nombre.setText(R.string.txt_es_nombre);
                            nombre2.setText(R.string.hint_es_nombre);
                            apellido.setText(R.string.txt_es_apellido);
                            apellido2.setText(R.string.hint_es_apellido);
                            sexo.setText(R.string.txt_es_sexo);
                            mucho.setText(R.string.btn_es_mucho);
                            poco.setText(R.string.btn_es_poco);
                            nohay.setText(R.string.btn_es_nada);

                }else if(checkedId ==R.id.ingles) {
                    español.setText(R.string.btn_en_español);
                    ingles.setText(R.string.btn_en_inges);
                    nombre.setText(R.string.txt_en_nombre);
                    nombre2.setText(R.string.hint_en_nombre);
                    apellido.setText(R.string.txt_en_apellido);
                    apellido2.setText(R.string.hint_en_apellido);
                    sexo.setText(R.string.txt_en_sexo);
                    mucho.setText(R.string.btn_en_mucho);
                    poco.setText(R.string.btn_en_poco);
                    nohay.setText(R.string.btn_en_nada);

                }

            }
        });

    }
}