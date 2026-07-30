package gettersAndSetters;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("      EJECUCIÓN DE PRUEBAS - GETTERS & SETTERS    ");
        System.out.println("==================================================\n");

        // 1Persana
        System.out.println("--- 1️⃣ Persona Encapsulada ---");
        Persana p1 = new Persana("Ana", "Martínez", -5); // Prueba edad negativa
        p1.mostrar();
        p1.setEdad(22);
        System.out.println("Edad corregida con setEdad(22): " + p1.getEdad() + " años\n");
    }
}