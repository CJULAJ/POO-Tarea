package gettersAndSetters;

public class Termometro {
    private double celsius;

    public Termometro(double celsius) {
        setCelsius(celsius);
    }

    public double getCelsius() { return celsius; }
    public void setCelsius(double temperatura) {
        if (temperatura < -273.15) {
            System.out.println("Error: La temperatura no puede ser menor al cero absoluto (-273.15°C). Se asignará -273.15°C.");
            this.celsius = -273.15;
        } else {
            this.celsius = temperatura;
        }
    }

    public double getFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }
}