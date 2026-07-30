package gettersAndSetters;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private int pin;

    public CuentaBancaria(String titular, double saldoInicial, int pin) {
        this.titular = titular;
        this.saldo = Math.max(saldoInicial, 0.0);
        this.pin = pin;
    }

    public void retirar(double monto, int pinIngresado) {
        if (pinIngresado != this.pin) {
            System.out.println("❌ PIN incorrecto. Acceso denegado al retiro.");
            return;
        }

        if (monto <= 0) {
            System.out.println(" El monto a retirar debe ser mayor a 0.");
        } else if (monto > saldo) {
            System.out.printf("Fondos insuficientes. Intento de retiro: Q%.2f | Saldo actual: Q%.2f%n", monto, saldo);
        } else {
            saldo -= monto;
            System.out.printf(" Retiro exitoso: Q%.2f | Nuevo saldo: Q%.2f%n", monto, saldo);
        }
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }
    public void setPin(int pinActual, int nuevoPin) {
        if (pinActual == this.pin) {
            this.pin = nuevoPin;
            System.out.println(" PIN actualizado con éxito.");
        } else {
            System.out.println("❌ No se pudo cambiar el PIN: PIN actual incorrecto.");
        }
    }
}