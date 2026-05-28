package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editAltura, editPeso;
    Button btnCalcular;
    TextView tvResultado, textClassificacao;
    ImageView imageClassificacao;
    double calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);

        editPeso=findViewById(R.id.editPeso);
        editAltura=findViewById(R.id.editAltura);
        tvResultado=findViewById(R.id.tvResultado);
        imageClassificacao=findViewById(R.id.imageClassificacao);
        textClassificacao = findViewById(R.id.textClassificacao);
        btnCalcular=findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(v -> {
            double peso=Double.parseDouble(editPeso.getText().toString());
            double altura=Double.parseDouble(editAltura.getText().toString());

            calculo= peso / (altura*altura);

            tvResultado.setText(String.format("Seu IMC é %.2f", calculo));
            if (calculo < 18.5) {
                textClassificacao.setText("Classificação: Abaixo do peso");
                imageClassificacao.setImageResource(R.drawable.abaixopeso);
            } else if (calculo >= 18.5 && calculo <= 24.9) {
                textClassificacao.setText("Classificação: Peso normal");
                imageClassificacao.setImageResource(R.drawable.normal);
            } else if (calculo >= 25 && calculo <= 29.9) {
                textClassificacao.setText("Classificação: Sobrepeso");
                imageClassificacao.setImageResource(R.drawable.sobrepeso);
            } else if (calculo >= 30 && calculo <= 34.9) {
                textClassificacao.setText("Classificação: Obesidade grau 1");
                imageClassificacao.setImageResource(R.drawable.obesidade1);
            } else if (calculo >= 35 && calculo <= 39.9) {
                textClassificacao.setText("Classificação: Obesidade grau 2");
                imageClassificacao.setImageResource(R.drawable.obesidade2);
            } else {
                textClassificacao.setText("Classificação: Obesidade grau 3");
                imageClassificacao.setImageResource(R.drawable.obesidade3);
            }

        });




    }
}