package com.example.ordenar;


import java.util.ArrayList;

import java.util.Collections;

import java.util.Random;

public class Ordenar {
    public static void main( String[] args){

        ArrayList<Persona> p = new ArrayList<>();
        p.add(new Profesor( nombre: "Andres", edad: 45,asignatura:"programacion"));




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
