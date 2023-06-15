package mod17;

public class Monza extends Carros {
    @Override
    public void montarCarro() {
        super.montarCarro();
        String carroceria = "conservada";
        System.out.println("estado da carroceria: " + carroceria);
    }
}