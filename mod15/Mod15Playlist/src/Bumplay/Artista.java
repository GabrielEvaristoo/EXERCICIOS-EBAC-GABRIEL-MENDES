package Bumplay;
// Superclasse Artista
public abstract class Artista {
    protected String nome;
    protected String generoMusical;
    protected int anoLancamento;
    protected String paisDeOrigem;

    public Artista(){
        this.nome=nome;
        this.generoMusical=generoMusical;
        this.anoLancamento=anoLancamento;
        this.paisDeOrigem=paisDeOrigem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public Artista(String nome, String generoMusical, int anoLancamento, String paisDeOrigem) {
        this.nome = nome;
        this.generoMusical = generoMusical;
        this.anoLancamento = anoLancamento;
        this.paisDeOrigem = paisDeOrigem;
    }

    public void classificarNacionalidade() {
        if (paisDeOrigem.equalsIgnoreCase("Brasil")) {
            System.out.println("Artista nacional.");
        } else {
            System.out.println("Artista internacional.");
        }
    }
}