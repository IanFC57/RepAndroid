package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvResultado, textClassificacao;
    private ImageView imageClassificacao;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        tvResultado = findViewById(R.id.TVResultado2);
        textClassificacao = findViewById(R.id.textClassificacao);
        imageClassificacao = findViewById(R.id.imageView);
        btnVoltar = findViewById(R.id.btnVoltar);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            double imc = bundle.getDouble("VALOR_IMC", 0.0);


            tvResultado.setText(String.format("%.2f", imc));


            if (imc < 18.5) {
                textClassificacao.setText("Classificação: Abaixo do peso");
                imageClassificacao.setImageResource(R.drawable.abaixopeso);
            } else if (imc >= 18.5 && imc <= 24.9) {
                textClassificacao.setText("Classificação: Peso normal");
                imageClassificacao.setImageResource(R.drawable.normal);
            } else if (imc >= 25 && imc <= 29.9) {
                textClassificacao.setText("Classificação: Sobrepeso");
                imageClassificacao.setImageResource(R.drawable.sobrepeso);
            } else if (imc >= 30 && imc <= 34.9) {
                textClassificacao.setText("Classificação: Obesidade grau 1");
                imageClassificacao.setImageResource(R.drawable.obesidade1);
            } else if (imc >= 35 && imc <= 39.9) {
                textClassificacao.setText("Classificação: Obesidade grau 2");
                imageClassificacao.setImageResource(R.drawable.obesidade2);
            } else {
                textClassificacao.setText("Classificação: Obesidade grau 3");
                imageClassificacao.setImageResource(R.drawable.obesidade3);
            }
        }


        btnVoltar.setOnClickListener(v -> {
            finish();
        });
    }
}