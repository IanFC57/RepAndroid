package com.example.meuapp;

import android.os.Bundle;
import android.widget.Button;
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
    int cont=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);
        b=findViewById(R.id.button);
        tv = findViewById(R.id.tv);
        b.setOnClickListener(v -> {
            cont=1/2;
            Random ramdom = new Random();
//            int r = ramdom.nextInt(100); ou
            int r = ramdom.nextInt(100);
            tv.setText(Integer.toString(r));
            b.setText("Já clicou");
        });
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

//        b.setText("asdf");
//        setContentView(b);

    }
}