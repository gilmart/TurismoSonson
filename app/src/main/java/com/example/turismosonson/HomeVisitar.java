package com.example.turismosonson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeVisitar extends AppCompatActivity {

    ArrayList<Visitar> listaDatosVisita = new ArrayList<>();
    RecyclerView listadoVisita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_visitar);
        getSupportActionBar().hide();

        listadoVisita=findViewById(R.id.listadoVisita);
        listadoVisita.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


        crearListadoVisita();

        AdaptadorVisita adaptadorVisita = new AdaptadorVisita(listaDatosVisita);
        listadoVisita.setAdapter(adaptadorVisita);

    }

    private void crearListadoVisita() {

        listaDatosVisita.add(new Visitar(
                "Museo Folklorico Casa de los Abuelos Sonson",
                getString(R.string.descripcionMuseoLosAbuelosVisita),
                "$15000",
                "Lugar histórico y Monumento",
                R.drawable.visitamuseoabuelos));

        listaDatosVisita.add(new Visitar(
                "Ruta Santa Monica",
                getString(R.string.descripcionRutaStaMonicaVisita),
                "10000",
                "Rutas de Senderismo",
                R.drawable.rutasantamonica));

        listaDatosVisita.add(new Visitar(
                "Museo Pablo Jaramillo",
                getString(R.string.descripcionMuseoJaramilloVisita),
                "9000",
                "Museo - Punto Emblematico",
                R.drawable.museojuanjaramillo));
    }
}