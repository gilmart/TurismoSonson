package com.example.turismosonson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class PaqueteTuristico extends AppCompatActivity {


    EditText numPersonas;
    TextView nombreRestauranteMain, infRestauranteMain, precioRestauranteMain, descripcionRestauranteMain, tvTotal, tvtransporte, tvCostoPosada, tvCostoRestaurante, tvCostoVisita, precioRestauranteaMain;
    RadioButton  rbavion, rbbus, rbtaxi, rbElTesoro, rbLaLlamarada, rbGio,  rbDrBurguer, rbCocoa, rbElTahami, rbMuseoJaramillo, rbMuseoAbuelos, rbStaMonica;
    Button btCalcular;
    ImageView fotoRestauranteMain;


    Restaurante restauranteM;
    Posada mensajeroPosada;
    Visitar mensajeroVisita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paquete_turistico);
        getSupportActionBar().hide();


        nombreRestauranteMain = findViewById(R.id.nombreRestauranteMain);
        precioRestauranteaMain = findViewById(R.id.precioRestauranteMain);
        infRestauranteMain = findViewById(R.id.infRestauranteMain);
        descripcionRestauranteMain = findViewById(R.id.descripcionRestauranteMain);
        fotoRestauranteMain = findViewById(R.id.fotoRestauranteMain);


        restauranteM = (Restaurante)getIntent().getSerializableExtra("restaurante");
        mensajeroPosada = (Posada) getIntent().getSerializableExtra("mensajeroPosada");
        mensajeroVisita = (Visitar) getIntent().getSerializableExtra("mensajeroVisita");

        nombreRestauranteMain.setText(restauranteM.getNombreRestaurante());
        precioRestauranteaMain.setText(restauranteM.getPrecio());
        infRestauranteMain.setText(restauranteM.getInfRestaurante());
        descripcionRestauranteMain.setText(restauranteM.getInfRestaurante());
        fotoRestauranteMain.setImageResource(restauranteM.getFotoRestaurante());


        numPersonas = findViewById(R.id.numPersonas);
        nombreRestauranteMain = findViewById(R.id.nombreRestauranteMain);
        infRestauranteMain = findViewById(R.id.infRestauranteMain);
        precioRestauranteMain = findViewById(R.id.precioRestauranteMain);
        descripcionRestauranteMain = findViewById(R.id.descripcionRestauranteMain);

        rbavion = findViewById(R.id.rbavion);
        rbbus = findViewById(R.id.rbbus);
        rbtaxi = findViewById(R.id.rbtaxi);

        rbElTesoro = findViewById(R.id.rbElTesoro);
        rbGio = findViewById(R.id.rbGio);
        rbLaLlamarada = findViewById(R.id.rbLaLlamarada);

        rbElTahami = findViewById(R.id.rbElTahami);
        rbDrBurguer = findViewById(R.id.rbDrBurguer);
        rbCocoa = findViewById(R.id.rbLaCocoa);

        tvtransporte = findViewById(R.id.tvtransporte);
        tvCostoPosada = findViewById(R.id.tvCostoPosada);
        tvCostoRestaurante = findViewById(R.id.tvcostoRestaurante);
        tvCostoVisita = findViewById(R.id.tvCostoVisita);

        rbMuseoJaramillo = findViewById(R.id.rbMuseoJaramillo);
        rbMuseoAbuelos = findViewById(R.id.rbMuseoAbuelos);
        rbStaMonica = findViewById(R.id.rbStaRita);

        btCalcular = findViewById(R.id.btcalcular);
        tvTotal = findViewById(R.id.tvTotal);
        fotoRestauranteMain = findViewById(R.id.fotoRestaurante);

    }


    public void calcular_transporte(View view) {
        if (rbtaxi.isChecked())
            tvtransporte.setText("60000");

        else if (rbbus.isChecked())
            tvtransporte.setText("9000");
        else
            tvtransporte.setText("250000");
    }
    public void calcular_posada(View view) {
        if (rbLaLlamarada.isChecked())
            tvCostoPosada.setText("60000");

        else if (rbGio.isChecked())
            tvCostoPosada.setText("9000");
        else
            tvCostoPosada.setText("250000");
    }

    public void calcular_restaurante(View view) {
        if (rbCocoa.isChecked())
            tvCostoRestaurante.setText("25000");

        else if (rbDrBurguer.isChecked())
            tvCostoRestaurante.setText("30000");

        else
            tvCostoRestaurante.setText("15000");
    }

        public void calcular_visita(View view) {
            if (rbStaMonica.isChecked() == true)
                tvCostoVisita.setText("25000");

            else if (rbMuseoAbuelos.isChecked())
                tvCostoVisita.setText("30000");

            else
                tvCostoVisita.setText("15000");
        }


           public void calcular_total (View view)
           {

               if(numPersonas.getText().toString().isEmpty())
               {
                   Toast.makeText(this,"La cantidad de personas es necesaria", Toast.LENGTH_LONG).show();
                   numPersonas.requestFocus();
               }

               else {
                   int num_personas, transporte, restaurante, posada, visita, total_visita, total;

                   transporte = Integer.parseInt(tvtransporte.getText().toString());
                   restaurante = Integer.parseInt(tvCostoRestaurante.getText().toString());
                   posada = Integer.parseInt((tvCostoPosada.getText().toString()));
                   visita = Integer.parseInt((tvCostoVisita.getText().toString()));
                   num_personas = Integer.parseInt(numPersonas.getText().toString());


                       total = (transporte + restaurante+ posada + visita) * num_personas ;

                       tvTotal.setText(String.valueOf(total));
                   }
               }

    public void limpiar_campos(View view)
    {
        numPersonas.setText("");
        tvCostoRestaurante.setText("");
        tvtransporte.setText("");
        tvCostoVisita.setText("");
        tvTotal.setText("");
        tvCostoPosada.requestFocus();

    }
}



