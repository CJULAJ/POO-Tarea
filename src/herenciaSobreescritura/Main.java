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
        
        System.out.println("\n--- 4. Transporte y Bus ---");
        Bus bus = new Bus(45, "Ruta 10 - Chimaltenango");
        bus.descripcion();
        
        System.out.println("\n--- 5. Empleado y Gerente ---");
        Gerente gerente = new Gerente("Marta Pérez", 8000, 2500);
        System.out.println("Salario total gerente: Q" + gerente.calcularSalario());
        
        System.out.println("\n--- 6. Animal y Perro ---");
        Animal miPerro = new Perro();
        miPerro.hacerSonido();
        
        System.out.println("\n--- 7. Vehículo y Moto ---");
        Moto moto = new Moto("Yamaha", 180, 250);
        moto.mostrarInfo();
        
        System.out.println("\n--- 8. Figuras ---");
        Figura rect = new Rectangulo(5, 4);
        Figura circ = new Circulo(3);
        System.out.println("Área Rectángulo: " + rect.calcularArea());
        System.out.println("Área Círculo: " + String.format("%.2f", circ.calcularArea()));
        
        System.out.println("\n--- 9. Libro Digital ---");
        LibroDigital libro = new LibroDigital("Programacion Orientada a Objetos", "Pablo Zadler", 12.5);
        libro.mostrarInfo();
        
        System.out.println("=== 10. PRUEBA SISTEMA DE FACTURACIÓN ===");

        Cliente c1 = new Cliente("Empresa Alfa S.A.", "1234567-8");
        Cliente c2 = new Cliente("Juan Delgado", "8765432-1");

        // Casos de prueba requeridos
        FacturaContado fContado = new FacturaContado(101, c1, 1500.00, 200.00);
        FacturaCredito fCredito = new FacturaCredito(102, c2, 3000.00, 300.00, 6);
        FacturaContado fNegativa = new FacturaContado(103, c1, 100.00, 150.00); // Caso límite: Descuento > Total

        System.out.println("\n1. Factura al Contado (Con descuento):");
        fContado.mostrarFactura();

        System.out.println("\n2. Factura a Crédito (Con recargo y cuotas):");
        fCredito.mostrarFactura();

        System.out.println("\n3. Validación de Total No Negativo:");
        fNegativa.mostrarFactura();
    }
}
/*
 EXPLICACIÓN:
 
  1. Aplicación de Herencia:
     - Se definió la clase base 'Factura', la cual agrupa atributos comunes (numero, cliente, total).
     - Las clases 'FacturaContado' y 'FacturaCredito' heredan de 'Factura' reutilizando su
       estructura básica mediante la instrucción 'extends'.
  
  2. Sobreescritura de Métodos (@Override) y 'super':
     - En 'FacturaContado', el método 'calcularTotal()' sobrescribe la versión padre. Utiliza
       'super.calcularTotal()' para validar y obtener el monto base, y luego aplica el descuento.
     - En 'FacturaCredito', 'calcularTotal()' obtiene el total base de la clase padre y le aplica
       el recargo correspondiente por financiamiento en cuotas.
  
  3. Encapsulamiento y Validaciones:
     - Atributos clave como 'montoBase', 'descuento' y 'recargo' se mantienen protegidos o privados.
     - Se incorporan validaciones en 'calcularTotal()' para evitar que los totales finales resulten
       en valores negativos o no válidos.
 */