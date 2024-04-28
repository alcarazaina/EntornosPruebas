package ejercicioscajanegra.ejercicio06;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio06Test {

    Ejercicio06 lector = new Ejercicio06();
    @Test
    @DisplayName("Comprobar DNI válido")
    void validarDNI() {
        assertTrue(lector.validarDNI("12345678Z"));
    }
    @Test
    @DisplayName("Comprobar DNI, longitud 8")
    void validarDNI1() {
        assertFalse(lector.validarDNI("12345678"));
    }
    @Test
    @DisplayName("Comprobar DNI, Letra incorrecta")
    void validarDNI2() {
        assertFalse(lector.validarDNI("12345678T"));
    }
    @Test
    @DisplayName("Comprobar DNI, longitud 9 sin letra")
    void validarDNI3() {
        assertFalse(lector.validarDNI("123456789"));
    }
    @Test
    @DisplayName("Comprobar DNI, longitud 10")
    void validarDNI4() {
        assertFalse(lector.validarDNI("123456789Z"));
    }
    @Test
    @DisplayName("Comprobar DNI, letra al principio")
    void validarDNI5() {
        assertFalse(lector.validarDNI("Z12345678"));
    }
    @Test
    @DisplayName("Comprobar DNI, solo letras")
    void validarDNI6() {
        assertFalse(lector.validarDNI("FFFFFFFFF"));
    }
}