package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] dat = {
            "Chihuahua",
            "Arboledo",
            "Delicias",
            "Juarez",
            "Tijuana",
            "Mexicali",
            "Jimenez",
            "Durango",
            "Nuevo leon",
            "monterrey",
            "Casas grandes",


    }
    ListView Da;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Da = findViewById(R.id.Da);
        intent = new Intent(this, DetailActivity.class);
        Da.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dat));

        Da.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Bundle bundle = new Bundle();
                bundle.putString("Ciudad", dat[i]);
                bundle.putInt("Posición", i);
                intent.putExtra(bundlee);
                startActivity(intent);
            }
        });
    }
}