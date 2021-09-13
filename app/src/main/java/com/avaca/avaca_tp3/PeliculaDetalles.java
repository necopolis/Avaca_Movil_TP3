package com.avaca.avaca_tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.avaca.avaca_tp3.models.Pelicula;

public class PeliculaDetalles extends AppCompatActivity {

    private PeliculaViewModel iViewModel;
    private ImageView ivFoto;
    private TextView tvTitulo, tvSinopsis, tvReparto, tvDirector;
    private int idPelicula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula_detalles);
        iViewModel = new PeliculaViewModel();
        idPelicula = getIntent().getExtras().getInt("id");
        inicializarViews();
        cargarDetallesInmueble();
    }

    private void inicializarViews() {
        ivFoto = findViewById(R.id.ivFotoDetalles);
        tvTitulo= findViewById(R.id.tvTituloDetalles);
        tvSinopsis = findViewById(R.id.tvSinopsisDetalles);
        tvDirector = findViewById(R.id.tvDirectorDetalles);
        tvReparto = findViewById(R.id.tvRepartoDetalles);
    }

    private void cargarDetallesInmueble() {
        Pelicula i = iViewModel.getById(idPelicula);

        if (i != null) {
            ivFoto.setImageResource(i.getIdFoto());
            tvTitulo.setText("Titulo: "+i.getTitulo());
            tvSinopsis.setText("Sinopsis: "+i.getSinopsis());
            tvReparto.setText("Reparto: "+i.getReparto());
            tvDirector.setText("Director/es: "+i.getDirector());
        }
    }
}
