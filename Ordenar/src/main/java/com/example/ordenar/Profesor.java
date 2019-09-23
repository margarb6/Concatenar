package com.example.ordenar;



public class Profesor extends Persona {
    String asignatura;
    public Alumno( String nombre, int edad, String asignatura){
        super(nombre,edad);
        this.asignatura = asignatura;

    }
    public void mostrar(){
        System.out.println("Me llamo" + nombre +" y doy clase de" +  asignatura);
    }
}
