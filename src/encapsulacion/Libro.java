package encapsulacion;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public boolean esLargo() {
        return paginas > 300;
    }

    public void mostrar() {
        System.out.println("'" + titulo + "' de " + autor + " (" + paginas + " págs)");
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getPaginas() { return paginas; }
}