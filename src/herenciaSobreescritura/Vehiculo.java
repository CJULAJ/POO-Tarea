package herenciaSobreescritura;

public class Vehiculo {
    protected String marca;
    protected double velocidad;

    public Vehiculo(String marca, double velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Velocidad máx: " + velocidad + " km/h");
    }
}