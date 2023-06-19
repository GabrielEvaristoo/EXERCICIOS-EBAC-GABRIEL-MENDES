package produto;

import javax.swing.JOptionPane;

public class App {
    @SuppressWarnings("")
    public static void main(String args[]) {
        String[] opcoes = new String[] { "1-Camisa", "2-Tenis", "3-Sair" };

        try {
            String usuario = (String) JOptionPane.showInputDialog(null, "Qual produto você deseja consultar?",
                    "Escolha um produto", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (usuario == null) {
                JOptionPane.showMessageDialog(null, "Seleção cancelada. O programa será encerrado.");
                System.exit(0);
            }

            if (usuario.equals("1-Camisa")) {
                String cor = JOptionPane.showInputDialog(null, "Qual cor de camisa você deseja?", "Escolha uma cor",
                        JOptionPane.QUESTION_MESSAGE);
                if (cor == null || cor.isEmpty()) {
                    throw new Produtoexceptions("Cor da camisa inválida.");
                }

                Camisa camisa = new Camisa();
                camisa.setCor(cor);
                camisa.imprimirProduto();
            } else if (usuario.equals("2-Tenis")) {
                String tamanhoStr = JOptionPane.showInputDialog(null, "Qual o tamanho do tênis?", "Escolha o tamanho",
                        JOptionPane.QUESTION_MESSAGE);
                if (tamanhoStr == null || tamanhoStr.isEmpty()) {
                    throw new Produtoexceptions("Tamanho do tênis inválido.");
                }
                int tamanho = Integer.parseInt(tamanhoStr);

                Tenis tenis = new Tenis();
                tenis.setTamanho(tamanho);
                tenis.imprimirProduto();
            } else if (usuario.equals("3-Sair")) {
                JOptionPane.showMessageDialog(null, "Você escolheu sair. O programa será encerrado.");
            } else {
                throw new Produtoexceptions("Opção inválida.");
            }
        } catch (Produtoexceptions ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro: Tamanho do tênis inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
