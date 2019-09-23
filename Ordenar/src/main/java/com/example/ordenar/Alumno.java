package com.example.ordenar;

public class Alumno extends Persona {
    int suspensos;
    public Alumno( String nombre, int edad, int s){
        super(nombre,edad);
        this.suspensos = s;

    }
    public void mostrar(){
        System.out.println("Me llamo" + nombre +" y he suspendido" + suspensos + " asignaturas");
    }
}
