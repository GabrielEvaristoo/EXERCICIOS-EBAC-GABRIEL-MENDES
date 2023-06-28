package produto;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ProdutoReflection {
    public static void main(String[] args) {
        Class<TabelaProdutos> classe = TabelaProdutos.class;

        // Obtendo o nome da tabela
        Tabela tabelaAnnotation = classe.getAnnotation(Tabela.class);
        String nomeDaTabela = tabelaAnnotation.nome();
        System.out.println("Nome da tabela: " + nomeDaTabela);

        // Obtendo as colunas da tabela
        Field[] fields = classe.getDeclaredFields();
        for (Field field : fields) {
            // Obtendo as anotações dos campos
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof Coluna colunaAnnotation) {
                    String nomeDaColuna = colunaAnnotation.nome();
                    String tipoDaColuna = colunaAnnotation.tipo();
                    System.out.println("Nome da coluna: " + nomeDaColuna);
                    System.out.println("Tipo da coluna: " + tipoDaColuna);

                    // Outras informações da coluna
                    System.out.println("Modificadores: " + Modifier.toString(field.getModifiers()));
                    System.out.println("Visibilidade: " + getVisibility(field.getModifiers()));

                    break;
                }
            }
        }
    }

    private static String getVisibility(int modifiers) {
        if (Modifier.isPublic(modifiers)) {
            return "public";
        } else if (Modifier.isProtected(modifiers)) {
            return "protected";
        } else if (Modifier.isPrivate(modifiers)) {
            return "private";
        } else {
            return "default";
        }
    }
}
