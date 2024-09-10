package com.databit.miapp02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    private EditText txtnombre;
    private Button btncontinuar;
    private Button btnsalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtnombre= (EditText) findViewById(R.id.idNombre);
        btncontinuar=(Button)  findViewById(R.id.idContinuar);
        btnsalir=(Button)  findViewById((R.id.idSalir));

        btncontinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                explicito();
            }
        });

        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void explicito(){
        Intent intent=new Intent(this,MenuActivity.class);
        String nombreparametro=txtnombre.getText().toString();
        intent.putExtra("nombre",nombreparametro);
        startActivity(intent);
    }

}