package gettersAndSetters;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
    }

    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor a 0.");
        } else if (cantidad > stock) {
            System.out.printf("Venta denegada. Stock insuficiente para '%s'. Solicitado: %d, Disponible: %d%n", nombre, cantidad, stock);
        } else {
            stock -= cantidad;
            System.out.printf(" Venta realizada: %d unidades de '%s'. Stock restante: %d%n", cantidad, nombre, stock);
        }
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor a 0. Se asignará Q1.00 por defecto.");
            this.precio = 1.0;
        }
    }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo. Se asignará 0.");
            this.stock = 0;
        }
    }
}