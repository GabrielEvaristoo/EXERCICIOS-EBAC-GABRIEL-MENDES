package mod17;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Carros> listaCarros = new ArrayList<>();

        Pegeout pegeout = new Pegeout();
        pegeout.setNome("Pegeout 208");
        pegeout.setCor("Vermelho");
        pegeout.setAno(2022);
        listaCarros.add(pegeout);

        Renault renault = new Renault();
        renault.setNome("Renault Sandero");
        renault.setCor("Preto");
        renault.setAno(2021);
        listaCarros.add(renault);

        Monza monza = new Monza();
        monza.setNome("Chevrolet Monza");
        monza.setCor("Branco");
        monza.setAno(1995);
        listaCarros.add(monza);

        // Iterar sobre os elementos da lista
        for (Carros carro : listaCarros) {
            carro.montarCarro();
        }
    }
}
