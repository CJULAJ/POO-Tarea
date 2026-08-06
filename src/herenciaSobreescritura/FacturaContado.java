package herenciaSobreescritura;

public class FacturaContado extends Factura {
    private double descuento;

    public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
        super(numero, cliente, total);
        this.descuento = descuento;
    }

    @Override
    public double calcularTotal() {
        double totalBase = super.calcularTotal();
        double totalFinal = totalBase - descuento;
        return Math.max(0, totalFinal); // Garantiza que no sea negativo
    }
}