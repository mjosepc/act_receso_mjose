package org.example;

public class Vehiculo {
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

