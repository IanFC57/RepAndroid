package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText edAlt;
    EditText edPes;
    TextView Calculo;

    double IMC;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);

        edAlt = findViewById(R.id.Altura);
        edPes = findViewById(R.id.Peso);
        b = findViewById(R.id.btnCalculo);
        Calculo = findViewById(R.id.Calculo);

        b.setOnClickListener(v -> );

    }
}