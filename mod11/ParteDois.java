import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParteDois implements Comparable<ParteDois> {

        String nome;
        Character sexo;

        public ParteDois(String nome, Character sexo) {
            this.nome = nome;
            this.sexo = sexo;
        }

        @Override
        public int compareTo(ParteDois outro) {
            if (this.sexo == 'M' && outro.sexo == 'H') {
                return -1;
            } else if (this.sexo == 'H' && outro.sexo == 'M') {
                return 1;
            } else {
                return 0;
            }
        }

    public static void main(String args[]) {
        List<ParteDois> pacientes = new LinkedList<>();
        //List<ParteDois> homens = new LinkedList<>();
        //List<ParteDois> mulheres = new LinkedList<>();
        while (true) {
            Scanner cliente = new Scanner(System.in);
            System.out.println("Qual é o nome do paciente ? ");
            String nome = cliente.next();
            if (nome.equalsIgnoreCase("Fim")) {
                break;
            }
            while (true) {
                System.out.println("Qual é o sexo do" + " " + nome + "?");
                Character sexo = cliente.next().charAt(0);
                if (sexo == 'H' || sexo == 'M') {
                    pacientes.add(new ParteDois(nome, sexo));
                    break;
                } else {
                    System.out.println("Por favor, insira H para homem ou M para mulher.");
                }
            }
        }
        Collections.sort(pacientes);
        System.out.println("Lista de pacientes ordenada por gênero:");
        for (ParteDois paciente : pacientes) {
            System.out.println("Nome: " + paciente.nome + " | Sexo: " + paciente.sexo);

        }
    }
}
