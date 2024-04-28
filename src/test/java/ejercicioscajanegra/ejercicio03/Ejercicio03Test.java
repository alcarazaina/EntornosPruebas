package ejercicioscajanegra.ejercicio03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio03Test {

    @Test
    @DisplayName("Suma de números válida 55")
    void sumarValida() { assertEquals(55, Ejercicio03.sumar());
    }
    @Test
    @DisplayName("Suma de números inválida 54")
    void sumarInvalida1() { assertNotEquals(54, Ejercicio03.sumar());
    }
    @Test
    @DisplayName("Suma de números inválida 56")
    void sumarInvalida2() { assertNotEquals(56, Ejercicio03.sumar());
    }
}