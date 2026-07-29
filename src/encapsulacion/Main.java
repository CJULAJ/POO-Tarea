package encapsulacion;

public class Main {
    public static void main(String[] args) {

        System.out.println("            EJECUCIÓN DE TAREA - POO              ");

        // --------------------------------------------------
        // 1️⃣ Clase Persona
        // --------------------------------------------------
        System.out.println("--- 1️⃣ EJERCICIO: Persona ---");
        Persona p1 = new Persona("Carlos", "Gómez", 20);
        Persona p2 = new Persona("María", "López", 25);
        Persona p3 = new Persona("Juan", "Pérez", 18);

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();
        System.out.println();

        // --------------------------------------------------
        // 2️⃣ Clase Rectángulo
        // --------------------------------------------------
        System.out.println("--- 2️⃣ EJERCICIO: Rectángulo ---");
        Rectangulo r1 = new Rectangulo(5.0, 10.0);
        Rectangulo r2 = new Rectangulo(7.0, 8.0);

        System.out.println("Rectángulo 1 -> Áreas: " + r1.area() + " | Perímetro: " + r1.perimetro());
        System.out.println("Rectángulo 2 -> Área: " + r2.area() + " | Perímetro: " + r2.perimetro());

        if (r1.area() > r2.area()) {
            System.out.println("Resultado: El Rectángulo 1 tiene mayor área.");
        } else if (r2.area() > r1.area()) {
            System.out.println("Resultado: El Rectángulo 2 tiene mayor área.");
        } else {
            System.out.println("Resultado: Ambos rectángulos tienen la misma área.");
        }
        System.out.println();

        // --------------------------------------------------
        // 3️⃣ Clase Producto
        // --------------------------------------------------
        System.out.println("--- 3️⃣ EJERCICIO: Producto ---");
        Producto prod1 = new Producto("P001", "Laptop Gaming", 8500.00);
        Producto prod2 = new Producto("P002", "Teclado Mecánico", 450.00);

        System.out.println("Precios iniciales:");
        prod1.mostrarInformacion();
        prod2.mostrarInformacion();

        System.out.println("\nAplicando descuentos...");
        prod1.aplicarDescuento(15);
        prod2.aplicarDescuento(10);

        System.out.println("\nPrecios finales:");
        prod1.mostrarInformacion();
        prod2.mostrarInformacion();
        System.out.println();

        // --------------------------------------------------
        // 4️⃣ Clase Cuenta
        // --------------------------------------------------
        System.out.println("--- 4️⃣ EJERCICIO: Cuenta Bancaria ---");
        Cuenta cuenta = new Cuenta("Carlos Juárez", 500.00);
        System.out.println("Titular: " + cuenta.getTitular() + " | Saldo inicial: Q" + cuenta.getSaldo());

        cuenta.depositar(250.00);
        cuenta.retirar(100.00);
        cuenta.retirar(700.00); // Intento de sobregiro
        cuenta.depositar(50.00);

        System.out.printf("Saldo final de la cuenta: Q%.2f%n", cuenta.getSaldo());
        System.out.println();

        // --------------------------------------------------
        // 5️⃣ Clase Libro
        // --------------------------------------------------
        System.out.println("--- 5️⃣ EJERCICIO: Libro ---");
        Libro l1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
        Libro l2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        Libro l3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);

        Libro[] libros = {l1, l2, l3};
        for (Libro libro : libros) {
            libro.mostrar();
            if (libro.esLargo()) {
                System.out.println("   -> Es un libro largo (más de 300 páginas).");
            } else {
                System.out.println("   -> No es un libro largo.");
            }
        }
        System.out.println();

        // --------------------------------------------------
        // 6️⃣ Clase Calculadora
        // --------------------------------------------------
        System.out.println("--- 6️⃣ EJERCICIO: Calculadora ---");
        Calculadora calc = new Calculadora();
        double num1 = 20.0;
        double num2 = 4.0;

        System.out.println("Operaciones con " + num1 + " y " + num2 + ":");
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));

        System.out.println("\nPrueba de división entre cero:");
        System.out.print("Resultado: ");
        calc.dividir(num1, 0);
        System.out.println();

        // --------------------------------------------------
        // 7️⃣ Clase Fecha
        // --------------------------------------------------
        System.out.println("--- 7️⃣ EJERCICIO: Fecha ---");
        Fecha f1 = new Fecha(15, 8, 2026);
        Fecha f2 = new Fecha(32, 5, 2024);  // Día inválido
        Fecha f3 = new Fecha(10, 14, 2025); // Mes inválido

        Fecha[] fechas = {f1, f2, f3};
        for (Fecha f : fechas) {
            f.mostrar();
            if (f.esValida()) {
                System.out.println(" -> Fecha válida");
            } else {
                System.out.println(" -> Fecha no válida");
            }
        }

        System.out.println("            FIN DE LAS PRUEBAS                    ");
    }
}