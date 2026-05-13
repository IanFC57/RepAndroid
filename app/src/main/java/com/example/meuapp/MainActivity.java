package com.example.meuapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    PlanetaController plcon = new PlanetaController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);
        lv = findViewById(R.id.ListView);
       AdapterPlaneta adaptador = new AdapterPlaneta(
               this,R.layout.item,
               plcon.ListaPlanetas()
       );


        lv.setAdapter(adaptador);


    }
}