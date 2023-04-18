public class Alunos {

    //modificadores de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //criando as propriedades
    private String nome;
    private int idade;
    private int ano;

    //criando construtor
    public Alunos(String nome, int idade, int ano){
        this.nome=nome;
        this.idade=idade;
        this.ano=ano;
    }

    //modificadores de acessos dos alunos
    public Alunos getAluno1() {
        return aluno1;
    }

    public void setAluno1(Alunos aluno1) {
        this.aluno1 = aluno1;
    }

    public Alunos getAluno2() {
        return aluno2;
    }

    public void setAluno2(Alunos aluno2) {
        this.aluno2 = aluno2;
    }

    public Alunos getAluno3() {
        return aluno3;
    }

    public void setAluno3(Alunos aluno3) {
        this.aluno3 = aluno3;
    }

    //variáveis para os alunos
    private Alunos aluno1;
    private Alunos aluno2;
    private Alunos aluno3;
}
