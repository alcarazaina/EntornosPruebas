package ejemploscajanegra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComprobarIdentificadorTest {

    //declaramos el objeto de la clase
    ComprobarIdentificador cID = new ComprobarIdentificador();
    @Test
    @DisplayName("Cobertura 1, 4, 6, 9, 11 - identificador válido")
    void validarIdentificador() {
        cID.setIdentificador("Progra--mador-1");
        assertTrue(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 2 - identificador válido")
    void validarIdentificador2() {
        cID.setIdentificador("Prog");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 3 - identificador válido")
    void validarIdentificador3() {
        cID.setIdentificador("Progra--mador-112");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 5 - identificador válido")
    void validarIdentificador4() {
        cID.setIdentificador("$$$###_?");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 7 - identificador válido")
    void validarIdentificador5() {
        cID.setIdentificador("-Progra--mador");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 8 - identificador válido")
    void validarIdentificador6() {
        cID.setIdentificador("Progra--mador-");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 10 - identificador válido")
    void validarIdentificador7() {
        cID.setIdentificador("12345-6789");
        assertFalse(cID.validarIdentificador());
    }

    @Test
    @DisplayName("Cobertura 12 - identificador válido")
    void validarIdentificador8() {
        cID.setIdentificador("boolean");
        assertFalse(cID.validarIdentificador());
    }
}