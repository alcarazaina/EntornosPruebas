import ejemplossueltos.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTest {
    @Test
    void prueba1suma() {
        assertEquals(4, Calculadora.sumar(2, 2)); //caso de prueba
    }

    @Test
    void prueba2suma() {
        assertEquals(0, Calculadora.sumar(2, -2));
    }

    @Test
    void prueba1resta() {
        assertEquals(-33, Calculadora.restar(-3, 30));
    }

    @Test
    void prueba2resta() {
        assertEquals(-14000, Calculadora.restar(1000, 15000));
    }

    @Test
    void prueba1multiplica() {
        assertEquals(0, Calculadora.multiplicar(0, 5));
    }

    @Test
    void prueba2multiplica() {
        assertEquals(1000, Calculadora.multiplicar(1000, 1));
    }

    @Test
    void prueba1dividir() {
        assertEquals(0, Calculadora.dividir(0, 5));
    }

    @Test
    void prueba2dividir() {
        assertEquals(0.1, Calculadora.dividir(1, 10));
    }

}
