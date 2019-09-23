package com.example.ordenar;

public class Persona {
    protected String nombre;
    protected int edad;

    public String getNombre() {
        return nombre;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrar(){
        System.out.println("Me llamo" + nombre);
    }


}
