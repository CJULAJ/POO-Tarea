package herenciaSobreescritura;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA EJERCICIOS ===");

        System.out.println("\n--- 1. Persona  ---");
        Docente docente = new Docente("", 40, "");
        Estudiante estudiante = new Estudiante("Ana Gómez", 20, "1990-24-5148");
        docente.mostrar();
        estudiante.mostrar();
        
        System.out.println("\n--- 2. Cuenta Corriente con Sobregiro ---");
        CuentaCorriente cc = new CuentaCorriente(500, 200);
        cc.retirar(600); // Excede saldo, usa sobregiro
        cc.retirar(200); // Supera el límite de sobregiro
        
        System.out.println("\n--- 3. Producto Perecedero ---");
        ProductoPerecedero leche = new ProductoPerecedero("Leche Entera", 15.50, "2026-08-01");
        System.out.println("¿Está vencido al 2026-08-04? " + leche.estaVencido("2026-08-04"));
    }
}