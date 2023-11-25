package com.example.busquedainsercion;

public class Paciente extends Persona {

    private int edad;

    public Paciente(int id, String nombre, int edad) {
        super();
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String id = null;
        String nombre = null;
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

