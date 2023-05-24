package Usuario;

import java.util.Arrays;

public class Notas {

    private String nome;
    private String turma;
    private String numeroAluno;
    private double[] notas;

    public Notas(String nome, String turma, String numeroAluno, double[] notas) {
        this.nome = nome;
        this.turma = turma;
        this.numeroAluno = numeroAluno;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getNumeroAluno() {
        return numeroAluno;
    }

    public void setNumeroAluno(String numeroAluno) {
        this.numeroAluno = numeroAluno;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Notas{" +
                "notas=" + Arrays.toString(notas) +
                '}';
    }
}
