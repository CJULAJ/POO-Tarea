package herenciaSobreescritura;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA EJERCICIOS ===");

        System.out.println("\n--- 1. Persona  ---");
        Docente docente = new Docente("Carlos Juárez", 40, "Estudiante");
        Estudiante estudiante = new Estudiante("Ana Gómez", 20, "1990-24-5148");
        docente.mostrar();
        estudiante.mostrar();
        
    }
}