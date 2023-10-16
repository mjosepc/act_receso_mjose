package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

}
class Persona {
    private String nombre;
    private String destino;

    public Persona(String nombre, String destino) {
        this.nombre = nombre;
        this.destino = destino;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDestino() {
        return destino;
    }
}
class Vehiculo {
    private String tipo;
    private double velocidadPromedio;

    public Vehiculo(String tipo, double velocidadPromedio) {
        this.tipo = tipo;
        this.velocidadPromedio = velocidadPromedio;
    }

    public String getTipo() {
        return tipo;
    }

    public double calcularTiempo(int distancia) {
        double tiempoHoras = (double) distancia / velocidadPromedio;
        return tiempoHoras;
    }
}