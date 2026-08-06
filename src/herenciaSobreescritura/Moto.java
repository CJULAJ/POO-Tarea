package herenciaSobreescritura;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, double velocidad, int cilindrada) {
        super(marca, velocidad);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Cilindrada: " + cilindrada + " cc");
    }
}