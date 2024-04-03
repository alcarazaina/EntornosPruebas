package makigasJUnit5.catalogo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregar() {
    }

    @Test
    void cantidad() {
        // Para probar el método cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos
        Producto p1 = new Producto("Coco", 400);
        Producto p2 = new Producto("Canela", 200);

        Pedido p = new Pedido();
        p.agregar(p1);
        p.agregar(p2);
    }

    @Test
    void total() {
    }

    @Test
    void vaciar() {
    }

    @Test
    void pagar() {
    }
}