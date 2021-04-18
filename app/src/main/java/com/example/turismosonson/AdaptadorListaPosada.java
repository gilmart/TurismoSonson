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

public class AdaptadorListaPosada extends RecyclerView.Adapter<AdaptadorListaPosada.viewHolder> {

        ArrayList<Posada> listaDatosPosada;

    public AdaptadorListaPosada(ArrayList<Posada> listaDatosPosada) {
        this.listaDatosPosada = listaDatosPosada;
    }

    @NonNull
    @Override
    public AdaptadorListaPosada.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View vistaItemPosada= LayoutInflater.from(parent.getContext())
               .inflate(R.layout.item_lista_posada, null,false);
        return new viewHolder(vistaItemPosada);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorListaPosada.viewHolder holder, int position) {
        holder.actualizarDatosItemPosada(listaDatosPosada.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDatosPosada.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombrePosada, precioPosada, infPosada;
        ImageView fotoPosada;

        public viewHolder(@NonNull final View itemView) {
            super(itemView);

            nombrePosada=itemView.findViewById(R.id.nombrePosada);
            precioPosada=itemView.findViewById(R.id.precioPosada);
            infPosada=itemView.findViewById(R.id.infPosada);
            fotoPosada=itemView.findViewById(R.id.fotoPosada);

        }

        public void actualizarDatosItemPosada(final Posada datosposada) {

            nombrePosada.setText(datosposada.getNombrePosada());
            precioPosada.setText(datosposada.getPrecioPosada());
            infPosada.setText(datosposada.getInfPosada());
            fotoPosada.setImageResource(datosposada.getFotoPosada());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(itemView.getContext(),PaqueteTuristico.class);
                    intent.putExtra("mensajeroPosada",datosposada);
                    itemView.getContext().startActivity(intent);
                }
            });

        }
    }
}
