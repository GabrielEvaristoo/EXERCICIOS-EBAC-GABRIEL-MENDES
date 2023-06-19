package produto;

import java.util.UUID;

public abstract class  ProdutoAbstract {
    private String nome;
    private UUID codigo;
    private String data;
   public abstract void imprimirProduto();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}


