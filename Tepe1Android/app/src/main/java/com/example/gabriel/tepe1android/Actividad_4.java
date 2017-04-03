package com.example.gabriel.tepe1android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Actividad_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_4);
    }

    public void encontrarUltimaPalabra (View vista)
    {
        EditText txtPunto4 = (EditText)findViewById(R.id.txtPunto4);

        String textoEntero = txtPunto4.toString();
        textoEntero.trim();

        String[] arrayDePalabras;
        arrayDePalabras = textoEntero.split(" ");

        String ultimaPalabra = arrayDePalabras[arrayDePalabras.length].toString();

        Toast.makeText(this, "La ultima palabra es: " + ultimaPalabra , Toast.LENGTH_SHORT).show();
    }
}
