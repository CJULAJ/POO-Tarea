package herenciaSobreescritura;

public class LibroDigital extends Libro {
    private double tamañoMB;

    public LibroDigital(String titulo, String autor, double tamañoMB) {
        super(titulo, autor);
        this.tamañoMB = tamañoMB;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño de archivo: " + tamañoMB + " MB");
    }
}