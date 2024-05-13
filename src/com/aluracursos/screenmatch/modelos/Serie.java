package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Serie extends Titulo{

    //Variables
    private int temporadas;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodio;

    //Constructor
    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    //Getters and Setters
    public int getDuracionEnMinutos(){
        return temporadas*episodiosPorTemporadas*minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    //Other Methods
    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + "(" + this.getFechaDeLanzamiento() + ")";
    }

}
