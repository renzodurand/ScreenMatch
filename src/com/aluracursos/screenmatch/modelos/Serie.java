package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }


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

    @Override
    public String toString() {
        return "Serie: " + this.getNombre() + "(" + this.getFechaDeLanzamiento() + ")";
    }

}
