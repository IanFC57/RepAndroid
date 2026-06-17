package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editAltura, editPeso;
    private Button btnCalcular;
    private double peso, altura, calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(v -> {
            String pesoTexto = editPeso.getText().toString();
            String alturaTexto = editAltura.getText().toString();

            peso = Double.parseDouble(pesoTexto);
            altura = Double.parseDouble(alturaTexto);


            calculo = peso / (altura * altura);
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            Bundle bundle = new Bundle();
            bundle.putDouble("VALOR_IMC", calculo);
            i.putExtras(bundle);
            startActivity(i);
        });
    }
}