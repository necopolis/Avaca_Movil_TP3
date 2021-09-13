package com.avaca.avaca_tp3.models;

public class Pelicula {

    private int id;
    private String director;
    private String reparto;
    private String titulo;
    private String sinopsis;
    private int idFoto;

    public Pelicula(int id, String titulo, String sinopsis, int idFoto, String reparto, String director) {
        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.idFoto = idFoto;
        this.director = director;
        this.reparto = reparto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitulo() {

        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getIdFoto() {

        return idFoto;
    }

    public void setIdFoto(int idFoto) {

        this.idFoto = idFoto;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }
}

