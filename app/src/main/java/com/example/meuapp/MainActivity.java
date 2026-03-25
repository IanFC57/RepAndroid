package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnVoltar,btnAvancar;
    ImageView imageView;
    Integer imagens[] = new Integer[]{
            R.drawable.cachorro,
            R.drawable.gardem,
            R.drawable.happy,
            R.drawable.patinho,
            R.drawable.porquinho
    };
    int posicao=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);


        btnAvancar=findViewById(R.id.btnAvancar);
        btnVoltar=findViewById(R.id.btnVoltar);
        imageView=findViewById(R.id.imageView);

        btnAvancar.setOnClickListener(v -> {
           imageView.setImageResource(imagens[posicao]);
           posicao++;
        });
        btnVoltar.setOnClickListener(v -> {
            posicao=posicao-1;
            imageView.setImageResource(imagens[posicao]);

        });






}}