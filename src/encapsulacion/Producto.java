package encapsulacion;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double descuento = precio * (porcentaje / 100.0);
            precio -= descuento;
            System.out.println("Se aplicó un " + porcentaje + "% de descuento a " + nombre + ".");
        } else {
            System.out.println("Porcentaje de descuento no válido.");
        }
    }

    public void mostrarInformacion() {
        System.out.printf("Código: %s | Producto: %s | Precio: Q%.2f%n", codigo, nombre, precio);
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
}