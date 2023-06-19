package produto;

import java.util.HashSet;
import java.util.Set;

public class Tenis extends ProdutoAbstract {
    private int tamanho;

    public void setTamanho(int tamanho) throws Produtoexceptions {
        Set<Integer> tamanhosValidos = new HashSet<>();
        tamanhosValidos.add(38);
        tamanhosValidos.add(40);
        tamanhosValidos.add(42);
        tamanhosValidos.add(45);
        if (!tamanhosValidos.contains(tamanho)) {
            throw new Produtoexceptions("Tamanho inválido para o tênis!");
        }
        this.tamanho = tamanho;
    }

    @Override
    public void imprimirProduto() {
        System.out.println("o tenis tamanho"+" "+tamanho+" "+"esta disponivel");
    }
}
