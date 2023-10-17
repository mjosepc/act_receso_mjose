package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PersonaTest {
    @Test
    public void testGetNombre() {
        Persona persona = new Persona("Juan", "el trabajo");
        assertEquals("Juan", persona.getNombre());
    }

    @Test
    public void testGetDestino() {
        Persona persona = new Persona("Juan", "el trabajo");
        assertEquals("el trabajo", persona.getDestino());
    }
}
class VehiculoTest {

        @Test
        public void testCalcularTiempoAuto() {
            Vehiculo auto = new Vehiculo("auto", 60.0);
            assertEquals(1.0, auto.calcularTiempo(60)); // 60 km a 60 km/h = 1 hora
        }

        @Test
        public void testCalcularTiempoMotocicleta() {
            Vehiculo motocicleta = new Vehiculo("motocicleta", 80.0);
            assertEquals(0.75, motocicleta.calcularTiempo(60)); // 60 km a 80 km/h = 0.75 horas
        }

        @Test
        public void testCalcularTiempoBicicleta() {
            Vehiculo bicicleta = new Vehiculo("bicicleta", 15.0);
            assertEquals(4.0, bicicleta.calcularTiempo(60)); // 60 km a 15 km/h = 4 horas
        }
    }
