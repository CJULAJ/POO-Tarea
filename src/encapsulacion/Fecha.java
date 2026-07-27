package encapsulacion;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean esValida() {
        return (mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31);
    }

    public void mostrar() {
        System.out.printf("%02d/%02d/%04d", dia, mes, anio);
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return anio; }
}