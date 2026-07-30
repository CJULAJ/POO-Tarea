package gettersAndSetters;

public class Curso {
    private String nombreCurso;
    private double nota1;
    private double nota2;
    private double nota3;

    public Curso(String nombreCurso, double nota1, double nota2, double nota3) {
        this.nombreCurso = nombreCurso;
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    public double promedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public String estado() {
        return promedio() >= 61 ? "Aprobado" : "Reprobado";
    }

    private double validarNota(double nota) {
        if (nota >= 0 && nota <= 100) {
            return nota;
        } else {
            System.out.println("⚠️ Nota fuera de rango (0-100). Se asignará 0 por defecto.");
            return 0;
        }
    }

    public String getNombreCurso() { return nombreCurso; }
    public double getNota1() { return nota1; }
    public void setNota1(double nota1) { this.nota1 = validarNota(nota1); }

    public double getNota2() { return nota2; }
    public void setNota2(double nota2) { this.nota2 = validarNota(nota2); }

    public double getNota3() { return nota3; }
    public void setNota3(double nota3) { this.nota3 = validarNota(nota3); }
}