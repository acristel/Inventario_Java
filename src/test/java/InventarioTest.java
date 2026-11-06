import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InventarioTest {

    @Test
    void pruebaSubtotalEsCorrecto() {
        int resultado = Inventario.calcularSubtotal(50, 4);
        assertEquals(200, resultado);
    }

    @Test
    void pruebaSubtotalConCantidadValida() {
        int resultado = Inventario.calcularSubtotal(25, 8);
        assertEquals(200, resultado);
    }
}
