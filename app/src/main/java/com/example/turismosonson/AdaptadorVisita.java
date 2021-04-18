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

public class AdaptadorVisita extends RecyclerView.Adapter<AdaptadorVisita.viewHolder> {

    ArrayList<Visitar> listaDatosVisita;

    public AdaptadorVisita(ArrayList<Visitar> listaDatosVisita) {
        this.listaDatosVisita = listaDatosVisita;
    }

    @NonNull
    @Override
    public AdaptadorVisita.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaItemListaVisita = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lista_visitar,null,false);

        return new viewHolder(vistaItemListaVisita);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorVisita.viewHolder holder, int position) {
        holder.actualizarDatosItemVista(listaDatosVisita.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDatosVisita.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombreVisita, infVisita, precioVisita;
        ImageView fotoVisita;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            nombreVisita=itemView.findViewById(R.id.nombreVisita);
            infVisita=itemView.findViewById(R.id.infVisita);
            precioVisita=itemView.findViewById(R.id.precioVisita);
            fotoVisita=itemView.findViewById(R.id.fotoVisita);
        }

        public void actualizarDatosItemVista(final Visitar datoVisita) {

            nombreVisita.setText(datoVisita.getNombreVisita());
            infVisita.setText(datoVisita.getNombreVisita());
            precioVisita.setText(datoVisita.getPrecioVisita());
            fotoVisita.setImageResource(datoVisita.getFotoVisita());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(itemView.getContext(),PaqueteTuristico.class);
                    intent.putExtra("mensajeroVisita", datoVisita);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
