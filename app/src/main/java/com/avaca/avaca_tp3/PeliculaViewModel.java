package com.avaca.avaca_tp3;

import androidx.lifecycle.ViewModel;

import com.avaca.avaca_tp3.models.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class PeliculaViewModel extends ViewModel {

    private List<Pelicula> peliculas;

    public PeliculaViewModel() {
        peliculas = new ArrayList<>();
        peliculas.add(new Pelicula(1,"Sueño de libertad", "Algo de sueños de libertad, protagonizada por varios heroes y asi como uno como otro asi y asdjjas asjdjasd ajasdn asdjasjd jasdjajs jasdjajsd jasdjasjd ajsdjasd", R.drawable.pelicula_1,"Tim Robbins, Morgan Freeman y Bob Gunton", "Frank Darabont"));
        peliculas.add(new Pelicula(2,"Matrix", "Algo de Matrix", R.drawable.pelicula_2, "Tim Robbins, Morgan Freeman y Bob Gunton", "Frank Darabont"));
        peliculas.add(new Pelicula(3,"Acerca del tiempo", "Algo de Acerca del tiempo", R.drawable.pelicula_3, "Tim Robbins, Morgan Freeman y Bob Gunton", "Frank Darabont"));
        peliculas.add(new Pelicula(4,"Al filo del Mañana", "Algo de Al filo del mañana", R.drawable.pelicula_4, "Tim Robbins, Morgan Freeman y Bob Gunton", "Frank Darabont"));
        peliculas.add(new Pelicula(5, "Transformer 5", "Algo de Transformer", R.drawable.pelicula_5, "Tim Robbins, Morgan Freeman y Bob Gunton", "Frank Darabont"));
    }

    public List<Pelicula> getInmuebles() {
        if (peliculas == null) {
            peliculas = new ArrayList<>();
        }
        return peliculas;
    }

    public void setInmuebles(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public Pelicula getById(int id) {
        Pelicula pelicula = null;
        for (Pelicula i: peliculas) {
            if (id == i.getId()) {
                pelicula = i;
            }
        }
        return pelicula;
    }
}
