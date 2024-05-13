package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.evalua(9);

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.evalua(8);

        var peliculaDeBruno = new Pelicula("El senior de los anillos", 2001);
        peliculaDeBruno.setDuracionEnMinutos(180);
        peliculaDeBruno.evalua(10);

        Serie casaDragon = new Serie("La casa del Dragon", 2022);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(casaDragon);


        for(Titulo item: lista){
            System.out.println("Nombre: " + item.getNombre());
            if(item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3){
                System.out.println("Evaluacion: " + pelicula.getClasificacion());
                System.out.println("------------------------------------");
            }

        }

        ArrayList <String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Daria");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("lista de Artistas ordenada: " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de Titulos Ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por Fecha: " + lista);
    }
}
