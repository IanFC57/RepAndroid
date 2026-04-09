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
    TextView tvResultado;
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
        btnCalcular=findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(v -> {
            double peso=Double.parseDouble(editPeso.getText().toString());
            double altura=Double.parseDouble(editAltura.getText().toString());

            calculo= peso / (altura*altura);

            tvResultado.setText(String.format("Seu IMC é %.2f", calculo));
//            if (tvResultado < 18.5){
//                imageClassificacao.setImageResource();
//            }

        });




    }
}