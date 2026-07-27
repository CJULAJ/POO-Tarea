package encapsulacion;

public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = Math.max(saldoInicial, 0.0);
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.printf("Depósito realizado: +Q%.2f | Nuevo saldo: Q%.2f%n", monto, saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a 0.");
        } else if (monto > saldo) {
            System.out.printf("Retiro rechazado (Q%.2f): Saldo insuficiente. Saldo actual: Q%.2f%n", monto, saldo);
        } else {
            saldo -= monto;
            System.out.printf("Retiro exitoso: -Q%.2f | Saldo restante: Q%.2f%n", monto, saldo);
        }
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
}