package com.example.turismosonson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;


public class homeRestaurante extends AppCompatActivity {

    ArrayList<Restaurante> listaDeDatosRestaurante = new ArrayList<>();
    RecyclerView listadoRestaurante;
    ImageView fotoRestauranteLaCocoa;
    /*PhotoViewAttacher photoViewAttacher; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_restaurante);
        getSupportActionBar().hide();

        listadoRestaurante = findViewById(R.id.listadoRestaurante);
        listadoRestaurante.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
       /*fotoRestauranteLaCocoa =(ImageView) findViewById(R.id.fotoRestauranteLaCocoa);
        photoViewAttacher = new PhotoViewAttacher(fotoRestauranteLaCocoa); */

        createListado();

        AdaptadorListaRestaurante adaptador= new AdaptadorListaRestaurante(listaDeDatosRestaurante);
        listadoRestaurante.setAdapter(adaptador);
    }

    private void createListado() {

            listaDeDatosRestaurante.add(new Restaurante(
                    "La Cocoa",
                    getString(R.string.descripcionLaCocoaRestaurante),
                    "RANGO DE PRECIOS+\n COP 10$ - COP 50$\n",
                    "Mexicana, Africana, Parrilla, Bar de vinos",
                    R.drawable.lacocoacafebarmenu));

        listaDeDatosRestaurante.add(new Restaurante(
                "Dr Burguer",
                getString(R.string.descripcionDrBurguerRestaurante),
                "RANGO DE PRECIOS+\n COP 9$- COP 30$\n",
                "Comida Rapida - Grocery Store",
                R.drawable.restaurantedrburguer2));

        listaDeDatosRestaurante.add(new Restaurante(
                "El Tesoro",
                getString(R.string.descripcionElTesoroRestaurante),
                "RANGO DE PRECIOS+\n COP 20 - COP 60$\n",
                "\n Comidas Colombiana\n",
                R.drawable.restauranteeltesoro1));

        listaDeDatosRestaurante.add(new Restaurante(
                "Llamarada",
                getString(R.string.descripcionLaLlamaradaRestaurante),
                "RANGO DE PRECIOS+\n COP 15 - COP 40$\n",
                "\n Restaurante y Pizzería \n",
                R.drawable.restaurantelallamarada1));
    }

    }




