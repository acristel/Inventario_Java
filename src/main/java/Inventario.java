public class Inventario {
    public static void main(String[] args) {
        int precio = 50;
        int cantidad = 4;
        int valorTotal = calcularSubtotal(precio, cantidad);
        System.out.println("Subtotal: " + valorTotal);
    }

    public static int calcularSubtotal(int precio, int cantidad) {
        return precio * cantidad;
    }
}

