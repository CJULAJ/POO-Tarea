package herenciaSobreescritura;

public class ProductoPerecedero extends Producto {
    private String fechaVencimiento; // Formato esperado: YYYY-MM-DD

    public ProductoPerecedero(String nombre, double precio, String fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaVencido(String fechaActual) {
        // Compara las fechas en formato texto YYYY-MM-DD
        return fechaActual.compareTo(this.fechaVencimiento) > 0;
    }
}