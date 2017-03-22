package com.example.usuario.appmartes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label1= (TextView) findViewById(R.id.label1);
        boton= (Button) findViewById(R.id.button);
        boton.setOnclickListener(This);
    }

    @Override
    public void OnClick(view v){
        switch (v.get.id()){
            case R.id.button;
                label1.setText("se presiona el boton");
                Toast.makeText(getApplicationContext), "se oprime el boton", Toast.LENGTH_LONG)

        }
    }
}
