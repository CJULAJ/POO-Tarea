package gettersAndSetters;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("      EJECUCIÓN DE PRUEBAS - GETTERS & SETTERS    ");
        System.out.println("==================================================\n");

       // 1 Persana
        System.out.println("--- 1️ Persona Encapsulada ---");
        Persana p1 = new Persana("Ana", "Martínez", -5); // Prueba edad negativa
        p1.mostrar();
        p1.setEdad(22);
        System.out.println("Edad corregida con setEdad(22): " + p1.getEdad() + " años\n");
        
      // 2 Producto
        System.out.println("--- 2️ Producto con Validaciones ---");
        Producto prod = new Producto("PRD-01", "Silla Gamer", 1200.0, 5);
        prod.vender(3);
        prod.vender(4); // Intento de venta mayor al stock
        System.out.println();
        
     // 3️ Cuenta Bancaria
        System.out.println("--- 3️⃣ Cuenta con PIN ---");
        CuentaBancaria cuenta = new CuentaBancaria("Luis Mario", 1000.0, 1234);
        System.out.println("Intento 1 con PIN 9999 (Incorrecto):");
        cuenta.retirar(200, 9999);
        System.out.println("Intento 2 con PIN 1234 (Correcto):");
        cuenta.retirar(200, 1234);
        System.out.println();
    }
}