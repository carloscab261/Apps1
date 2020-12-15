package com.example.eva2_2_actionsendto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txt1, txt2;
    Intent INTEN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);txt2=findViewById(R.id.txt2);

    }
    public void onClick(View v){
        String stxt1= "smsto:"+txt1.getText().toString();
        String stxt2=txt2.getText().toString();

        INTEN = new Intent(Intent.ACTION_SENDTO, Uri.parse(stxt1));

        INTEN.putExtra("sms_",stxt2);
        startActivity(INTEN);
    }
}