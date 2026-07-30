package gettersAndSetters;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        setTelefono(telefono);
        setEmail(email);
    }

    public void mostrarContacto() {
        System.out.println("Contacto: " + nombre + " | Tel: " + telefono + " | Email: " + email);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) {
        if (telefono != null && telefono.matches("\\d{8}")) {
            this.telefono = telefono;
        } else {
            System.out.println("El teléfono debe tener exactamente 8 dígitos numéricos. Asignando '00000000'.");
            this.telefono = "00000000";
        }
    }

    public String getEmail() { return email; }
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("⚠️ Email inválido (debe contener '@'). Asignando 'sin_email@dominio.com'.");
            this.email = "sin_email@dominio.com";
        }
    }
}