package ejercicioscajanegra.ejercicio05;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio05Test {

    @Test
    @DisplayName("Calcular factorial de 10")
    void calcularFactorial() {
        // Simular la entrada estándar System.in
        String input = "10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(3628800, Ejercicio05.calcularFactorial());
    }
    @Test
    @DisplayName("Calcular factorial de 5, inválida")
    void calcularFactorialInvalida() {
        // Simular la entrada estándar System.in
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertNotEquals(159, Ejercicio05.calcularFactorial());
    }
}