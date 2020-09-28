package com.example.eva1_14_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lstVwWeather;
    Weather[] weathers = {
            new Weather("chiuahua", (double) 20, "Lluvia ligera", R.drawable.light_rain),
            new Weather("Cd. Juarez", (double)21, "nublado", R.drawable.cloudy),
            new Weather("Camargo", (double)23, "Vientos moderados", R.drawable.atmospher),
            new Weather("Parral", (double)22, "Lluvia ligera", R.drawable.light_rain),
            new Weather("Jimenez", (double)19, "Soleado", R.drawable.sunny),
            new Weather("cuahutemoc", (double)25, "Nevado", R.drawable.snow),
            new Weather("Casas grandes", (double)22, "Soelado", R.drawable.sunny),
            new Weather("ojinaga", (double)21, "Lluvia ligera", R.drawable.light_rain),
            new Weather("creel", (double)25, "nublado", R.drawable.cloudy),
            new Weather("Batopilas", (double)18, "Lluvias intensas", R.drawable.thunderstorm)

            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwWeather =  findViewById(R.id.lstVwWeather);
        lstVwWeather.setAdapter(new WeatherAdapter(
                this,
                R.layout.layout_weather,
                weathers
        ));
    }
}