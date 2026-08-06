package herenciaSobreescritura;

public class FacturaCredito extends Factura {
    private double recargo;
    private int cuotas;

    public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
        super(numero, cliente, total);
        this.recargo = recargo;
        this.cuotas = cuotas;
    }

    @Override
    public double calcularTotal() {
        double totalBase = super.calcularTotal();
        return totalBase + recargo;
    }

    public double getMontoCuota() {
        return calcularTotal() / cuotas;
    }

    @Override
    public void mostrarFactura() {
        super.mostrarFactura();
        System.out.println("   [Plan Crédito: " + cuotas + " cuotas de Q" + 
                           String.format("%.2f", getMontoCuota()) + " | Recargo aplicado: Q" + recargo + "]");
    }
}