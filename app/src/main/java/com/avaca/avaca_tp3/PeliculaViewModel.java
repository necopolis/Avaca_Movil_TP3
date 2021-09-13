package com.avaca.avaca_tp3;

import androidx.lifecycle.ViewModel;

import com.avaca.avaca_tp3.models.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class PeliculaViewModel extends ViewModel {

    private List<Pelicula> peliculas;

    public PeliculaViewModel() {
        peliculas = new ArrayList<>();
        peliculas.add(new Pelicula(1,"Sueño de libertad",
                "Basada en la novela corta de Stephen King, Rita Hayworth y la redención de Shawshank, el film abarca una mirada optimista de la vida, contando la historia de dos amigos, Robbins y Freeman, en una prisión. Se enfatiza en el no perder las esperanzas, incluso en la más inhóspitas situaciones. Fue nominada a múltiples premios, incluyendo siete premios Oscar, con el de mejor película, sin embargo, no obtuvo ningún premio, en parte por competir con otros dos colosos de la época: Forrest Gump y Pulp Fiction.",
                R.drawable.pelicula_1,
                "Tim Robbins\n"+
                        ", Morgan Freeman\n"+
                        " y Bob Gunton",
                "Frank Darabont"));
        peliculas.add(new Pelicula(2,
                "Matrix",
                "El programador informático Thomas Anderson, más conocido en el mundo de los \"hacker\" como Neo, está en el punto de mira del temible agente Smith. Otros dos piratas informáticos, Trinity y Morfeo, se ponen en contacto con Neo para ayudarlo a escapar. Matrix te posee. Sigue al conejo blanco",
                R.drawable.pelicula_2,
                "Keanu Reeves\n" +
                        "Laurence Fishburne\n" +
                        "Carrie-Anne Moss\n" +
                        "Hugo Weaving",
                "Lana Wachowski\n" +
                        "Lilly Wachowski"));
        peliculas.add(new Pelicula(3,
                "Acerca del tiempo",
                "Cuando Tim Lake cumple 21 años, su padre le dice un secreto: los hombres de su familia pueden viajar por el tiempo. A pesar de que él no puede cambiar la historia, Tim decide mejorar su vida buscando una novia. Él conoce a Mary, se enamora y finalmente se gana su corazón con los viajes en el tiempo y un poco de astucia. Sin embargo, mientras su inusual vida progresa, Tim descubre que su habilidad especial no puede protegerlos de los problemas diarios de la vida.",
                R.drawable.pelicula_3,
                "Domhnall Gleeson\n" +
                        "Rachel McAdams\n" +
                        "Bill Nighy\n" +
                        "Margot Robbie\n" +
                        "Lindsay Duncan\n" +
                        "Tom Hollander",
                "Richard Curtis"));
        peliculas.add(new Pelicula(4,
                "Al filo del Mañana",
                "En un futuro no muy lejano, una raza de alienígenas invade la Tierra y ninguna fuerza militar es capaz de impedirlo. Al comandante William Cage, quien nunca ha entrado en combate, le encargan una misión casi suicida en la que pierde la vida. Entonces entra en un bucle temporal en el que revive la batalla y su muerte una y otra vez. Las múltiples batallas que libra lo hacen cada vez más hábil en su lucha contra los alienígenas y hacen que él y su compañera estén más cerca de vencerlos.",
                R.drawable.pelicula_4,
                "Tom Cruise\n" +
                        "Emily Blunt\n" +
                        "Bill Paxton\n" +
                        "Brendan Gleeson",
                "Doug Liman"));
        peliculas.add(new Pelicula(5,
                "Transformer 5",
                "La guerra entre los Transformers y los humanos amenaza con destruir la Tierra. Con el gigante Optimus Prime muy lejos, realizando una misión espacial, el futuro del planeta depende ahora de la extraña alianza forjada entre el inventor Cade Yeager, Bumblebee, un lord inglés y un profesor de Oxford.",
                R.drawable.pelicula_5,
                "Mark Wahlberg\n" +
                        "Josh Duhamel\n" +
                        "Laura Haddock\n" +
                        "Anthony Hopkins\n" +
                        "Isabela Moner\n" +
                        "Jerrod Carmichael\n" +
                        "Peter Cullen\n" +
                        "Santiago Cabrera\n" +
                        "Stanley Tucci\n" +
                        "Liam Garrigan\n" +
                        "Mitch Pileggi\n" +
                        "Glenn Morshower",
                "Michael Bay"));
    }

    public List<Pelicula> getInmuebles() {
        if (peliculas == null) {
            peliculas = new ArrayList<>();
        }
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
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
