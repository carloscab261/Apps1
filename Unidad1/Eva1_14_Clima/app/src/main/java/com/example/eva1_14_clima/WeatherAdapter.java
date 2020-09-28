package com.example.eva1_14_clima;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class WeatherAdapter extends ArrayAdapter<Weather> {

    private Context context;
    private int rescource;
    private Weather[] objects;
    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Weather[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.rescource = resource;
        this.objects = objects;





    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){ //primera vez que ejecutamos la app. crear las filas
            //Inflar --> inflate
            convertView = ((Activity)context).getLayoutInflater().inflate(rescource, parent, false);
            TextView txtVwCity, txtVwTemp, txtVwDesc;
            ImageView imgVwImage;
            txtVwCity = convertView.findViewById(R.id.txtVwCity);
            txtVwTemp = convertView.findViewById(R.id.txtVwTemp);
            txtVwDesc = convertView.findViewById(R.id.txtVwDesc);
            imgVwImage = convertView.findViewById(R.id.imgVwImage);

            txtVwCity.setText(objects[position].getCity());
            txtVwTemp.setText((objects[position].getTemp()) + " °C");
            txtVwDesc.setText(objects[position].getDesc());
            imgVwImage.setImageResource(objects[position].getImageWeather());



        }
        return convertView;
    }
}
