package makigasJUnit5.catalogo;

import org.junit.jupiter.api.*;

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
    @DisplayName("Pedido con 0 productos")
    void cantidad() {
        Pedido p = new Pedido();
        //Vamos a probar que cuando el pedido está vacío la cantidad que devuelve es 0.
        Assertions.assertEquals(0, p.cantidad());

    }
    @Test
    @DisplayName("Pedido con 1 producto")
    void cantidad2() {
        // Para probar el método cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos
        Producto p1 = new Producto("Coco", 400);

        Pedido p = new Pedido();
        p.agregar(p1);
        var total = p.cantidad();
        Assertions.assertEquals(1, total);
    }
    @Test
    @DisplayName("Pedido con 2 productos")
    void cantidad3() {
        // Para probar el método cantidad necesito un objeto de tipo Pedido con una serie de productos añadidos
        Producto p1 = new Producto("Coco", 400);
        Producto p2 = new Producto("Canela", 200);

        Pedido p = new Pedido();
        p.agregar(p1);
        p.agregar(p2);
        Assertions.assertEquals(2, p.cantidad());


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