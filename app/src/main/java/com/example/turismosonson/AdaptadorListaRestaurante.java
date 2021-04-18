package com.example.turismosonson;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorListaRestaurante extends RecyclerView.Adapter<AdaptadorListaRestaurante.viewHolder> {

    ArrayList<Restaurante> listaDeDatosRestaurante;

    public AdaptadorListaRestaurante(ArrayList<Restaurante> listaDeDatosRestaurante) {
        this.listaDeDatosRestaurante = listaDeDatosRestaurante;
    }


    @NonNull
    @Override
    public AdaptadorListaRestaurante.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaListadoRestaurante= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista_restaurante,null,false);

        return new viewHolder(vistaListadoRestaurante);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorListaRestaurante.viewHolder holder, int position) {
        holder.actualizarDatosDeItemRestaurante(listaDeDatosRestaurante.get(position));

    }

    @Override
    public int getItemCount() {
        return listaDeDatosRestaurante.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombreRestaurante, infRestaurante, precio;
        ImageView fotoRestaurante;


        public viewHolder(@NonNull final View itemView) {
            super(itemView);
            nombreRestaurante=itemView.findViewById(R.id.nombreRestaurante);
            infRestaurante =itemView.findViewById(R.id.infRestaurante);
            precio = itemView.findViewById(R.id.precioRestaurante);
            fotoRestaurante = itemView.findViewById(R.id.fotoRestaurante);

        }

        public void actualizarDatosDeItemRestaurante(final Restaurante datoRestaurante) {

            nombreRestaurante.setText(datoRestaurante.getNombreRestaurante());
            infRestaurante.setText(datoRestaurante.getInfRestaurante());
            precio.setText(datoRestaurante.getPrecio());
            fotoRestaurante.setImageResource(datoRestaurante.getFotoRestaurante());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(itemView.getContext(),PaqueteTuristico.class);
                    intent.putExtra("restaurante", datoRestaurante);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
