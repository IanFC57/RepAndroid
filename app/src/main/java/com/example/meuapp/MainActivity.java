package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView tv;
    EditText edMin, edMax;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);

        edMin=findViewById(R.id.edMin);
        edMax=findViewById(R.id.edMax);
        b=findViewById(R.id.button);
        tv = findViewById(R.id.tv);

        b.setOnClickListener(v -> {
            String minStr=edMin.getText().toString();
            String maxStr=edMax.getText().toString();
            if (minStr.isEmpty()){
                edMin.setError("Informe o valor minímo");
                return;
            }
            if (maxStr.isEmpty()){
                edMax.setError("Informe ovalor máximo");
                return;
            }


            int min = Integer.parseInt(minStr);
            int max = Integer.parseInt(maxStr);



            Random ramdom = new Random();
//            int r = ramdom.nextInt(100); ou
            int r = ramdom.nextInt(min, max);

            tv.setText(Integer.toString(r));
            b.setText("Já clicou");
        });

    }
}