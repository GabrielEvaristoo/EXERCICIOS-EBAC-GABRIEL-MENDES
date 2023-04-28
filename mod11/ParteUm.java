
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class ParteUm {
    //professor, tive que ajustar o escopo do codigo e declarar o Linkedlist na classe,
    //para ter acesso a ela no metodo ImprimirLista. mas nao sei se isso é uma boa conduta de programação.
    private static List<String> lista = new LinkedList<>();
    public static void main(String args[]){
        listaDeTorcedores();
        imprimirLista();
    }


    private static void listaDeTorcedores(){
        Scanner utilizador = new Scanner(System.in);
        String nome;
        System.out.println("Digite o nome do torcedor ou digite[fim] para salvar");
        nome = utilizador.next();
        while (!nome.equalsIgnoreCase("fim")){
            lista.add(nome);
            System.out.println("Digite o nome do torcedor ou digite[fim] para salvar");
            nome= utilizador.next();
            Collections.sort(lista);


        }
        }
    private static void imprimirLista() {
        System.out.print("lista de torcedores: ");
        String listaOrganizada = String.join(", ", lista);
        System.out.println(listaOrganizada);
    }

}


