package ejercicioscajanegra.ejercicio01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcursionMetodosEstaticosTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("precio alumno: 100 alumnos")
    void calcularCosteAlumno1() {
        assertEquals(65, ExcursionMetodosEstaticos.calcularCosteAlumnos(100));
    }
    @Test
    @DisplayName("precio alumno: 50 alumnos")
    void calcularCosteAlumno2() {
        assertEquals(70, ExcursionMetodosEstaticos.calcularCosteAlumnos(50));
    }

    @Test
    @DisplayName("precio alumno: 30 alumnos")
    void calcularCosteAlumno3() {
        assertEquals(95, ExcursionMetodosEstaticos.calcularCosteAlumnos(30));
    }
    @Test
    @DisplayName("precio alumno: 29 alumnos")
    void calcularCosteAlumno4() {
        assertEquals(4000/29, ExcursionMetodosEstaticos.calcularCosteAlumnos(29));
    }

    @Test
    @DisplayName("coste total: 100 alumnos")
    void calcularCosteExcursion1() {
        assertEquals(6500, ExcursionMetodosEstaticos.calcularCosteExcursion(100));
    }
    @Test
    @DisplayName("coste total: 50 alumnos")
    void calcularCosteExcursion2() {
        assertEquals(3500, ExcursionMetodosEstaticos.calcularCosteExcursion(50));
    }
    @Test
    @DisplayName("coste total: 30 alumnos")
    void calcularCosteExcursion3() {
        assertEquals(2850, ExcursionMetodosEstaticos.calcularCosteExcursion(30));
    }
    @Test
    @DisplayName("coste total: 29 alumnos")
    void calcularCosteExcursion4() {
        assertEquals(4000, ExcursionMetodosEstaticos.calcularCosteExcursion(29));
    }
}