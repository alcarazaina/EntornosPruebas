package ejercicioscajanegra.ejercicio03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio03Test {

    @Test
    @DisplayName("Suma de números válida 55")
    void sumarValida() { assertEquals(55, Ejercicio03.sumar());
    }
}