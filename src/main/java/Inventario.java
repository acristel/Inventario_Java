public class Inventario {
    public static void main(String[] args) {
        int precio = 50;
        int cantidad = 4;
        int valorTotal = calcularSubtotal(precio, cantidad);
        System.out.println("Subtotal: " + valorTotal);
    }

    public static int calcularSubtotal(int precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            throw new IllegalArgumentException("El precio y la cantidad no pueden ser negativos");
        }
        return precio * cantidad;
    }
}
