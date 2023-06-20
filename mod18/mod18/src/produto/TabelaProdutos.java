package produto;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface Tabela {
    String nome();
}

@Tabela(nome = "Produtos")
public class TabelaProdutos {
    @Coluna(nome = "Tamanho", tipo = "int")
    private int tamanhoTenis;

    @Coluna(nome = "Cor do Tênis", tipo = "String")
    private String corTenis;

    // Propriedades da Camisa
    @Coluna(nome = "Cor da Camisa", tipo = "String")
    private String corCamisa;

    @Coluna(nome = "Tamanho da Camisa", tipo = "int")
    private int tamanhoCamisa;

    public TabelaProdutos(int tamanhoTenis, String corTenis, String corCamisa, int tamanhoCamisa) {
        this.tamanhoTenis = tamanhoTenis;
        this.corTenis = corTenis;
        this.corCamisa = corCamisa;
        this.tamanhoCamisa = tamanhoCamisa;
    }
}