package ejercicioscajanegra.ejercicio02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio02Test {

    @Test
    @DisplayName("Casa válida, gyffindor")
    void gryffindor() {
        assertEquals("valentía", Ejercicio02.casa("gryffindor"));
    }

    @Test
    @DisplayName("Casa válida, hufflepuff")
    void hufflepuff() {
        assertEquals("lealtad", Ejercicio02.casa("hufflepuff"));
    }
    @Test
    @DisplayName("Casa válida, slytherin")
    void slytherin() {
        assertEquals("astucia", Ejercicio02.casa("slytherin"));
    }
    @Test
    @DisplayName("Casa válida, ravenclaw")
    void ravenclaw() {
        assertEquals("intelecto", Ejercicio02.casa("ravenclaw"));
    }
    @Test
    @DisplayName("Casa no válida")
    void noValida() {
        assertEquals("No es una casa válida", Ejercicio02.casa("chimichurri"));
    }

}