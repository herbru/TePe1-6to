package com.example.gabriel.tepe1android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Console;

import layout.com.Activity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    //Metodo que se ejecuta al presionar el boton "Ingresar"
    public void presionarBoton(View vista) {
        //Recibo los Editetxts y guardo sus valores en varibales string
        EditText primerEdit = (EditText)findViewById(R.id.primerEditText);
        String primerTexto = primerEdit.getText().toString();

        EditText segundoEdit = (EditText)findViewById(R.id.segundoEditText);
        String segundoTexto = segundoEdit.getText().toString();

        //Recibo el largo de los dos strings
        int largoPrimerTexto = primerTexto.length();
        int largoSegundoTexto = segundoTexto.length();

        //Muestro los largos en un toast
        Toast.makeText(this, "El 1er texto tiene "+largoPrimerTexto+" caracteres y el 2do tiene "+largoSegundoTexto+" caracteres", Toast.LENGTH_SHORT).show();

        //Comparo el largo de los strings para ver si son iguales
        if (largoPrimerTexto==largoSegundoTexto) {
            Toast.makeText(this,"Los dos textos tienen el mismo largo",Toast.LENGTH_SHORT).show();
        }
        //Si no tienen el mismo largo, resto el primero por el segundo y muestro el valor absoluto
        else{
            int diferenciaEntreTextos = Math.abs(largoPrimerTexto-largoSegundoTexto);
            Toast.makeText(this,"El texto mas grande tiene " +diferenciaEntreTextos+ " caracteres mas que el corto", Toast.LENGTH_SHORT).show();
        }

        //Saco los espacios del principio y del final
        String primerTextoTrimeado=primerTexto.trim();
        String segundoTextoTrimeado=segundoTexto.trim();

        //Declaro e instancio una variable con los primeros 3 caracteres de cada texto concatenados
        String caracteresConcatenados = primerTextoTrimeado.substring(0,3)+segundoTextoTrimeado.substring(0,3);

        //Muestro en un Toast caracteresConcatenados
        Toast.makeText(this,"Los primeros 3 caracteres de cada texto concatenados son: "+caracteresConcatenados,Toast.LENGTH_SHORT).show();
    }

    public void tildarCheck (View vista)
    {
        Intent Caca;
        Caca = new Intent(this, Activity2.class);
        startActivity(Caca);
    }
}
