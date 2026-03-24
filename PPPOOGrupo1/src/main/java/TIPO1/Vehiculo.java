/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TIPO1;

/**
 *
 * @author Tania - Sergio
 */

public abstract class Vehiculo {

    String placa;
    String modelo;
    String marca;

    public Vehiculo(String placa, String modelo, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    abstract float calcularAutonomia();

    public String mostrarInformacionGeneral() {
        return "Vehiculo{" + "placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + '}';
    }
}