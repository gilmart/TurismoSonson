package com.example.turismosonson;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomePosada extends AppCompatActivity {

    ArrayList<Posada> listaDatosPosada=new ArrayList<>();
    RecyclerView listadoPosada;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_posada);
        getSupportActionBar().hide();

        listadoPosada=findViewById(R.id.listadoPosada);
        listadoPosada.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearListadoPosada();

       AdaptadorListaPosada adaptador = new AdaptadorListaPosada(listaDatosPosada);
       listadoPosada.setAdapter(adaptador);
    }

    private void crearListadoPosada() {

        listaDatosPosada.add(new Posada(
                "El Tesoro",
                getString(R.string.descripcionElTesoroPosada),
                "35000 - 50000",
                "Hotel Posada",
                R.drawable.posadahotelmaravilla));

        listaDatosPosada.add(new Posada(
                "Hotel Gio Sonson",
                getString(R.string.descripcionHotelGioPosada),
                "30000 - 45000",
                "Posada -Resort",
                R.drawable.posadahotelgio1));

        listaDatosPosada.add(new Posada(
                "Hotel Tahami",
                getString(R.string.descripcionHotelTahamiPosada),
                "40000 - 70000",
                "Posada",
                R.drawable.posadahoteltahami));

    }

}