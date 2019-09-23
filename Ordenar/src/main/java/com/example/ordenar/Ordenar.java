package com.example.ordenar;


import java.util.ArrayList;

import java.util.Collections;

import java.util.Random;

public class Ordenar {
    public static void main( String[] args){

        ArrayList<Persona> p = new ArrayList<>();

        p.add(new Persona("Sergio", 19));
        p.add(new Profesor("Andres",45,"IoT")); //lo podemos meter dentro de la lista de personas
        p.add(new Alumno("David", 23, 23));

        for(Persona x: p) {
            x.mostrar();
        }


    /*    //Generar numeros de forma aleatoria
        Random r = new Random();
        r.nextDouble();

        ArrayList<Integer> b = new ArrayList<>();
    for (int i = 0; i <10; i++){

        b.add(r.nextInt());
    }

    //Collections.sort(b);

    //para java 8tambien se puede con
    b.sort((x,y) -> x.compareTo(y));


    System.out.println(b);*/
    }

}
