public class Notas {

    //criando as propriedades
    private double primeiro;
    private double segundo;
    private double terceiro;
    private double quarto;

    //criando construtor
    public Notas(double primeiro, double segundo, double terceiro, double quarto){
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.terceiro = terceiro;
        this.quarto = quarto;
    }

    //modificadores de acesso
    public double getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(double primeiro) {
        this.primeiro = primeiro;
    }

    public double getSegundo() {
        return segundo;
    }

    public void setSegundo(double segundo) {
        this.segundo = segundo;
    }

    public double getTerceiro() {
        return terceiro;
    }

    public void setTerceiro(double terceiro) {
        this.terceiro = terceiro;
    }

    public double getQuarto() {
        return quarto;
    }

    public void setQuarto(double quarto) {
        this.quarto = quarto;
    }
}
