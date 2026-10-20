public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        establecerCantidad(cantidad);
        establecerPrecioPorArticulo(precioPorArticulo);
    }

    public void establecerNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String obtenerNumeroPieza() {
        return numeroPieza;
    }

    public void establecerDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String obtenerDescripcionPieza() {
        return descripcionPieza;
    }