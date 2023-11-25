package com.example.busquedainsercion;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    ArrayList<Persona> lista = new ArrayList<>();

    public static void main(String[] args) {
        Main main = new Main();
        main.ejecutar();
    }

    private void ejecutar() {
        Persona persona = new Doctor(1, "Juanito Pérez", "Pediatra");
        lista.add(persona);

        Persona persona2 = new Paciente(2, "María Gutierrez", 35);
        lista.add(persona2);

        try {
            FileOutputStream escribir =
                    new FileOutputStream("C:\\temp\\listaPersonas.txt");
            ObjectOutputStream miStream =
                    new ObjectOutputStream(escribir);
            miStream.writeObject(lista);
            miStream.close();

            //LEER lista desde archivo
            FileInputStream leer =
                    new FileInputStream("C:\\temp\\listaPersonas.txt");
            ObjectInputStream miStream2 = new ObjectInputStream(leer);
            Object o = miStream2.readObject();
            ArrayList<Persona> otraLista = (ArrayList<Persona>) o;
            Persona pruebaPersona = otraLista.get(0);
            System.out.println(pruebaPersona.getNombre());
            miStream2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error");
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al leer lista");
        }
    }
}
