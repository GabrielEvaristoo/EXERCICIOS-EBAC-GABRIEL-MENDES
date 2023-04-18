public class Resultado {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("Pedro", 17, 1);
        Alunos aluno2 = new Alunos("Maria Eduarda", 19, 3);
        Alunos aluno3 = new Alunos("Luiza", 18, 2);

        Notas notasPedro = new Notas(9.5, 7.3, 4.0, 10.0);
        Notas notasMariaEduarda = new Notas(6.5, 4.9, 2.4, 9.0);
        Notas notasLuiza = new Notas(7.7, 8.0, 8.9, 8.8);

        calcularMedia(aluno1, notasPedro);
        calcularMedia(aluno2, notasMariaEduarda);
        calcularMedia(aluno3, notasLuiza);
    }

    public static void calcularMedia(Alunos aluno, Notas notas) {
        double media = (notas.getPrimeiro() + notas.getSegundo() + notas.getTerceiro() + notas.getQuarto()) / 4.0;
        if (media > 10) {
            System.out.println(aluno.getNome() + " aprovado!");
        } else {
            System.out.println(aluno.getNome() + " reprovado!");
        }
    }
}
