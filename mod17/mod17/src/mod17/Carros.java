package mod17;

public abstract class Carros {
    private String nome;
    private String cor;
    private int ano;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void montarCarro(){
        String carroMontado= nome +" "+cor+" "+ano;
        System.out.println("seu carro é um:" +carroMontado);
    }

}
