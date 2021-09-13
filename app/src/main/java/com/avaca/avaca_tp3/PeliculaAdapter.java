package com.avaca.avaca_tp3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.avaca.avaca_tp3.models.Pelicula;

import java.util.List;

public class PeliculaAdapter extends RecyclerView.Adapter<PeliculaAdapter.MiViewHolder> {

    private LayoutInflater layoutInflater;
    private Context context;
    private List<Pelicula> peliculas;

    public PeliculaAdapter(
            Context context,
            List<Pelicula> peliculas
    ) {
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
        this.peliculas = peliculas;
    }

    @NonNull
    @Override // Referenciar a la vista item_pelicula y pasarla a la clase MiViewHolder
    public MiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.item_pelicula, parent, false);
        return new MiViewHolder(view);
    }

    @Override // Se ejecuta por cada inmueble de la lista
    public void onBindViewHolder(@NonNull MiViewHolder holder, int position) {
        Pelicula i = peliculas.get(position);
        holder.tvTitulo.setText(i.getTitulo());
        holder.tvSinopsis.setText("Sinopsis: "+i.getSinopsis());
        holder.ivFoto.setImageResource(i.getIdFoto());
        holder.cvInmueble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PeliculaDetalles.class);
                intent.putExtra("id", i.getId());
                context.startActivity(intent);
            }
        });
    }

    @Override // Retorna la cardinalidad de la lista de peliculas
    public int getItemCount() {
        return peliculas.size();
    }

    public class MiViewHolder extends RecyclerView.ViewHolder {

        private CardView cvInmueble;
        private TextView tvTitulo, tvSinopsis;
        private ImageView ivFoto;


        public MiViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvSinopsis = itemView.findViewById(R.id.tvSinopsis);
            ivFoto = itemView.findViewById(R.id.ivFoto);
            cvInmueble = itemView.findViewById(R.id.cvInmueble);
        }
    }
}
