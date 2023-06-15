package mod17;

public class Renault extends Carros {
    @Override
    public void montarCarro() {
        super.montarCarro();
        String portaMala = "ampla";
        System.out.println("porta mala: " + portaMala);
    }
}