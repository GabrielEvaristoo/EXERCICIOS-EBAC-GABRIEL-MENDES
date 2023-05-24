import BancoDeDados.InotasDAO;
import BancoDeDados.NotasMapDAO;
import Usuario.Notas;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProgramaPrincipal {
    private static InotasDAO inotasDAO;
    private static Map<String, Notas> listaNotas;

    public static void main(String args[]) {
        inotasDAO = new NotasMapDAO();
        listaNotas = new HashMap<>();

        String navegador = "";
        while (!navegador.equals("5")) {
            navegador = JOptionPane.showInputDialog(null, "1(cadastrar)\n2(atualiza)\n3(excluir)\n4(Consultar)\n5(Sair)", "Menu principal", JOptionPane.INFORMATION_MESSAGE);
            while (!navegador.equals("1") && !navegador.equals("2") && !navegador.equals("3") && !navegador.equals("4") && !navegador.equals("5")) {
                navegador = JOptionPane.showInputDialog(null, "Por favor, escolha uma opção válida abaixo:\n1(cadastrar)\n2(atualiza)\n3(excluir)\n4(Consultar)\n5(Sair)", "INVÁLIDO", JOptionPane.INFORMATION_MESSAGE);
            }
            if (navegador.equals("1")) {
                String dadosCadastrados = JOptionPane.showInputDialog(null, "Digite: nome, turma, ID do aluno", "CADASTRO", JOptionPane.INFORMATION_MESSAGE);
                String campos[] = dadosCadastrados.split(",");
                if (campos.length == 3) {
                    String nome = campos[0].trim();
                    String turma = campos[1].trim();
                    String idAluno = campos[2].trim();

                    double[] notas = new double[4];
                    boolean notasValidas = true;
                    for (int i = 0; i < 4; i++) {
                        String notaString = JOptionPane.showInputDialog(null, "Digite a nota do " + (i + 1) + "º bimestre:", "Cadastro de Notas", JOptionPane.INFORMATION_MESSAGE);
                        try {
                            double nota = Double.parseDouble(notaString.trim());
                            notas[i] = nota;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Valor inválido. Certifique-se de fornecer notas válidas.", "INVALIDO", JOptionPane.ERROR_MESSAGE);
                            notasValidas = false;
                            break;
                        }
                    }

                    if (notasValidas) {
                        Notas notasObjeto = new Notas(nome, turma, idAluno, notas);
                        inotasDAO.cadastrarNotas(notasObjeto);
                        listaNotas.put(idAluno, notasObjeto); // Adiciona o objeto à lista de notas
                        JOptionPane.showMessageDialog(null, "Notas cadastradas com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Dados inválidos. Certifique-se de fornecer todas as informações necessárias.", "INVALIDO", JOptionPane.ERROR_MESSAGE);
                }
            } else if (navegador.equals("2")) {
                String idAlunoUP = JOptionPane.showInputDialog(null, "Digite o ID do aluno para atualizar:", "ATUALIZAR", JOptionPane.INFORMATION_MESSAGE);
                boolean isCadastrado = listaNotas.containsKey(idAlunoUP);
                if (isCadastrado) {
                    Notas nomeExistente = listaNotas.get(idAlunoUP);
                    String opcaoAtualizar = JOptionPane.showInputDialog(null, "Quais dados você deseja atualizar?\n(a) Nome\n(b) Turma\n(c) Notas", "ATUALIZAR", JOptionPane.INFORMATION_MESSAGE);
                    while (!opcaoAtualizar.equalsIgnoreCase("a") && !opcaoAtualizar.equalsIgnoreCase("b") && !opcaoAtualizar.equalsIgnoreCase("c")) {
                        opcaoAtualizar = JOptionPane.showInputDialog(null, "Por favor, escolha uma opção válida abaixo:\n(a) Nome\n(b) Turma\n(c) Notas", "INVÁLIDO", JOptionPane.INFORMATION_MESSAGE);
                    }
                    if (opcaoAtualizar.equalsIgnoreCase("a")) {
                        String novoNome = JOptionPane.showInputDialog(null, "Digite o novo nome", "ATUALIZAR", JOptionPane.INFORMATION_MESSAGE);
                        nomeExistente.setNome(novoNome);
                    } else if (opcaoAtualizar.equalsIgnoreCase("b")) {
                        String novaTurma = JOptionPane.showInputDialog(null, "Digite a nova turma", "ATUALIZAR", JOptionPane.INFORMATION_MESSAGE);
                        nomeExistente.setTurma(novaTurma);
                    } else if (opcaoAtualizar.equalsIgnoreCase("c")) {
                        double[] novasNotas = new double[4];
                        boolean notasValidas = true;
                        for (int i = 0; i < 4; i++) {
                            String notaString = JOptionPane.showInputDialog(null, "Digite a nota do " + (i + 1) + "º bimestre:", "ATUALIZAR", JOptionPane.INFORMATION_MESSAGE);
                            try {
                                double nota = Double.parseDouble(notaString.trim());
                                novasNotas[i] = nota;
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Valor inválido. Certifique-se de fornecer notas válidas.", "INVALIDO", JOptionPane.ERROR_MESSAGE);
                                notasValidas = false;
                                break;
                            }
                        }
                        if (notasValidas) {
                            nomeExistente.setNotas(novasNotas);
                        }
                    }
                    inotasDAO.atualizarNotas(nomeExistente);
                    JOptionPane.showMessageDialog(null, "Notas atualizadas com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ID do aluno não encontrado.", "INVÁLIDO", JOptionPane.ERROR_MESSAGE);
                }
            } else if (navegador.equals("3")) {
                String idAlunoREMOVE = JOptionPane.showInputDialog(null, "Digite o ID do aluno para excluir:", "EXCLUIR", JOptionPane.INFORMATION_MESSAGE);
                boolean isCadastrado = listaNotas.containsKey(idAlunoREMOVE);
                if (isCadastrado) {
                    Notas notasExistente = listaNotas.get(idAlunoREMOVE);
                    String nomeUsuario = notasExistente.getNome();
                    listaNotas.remove(idAlunoREMOVE);
                    inotasDAO.excluirNotas(notasExistente);
                    JOptionPane.showMessageDialog(null, "Usuário " + nomeUsuario + " foi identificado e excluído.", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ID do aluno não encontrado.", "Inválido", JOptionPane.ERROR_MESSAGE);
                }
            } else if (navegador.equals("4")) {
                String idAlunoConsultar = JOptionPane.showInputDialog(null, "Digite o ID do aluno para consultar notas:", "NOTAS", JOptionPane.INFORMATION_MESSAGE);
                boolean isCadastrado = listaNotas.containsKey(idAlunoConsultar);
                if (isCadastrado) {
                    Notas notasAluno = listaNotas.get(idAlunoConsultar);
                    inotasDAO.buscarNotas(notasAluno);
                    String notasExibicao = "Nome: " + notasAluno.getNome() + "\nTurma: " + notasAluno.getTurma() + "\n";
                    double[] notas = notasAluno.getNotas();
                    for (int i = 0; i < notas.length; i++) {
                        notasExibicao += "Nota do " + (i + 1) + "º bimestre: " + notas[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, notasExibicao, "Consultar Notas", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "ID do aluno não encontrado.", "Inválido", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
