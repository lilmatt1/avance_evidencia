package com.example.busquedainsercion;

public class Doctor extends Persona {
    private int id;
    private String nombre;
    private String especialidad;
    public Doctor(int id, String nombre, String especialidad) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        String Juanito = nombre;
        return Juanito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
