package com.example.busquedainsercion;

import java.io.*;
import java.util.ArrayList;

public class Lista {

    private static ArrayList<Persona> personas;

    public Lista() {
        personas = new ArrayList<>();
    }

    public void leer() {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");

                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                String especialidad = datos[2];

                if (datos[0].equals("d")) {
                    personas.add(new Doctor(id, nombre, especialidad));
                } else {
                    personas.add(new Paciente(id, nombre, Integer.parseInt(datos[2])));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
    

    public static void insertar(Persona persona) {

        personas.add(persona);
    }
}

