package herenciaSobreescritura;

public class Factura {
    protected int numero;
    protected Cliente cliente;
    protected double total;

    public Factura(int numero, Cliente cliente, double total) {
        this.numero = numero;
        this.cliente = cliente;
        this.total = total < 0 ? 0 : total; // Validación para evitar saldos negativos
    }

    public double calcularTotal() {
        return total;
    }

    public void mostrarFactura() {
        System.out.println("Factura #" + numero + " | Cliente: " + cliente.getNombre() + 
                           " (NIT: " + cliente.getNit() + ") | Total: Q" + calcularTotal());
    }
}