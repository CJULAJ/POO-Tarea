package gettersAndSetters;

public class Estudiante {
    private String carnet;
    private String nombre;
    private double promedio;

    public Estudiante(String carnet, String nombre, double promedio) {
        this.carnet = carnet;
        this.nombre = nombre;
        setPromedio(promedio);
    }

    public boolean esBecado() {
        return promedio >= 85;
    }

    public String getCarnet() { return carnet; }
    public String getNombre() { return nombre; }
    
    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 100) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio fuera de rango (0-100). Se asignará 0.");
            this.promedio = 0;
        }
    }
}