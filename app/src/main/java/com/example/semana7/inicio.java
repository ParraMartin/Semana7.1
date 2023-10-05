package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class inicio extends AppCompatActivity {




        TextView textView1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_inicio);


            textView1 = findViewById(R.id.nombre);

            Intent intent = getIntent();

            String nombre = intent.getExtras().getString("nombre");
            textView1.setText(nombre);
    }
}