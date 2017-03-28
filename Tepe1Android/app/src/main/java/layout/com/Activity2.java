package layout.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gabriel.tepe1android.R;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void ingresarActivity2 (View view)
    {
        CheckBox check = (CheckBox)findViewById(R.id.checkActivity2);

        EditText txtIngresar = (EditText)findViewById(R.id.EditActivity2);

        String textoIngresado = txtIngresar.getText().toString();

        int cantdeA = 0;


        int comparador = 0;

        for (int i = 0; i < textoIngresado.length(); i++)
        {

            if (textoIngresado.substring(i, i+1).compareTo("a") == 0)
            {

                cantdeA++;
                //Toast.makeText(this, "ANDA EL IF", Toast.LENGTH_SHORT).show();
            }
        }
        Toast.makeText(this, "Hay " + cantdeA   + " letras A", Toast.LENGTH_SHORT).show();

        if (check.isChecked()  &&  textoIngresado.length() <= 10)
        {
            Toast.makeText(this, "Mensaje de advertencia", Toast.LENGTH_SHORT).show();
        }
    }
}
