package gettersAndSetters;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public String mostrarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public int getHora() { return hora; }
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora fuera de rango (0-23). Se asignará 0.");
            this.hora = 0;
        }
    }

    public int getMinuto() { return minuto; }
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println(" Minutos fuera de rango (0-59). Se asignará 0.");
            this.minuto = 0;
        }
    }

    public int getSegundo() { return segundo; }
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundos fuera de rango (0-59). Se asignará 0.");
            this.segundo = 0;
        }
    }
}