/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIPO1;

/**
 *
 * @author Tania - Sergio
 */

public class Camion extends Vehiculo {

    int capacidadCargaToneladas;
    String atrDestino;
    float atrDistancia;

    public Camion(int capacidadCargaToneladas, String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.capacidadCargaToneladas = capacidadCargaToneladas;
    }

    @Override
    float calcularAutonomia() {

        // cálculo simulado basado en el peso
        return 800 - (capacidadCargaToneladas * 40);
    }

    public void asignarRuta() {
        System.out.println("Ruta estándar asignada. Sin destino específico aún.");
    }

    public void asignarRuta(String atrDestino) {
        this.atrDestino = atrDestino;
        System.out.println("Ruta asignada con destino a: " + atrDestino);
    }

    public void asignarRuta(String atrDestino, float atrDistancia) {

        this.atrDestino = atrDestino;
        this.atrDistancia = atrDistancia;

        System.out.println("Ruta asignada al destino: " + atrDestino);
        System.out.println("Distancia total: " + atrDistancia + " km. Preparando logística pesada.");
    }
}