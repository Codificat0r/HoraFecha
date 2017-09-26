package com.example.fechahora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button boton;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.textView2);
        boton = (Button) findViewById(R.id.button);
        //Lo suscribimos al evento click. Pide un OnClickListener y esta clase al implementar dicha interfaz
        //ya es un OnClickListener
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Si es el boton de obtener hora y fecha, haz lo del if.
        if (v == boton) {
            actualizar();
        }
    }

    public void actualizar()
    {
        texto.setText(new Date().toString());
    }
}
