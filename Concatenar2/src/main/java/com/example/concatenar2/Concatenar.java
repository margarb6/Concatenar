package com.example.concatenar2;

import java.util.ArrayList;

public class Concatenar {
    public static void main( String[] args){
        /*String a[] = {"hola","mundo"};

        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        //bucle corto
        for(String x: a){
            System.out.println(x);

        }*/

        //ArrayList no permite que le pasemos directamente las constantes
        ArrayList<String> b = new ArrayList<>();
        b.add("hola");
        b.add("mundo");

        for(int i = 0; i<b.size(); i++){
            String n ="<"+b.get(i)+">";
            b.set(i,n);
        }
        b.forEach(System.out::println);
        System.out.println(b);
    }

}
