package produto;

import java.util.HashSet;
import java.util.Set;

public class Camisa extends ProdutoAbstract{
    private String cor;
    public void setCor(String cor) throws Produtoexceptions{
        Set<String> coresValidas = new HashSet<>();
        coresValidas.add("vermelho");
        coresValidas.add("azul");
        coresValidas.add("verde");
        coresValidas.add("roxo");
        coresValidas.add("marrom");
        if(!coresValidas.contains(cor)){
            throw  new Produtoexceptions("Cor da camisa não é válida. Cores válidas: Vermelho, Azul, Verde, Amarelo, Preto");
        }
        this.cor=cor;
    }

    @Override
    public void imprimirProduto() {
        System.out.println("a camisa da cor"+" "+cor+" "+"esta disponivel");

    }
}
