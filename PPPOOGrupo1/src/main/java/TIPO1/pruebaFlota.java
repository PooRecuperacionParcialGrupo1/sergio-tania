/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIPO1;

/**
 *
 * @author Tania - Sergio
 */

import java.util.ArrayList;

public class pruebaFlota {

    public static void main(String[] args) {

        ArrayList<Camion> camiones = new ArrayList<>();
        ArrayList<Furgoneta> furgonetas = new ArrayList<>();

        // Crear objetos
        Camion c1 = new Camion(10, "AAA111", "2020", "Volvo");
        Camion c2 = new Camion(12, "BBB222", "2021", "Scania");

        Furgoneta f1 = new Furgoneta(2000, "CCC333", "2019", "Renault");
        Furgoneta f2 = new Furgoneta(2500, "DDD444", "2022", "Chevrolet");

        // Guardarlos en los arreglos
        camiones.add(c1);
        camiones.add(c2);

        furgonetas.add(f1);
        furgonetas.add(f2);

        System.out.println("===== CAMIONES =====");

        for (Camion c : camiones) {
            System.out.println(c.mostrarInformacionGeneral());
            System.out.println("Autonomía: " + c.calcularAutonomia());
            System.out.println();
        }

        System.out.println("===== FURGONETAS =====");

        for (Furgoneta f : furgonetas) {
            System.out.println(f.mostrarInformacionGeneral());
            System.out.println("Autonomía: " + f.calcularAutonomia());
            System.out.println();
        }

        System.out.println("===== PRUEBA SOBRECARGA =====");

        for (Camion c : camiones) {

            c.asignarRuta();
            c.asignarRuta("Bogotá");
            c.asignarRuta("Medellín", 420);

            System.out.println();
        }
    }
}