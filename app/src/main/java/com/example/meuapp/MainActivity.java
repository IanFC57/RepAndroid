package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        getString(R.string.app_name);

        ed=findViewById(R.id.editTextmsg);

        b=findViewById(R.id.btnMandar);
        b.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(),ActivityB.class);
            String msg= ed.getText().toString();
            i.putExtra("msg",msg);
            startActivity(i);

        });

        public void iniciaNovaActivity()
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//        Button b = new Button(this);
//        b.setText("asdf");
//        setContentView(b);

    }
}