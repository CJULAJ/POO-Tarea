package herenciaSobreescritura;

public class Transporte {
    protected int capacidad;

    public Transporte(int capacidad) {
        this.capacidad = capacidad;
    }

    public void descripcion() {
        System.out.println("Capacidad del transporte: " + capacidad + " pasajeros.");
    }
}
