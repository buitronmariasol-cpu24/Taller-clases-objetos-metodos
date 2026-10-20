import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero de pieza: ");
        String numero = entrada.nextLine();
        System.out.print("Descripcion: ");
        String descripcion = entrada.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = entrada.nextInt();
        System.out.print("Precio por articulo: ");
        double precio = entrada.nextDouble();

        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        System.out.println("\n--- FACTURA ---");
        System.out.println("Pieza: " + factura.obtenerNumeroPieza());
        System.out.println("Descripcion: " + factura.obtenerDescripcionPieza());
        System.out.println("Cantidad: " + factura.obtenerCantidad());
        System.out.println("Precio: $" + factura.obtenerPrecioPorArticulo());
        System.out.println("Monto: $" + factura.obtenerMontoFactura());

        entrada.close();
    }
}