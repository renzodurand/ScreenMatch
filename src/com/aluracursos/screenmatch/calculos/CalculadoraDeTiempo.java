package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    //Variables
    private int tiempoTotal;

    //Getters and Setters
    public int getTiempoTotal() {
        return tiempoTotal;
    }

    //Other methods
    public void incluye(Titulo titulo){
       tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
