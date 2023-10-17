package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el lugar de destino: ");
        String destino = scanner.nextLine();

        System.out.print("Ingrese la distancia al destino en kilómetros: ");
        int distancia = scanner.nextInt();

        System.out.print("Elija un vehículo (1 - Auto, 2 - Motocicleta, 3 - Bicicleta): ");
        int opcionVehiculo = scanner.nextInt();

        double velocidadAuto = 0;
        double velocidadMotocicleta = 0;
        double velocidadBicicleta = 0;

        if (opcionVehiculo == 1) {
            System.out.print("Ingrese la velocidad promedio en km/h para el auto: ");
            velocidadAuto = scanner.nextDouble();
        } else if (opcionVehiculo == 2) {
            System.out.print("Ingrese la velocidad promedio en km/h para la motocicleta: ");
            velocidadMotocicleta = scanner.nextDouble();
        } else if (opcionVehiculo == 3) {
            System.out.print("Ingrese la velocidad promedio en km/h para la bicicleta: ");
            velocidadBicicleta = scanner.nextDouble();
        } else {
            System.out.println("Opción de vehículo no válida. Saliendo del programa.");
            return;
        }

        Persona persona = new Persona(nombre, destino);

        Vehiculo auto = new Vehiculo("auto", velocidadAuto);
        Vehiculo motocicleta = new Vehiculo("motocicleta", velocidadMotocicleta);
        Vehiculo bicicleta = new Vehiculo("bicicleta", velocidadBicicleta);

        double tiempoAuto = auto.calcularTiempo(distancia);
        double tiempoMotocicleta = motocicleta.calcularTiempo(distancia);
        double tiempoBicicleta = bicicleta.calcularTiempo(distancia);

        double tiempoAutoMinutos = tiempoAuto * 60;
        double tiempoMotocicletaMinutos = tiempoMotocicleta * 60;
        double tiempoBicicletaMinutos = tiempoBicicleta * 60;

        System.out.println("Hola " + persona.getNombre() + "!, el tiempo de viaje aproximado para llegar a " +
                persona.getDestino() + " en " + auto.getTipo() + " es de: " + tiempoAutoMinutos + " minutos");
        System.out.println("Hola " + persona.getNombre() + "!, el tiempo de viaje aproximado para llegar a " +
                persona.getDestino() + " en " + motocicleta.getTipo() + " es de: " + tiempoMotocicletaMinutos + " minutos");
        System.out.println("Hola " + persona.getNombre() + "!, el tiempo de viaje aproximado para llegar a " +
                persona.getDestino() + " en " + bicicleta.getTipo() + " es de: " + tiempoBicicletaMinutos + " minutos");

        scanner.close();
    }
}