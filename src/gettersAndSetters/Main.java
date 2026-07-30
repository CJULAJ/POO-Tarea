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
        System.out.println("--- 3️ Cuenta con PIN ---");
        CuentaBancaria cuenta = new CuentaBancaria("Luis Mario", 1000.0, 1234);
        System.out.println("Intento 1 con PIN 9999 (Incorrecto):");
        cuenta.retirar(200, 9999);
        System.out.println("Intento 2 con PIN 1234 (Correcto):");
        cuenta.retirar(200, 1234);
        System.out.println();
        
     // 4️ Curso
        System.out.println("--- 4️ Curso y Calificaciones ---");
        Curso curso = new Curso("Programación I", 70, 85, 55);
        System.out.printf("Curso: %s | Promedio: %.2f | Estado: %s%n%n", 
                          curso.getNombreCurso(), curso.promedio(), curso.estado());
     // 5️ Estudiante
        System.out.println("--- 5️ Estudiante y Beca ---");
        Estudiante e1 = new Estudiante("2024001", "Sofía Cruz", 88.5);
        Estudiante e2 = new Estudiante("2024002", "Pedro Ruiz", 72.0);
        System.out.println(e1.getNombre() + " (Prom: " + e1.getPromedio() + ") -> ¿Becado?: " + e1.esBecado());
        System.out.println(e2.getNombre() + " (Prom: " + e2.getPromedio() + ") -> ¿Becado?: " + e2.esBecado());
        System.out.println();
        
     // 6️ Termómetro
        System.out.println("--- 6️ Termómetro Inteligente ---");
        Termometro term = new Termometro(25.0);
        System.out.printf("%.2f °C equivalen a %.2f °F%n", term.getCelsius(), term.getFahrenheit());
        term.setCelsius(-300); // Intento por debajo del cero absoluto
        System.out.println();
        
     // 7️ Reloj
        System.out.println("--- 7️ Reloj con Formato ---");
        Reloj reloj1 = new Reloj(14, 30, 45);
        System.out.println("Hora válida: " + reloj1.mostrarHora());
        Reloj reloj2 = new Reloj(25, 61, 90); // Valores inválidos
        System.out.println("Hora tras corregir rangos: " + reloj2.mostrarHora());
        System.out.println();
    }
}