package com.example.gabriel.tepe1android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    //Metodo que se ejecuta al presionar el boton "Ingresar"
    public void presionarBoton(View vista)
    {
        //Recibo los Editetxts y guardo sus valores en varibales string
        EditText primerEdit = (EditText)findViewById(R.id.primerEditText);
        String primertexto = primerEdit.getText().toString();

        EditText segundoEdit = (EditText)findViewById(R.id.segundoEditText);
        String segundoTexto = segundoEdit.getText().toString();

        //Recibo el largo de los dos strings
        int largoPrimerTexto = primertexto.length();
        int largoSegundoTexto = segundoTexto.length();

        //Muestro los largos en un toast
        Toast.makeText(this, "El 1er texto tiene "+largoPrimerTexto+" caracteres y el 2do tiene "+largoSegundoTexto+" caracteres", Toast.LENGTH_SHORT).show();
    }
}
