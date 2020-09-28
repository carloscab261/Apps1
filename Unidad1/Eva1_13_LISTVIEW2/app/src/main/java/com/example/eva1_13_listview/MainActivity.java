package com.example.eva1_13_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView Lista;
    //Datos
    String[] datos = {
            "Tacos",
            "Montados",
            "Tortas",
            "Hamburguesar",
            "Bola de arroz",
            "Carne Asada",
            "Pollo",
            "Papas",
            "Pasta",
            "Quesadilla con queso",
            "Quesadilla sin queso",
            "Huaraches",
            "Flautas",
            "Mole",
            "Pollo",
            "Papas",
            "Pasta",
            "Quesadilla con queso",
            "Quesadilla sin queso",
            "Huaraches",
            "Flautas",
            "Mole"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lista = findViewById(R.id.Lista);
        Lista.setAdapter(new ArrayAdapter<String >(this, android.R.layout.simple_expandable_list_item_1, datos));

        Lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),datos[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}