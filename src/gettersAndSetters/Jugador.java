package gettersAndSetters;

public class Jugador {
    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    public Jugador(String nombre, int puntajeInicial) {
        this.nombre = nombre;
        setPuntajeActual(puntajeInicial);
        this.puntajeMaximo = this.puntajeActual;
    }

    public void actualizarPuntaje(int nuevoPuntaje) {
        setPuntajeActual(nuevoPuntaje);
        if (this.puntajeActual > puntajeMaximo) {
            puntajeMaximo = this.puntajeActual;
            System.out.println("Nuevo récord máximo alcanzado para " + nombre + ": " + puntajeMaximo + " pts!");
        }
    }

    public String getNombre() { return nombre; }

    public int getPuntajeActual() { return puntajeActual; }
    public void setPuntajeActual(int puntajeActual) {
        if (puntajeActual < 0) {
            System.out.println("El puntaje no puede ser negativo. Se asignará 0.");
            this.puntajeActual = 0;
        } else {
            this.puntajeActual = puntajeActual;
        }
    }

    public int getPuntajeMaximo() { return puntajeMaximo; }
}