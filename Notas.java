package com.br.mod10;

import java.util.Scanner;

public class Notas {
    public static void main(String args[]) {
        Scanner usuario = new Scanner(System.in);
        Scanner notas = new Scanner(System.in);

        System.out.println("Qual é o nome do aluno? ");
        String nome = usuario.next();
        if (nome instanceof String) {

            System.out.println("Qual foi a nota final da " + nome + " no primeiro bimestre?");
            int notaPrimeiroBimestre = Integer.parseInt(notas.next());
            if (notaPrimeiroBimestre >= 0 && notaPrimeiroBimestre <= 10) {

                System.out.println("Qual foi a nota final da " + nome + " no segundo bimestre?");
                int notaSegundoBimestre = Integer.parseInt(notas.next());
                if (notaSegundoBimestre >= 0 && notaSegundoBimestre <= 10) {
                    System.out.println("Qual foi a nota final da " + nome + " no terceiro bimestre?");
                    int notaTerceiroBimestre = Integer.parseInt(notas.next());
                    if (notaTerceiroBimestre >= 0 && notaTerceiroBimestre <= 10) {
                        System.out.println("Qual foi a nota final da " + nome + " no quarto bimestre?");
                        int notaQuartoBimestre = Integer.parseInt(notas.next());
                        // calcular media
                        int mediaFinal = (notaPrimeiroBimestre + notaSegundoBimestre + notaTerceiroBimestre
                                + notaQuartoBimestre) / 4;
                        if (mediaFinal > 7) {
                            System.out.println(nome+" "+"está aprovado(a)");
                        } else if (mediaFinal < 7) {
                            System.out.println(nome+" "+"está reprovado(a)");
                        } else {
                            System.out.println(nome+" está em recuperação(a)");
                        }
                    }
                }
            }
        }
    }
}
