package com.databit.miapp02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PerroActivity extends AppCompatActivity {
    private EditText edad;
    private TextView resultadotext;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perro);
        edad = (EditText) findViewById(R.id.idEdad);
        resultadotext=(TextView) findViewById(R.id.idlabel);
        enviar=(Button) findViewById(R.id.idCalcular);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edadvar=edad.getText().toString();
                if (!edadvar.isEmpty()) {
                    int ageInt = Integer.parseInt(edadvar);
                    int resultado = ageInt * 7;
                    String resultadoString = "Si fueras perro , tu edad sería de :" + resultado + " años";
                    resultadotext.setText(resultadoString);
                } else {
                    Toast.makeText(PerroActivity.this, "Debes insertar una edad", Toast.LENGTH_SHORT).show();
                }


            }
        });



    }


}