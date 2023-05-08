import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapmod12 {

    static Scanner usuarios = new Scanner(System.in);
    static Map<String, String> lista = new HashMap<>();

    public static void main(String args[]) {
        Mapmod12 mapmod12 = new Mapmod12();
        mapmod12.criandoLista();
        mapmod12.imprimindoLista();
    }

    private void imprimindoLista() {
        System.out.println("****Lista de mulheres****");
        lista.entrySet().stream()
                .filter(entry -> entry.getValue().equalsIgnoreCase("Feminino"))
                .forEach(entry -> System.out.println(entry.getKey()));
        System.out.println("****Lista de homens****");
        lista.entrySet().stream()
                .filter(entry -> entry.getValue().equalsIgnoreCase("Masculino"))
                .forEach(entry -> System.out.println(entry.getKey()));
    }

    private void criandoLista() {
        String entradaUsuario = "";
        while (!entradaUsuario.equalsIgnoreCase("Fim")) {
            System.out.println("Digite o nome e sexo do cliente dividido por vírgula (ex: Abner, M) ou 'Fim' para salvar");
            entradaUsuario = usuarios.nextLine();
            if (!entradaUsuario.equalsIgnoreCase("Fim")) {
                String[] partes = entradaUsuario.split(",");
                if(partes.length<2){
                    System.out.println("invalido. por favor, digite novamente. nome e sexo conforme as instruções");
                    continue;
                }
                String nomeUsuario = partes[0].trim();
                String sexoUsuario = partes[1].trim();
                while (!sexoUsuario.equalsIgnoreCase("M") && !sexoUsuario.equalsIgnoreCase("F")) {
                    System.out.println("Por favor, digite M ou F para definir o sexo do cliente:");
                    sexoUsuario = usuarios.nextLine();
                }
                if (sexoUsuario.equalsIgnoreCase("M")) {
                    sexoUsuario = "Masculino";
                } else if (sexoUsuario.equalsIgnoreCase("F")) {
                    sexoUsuario = "Feminino";
                }
                lista.put(nomeUsuario, sexoUsuario);
            }
        }
    }
}
