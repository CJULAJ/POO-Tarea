package herenciaSobreescritura;

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace: ¡Ladrido! (Guau guau)");
    }
}