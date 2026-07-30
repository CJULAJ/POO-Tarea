package gettersAndSetters;

public class Factura {
    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Factura(String codigoFactura, String descripcion, int cantidad, double precioUnitario) {
        this.codigoFactura = codigoFactura;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecioUnitario(precioUnitario);
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarFactura() {
        System.out.println(" Factura No: " + codigoFactura);
        System.out.println("   Descripción: " + descripcion);
        System.out.println("   Cantidad: " + cantidad + " x Q" + String.format("%.2f", precioUnitario));
        System.out.printf("   Total Calculado: Q%.2f%n", calcularTotal());
    }

    public String getCodigoFactura() { return codigoFactura; }
    public String getDescripcion() { return descripcion; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad debe ser mayor a 0. Se asignará 1 por defecto.");
            this.cantidad = 1;
        }
    }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println(" El precio unitario debe ser mayor a 0. Se asignará Q1.00 por defecto.");
            this.precioUnitario = 1.0;
        }
    }
}