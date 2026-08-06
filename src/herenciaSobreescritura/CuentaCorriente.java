package herenciaSobreescritura;

public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(double saldo, double limiteSobregiro) {
        super(saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (saldo + limiteSobregiro >= monto) {
            super.retirar(monto);
            System.out.println("Retiro exitoso. Saldo actual: Q" + saldo);
        } else {
            System.out.println("Error: El retiro excede el límite de sobregiro permitido.");
        }
    }
}
