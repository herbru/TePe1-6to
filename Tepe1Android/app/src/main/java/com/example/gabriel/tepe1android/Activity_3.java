package com.example.gabriel.tepe1android;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void presionarActivity4 (View vista)
    {
        Intent nuevaActividad;
        nuevaActividad = new Intent(this,Actividad_4.class);
        startActivity(nuevaActividad);
    }

    public void DarVuelta (View view)
    {
        //Recibo el contenido del EditText y lo convierto a string
        EditText txtDarVuelta = (EditText)findViewById(R.id.EditTextDarVuelta);

        String  paraDarVuelta;
        paraDarVuelta = txtDarVuelta.toString();
        paraDarVuelta = paraDarVuelta.trim();

        String paraMostrar = "";

        //hago una repetitiva for que agarre las letras de una palabra desde la ultima a la primera y se las vaya asignando a xMostrar
        for (int i=paraDarVuelta.length() ; i > 0 ; i--)
        {
            char caracterActual = paraDarVuelta.charAt(i);
            paraMostrar+=caracterActual;
        }

        //Muestro el texto dado vuelta
        Toast.makeText(this, paraMostrar , Toast.LENGTH_SHORT).show();
    }
}
