package com.example.turismosonson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button restaurante, posada, visitar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        restaurante=findViewById(R.id.botonRestaurante);
        posada= findViewById(R.id.botonPosada);
        visitar=findViewById(R.id.botonVisitar);

    }
        public void IrRestaurante (View view){
            Intent restaurante = new Intent(this,homeRestaurante.class);
            startActivity(restaurante);
    }

        public void IrPosada (View view){
            Intent posada = new Intent(this, HomePosada.class);
            startActivity(posada);
        }

        public void IrVisitar (View view) {
        Intent visitar = new Intent(this,HomeVisitar.class);
        startActivity(visitar);
    }


}