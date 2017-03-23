package com.example.usuario.appmartes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.usuario.appmartes.R.id.boton;
import static com.example.usuario.appmartes.R.id.label1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView label1;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label1= (TextView) findViewById(R.id.label1);
        boton= (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton:
                label1.setText("se presiona el boton");
                Toast.makeText(getApplicationContext(), "se oprime el boton", Toast.LENGTH_LONG).show();
                break;

        }
    }
}
