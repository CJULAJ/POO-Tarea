package herenciaSobreescritura;

public class Bus extends Transporte {
    private String ruta;

    public Bus(int capacidad, String ruta) {
        super(capacidad);
        this.ruta = ruta;
    }

    @Override
    public void descripcion() {
        super.descripcion();
        System.out.println("Ruta asignada: " + ruta);
    }
}