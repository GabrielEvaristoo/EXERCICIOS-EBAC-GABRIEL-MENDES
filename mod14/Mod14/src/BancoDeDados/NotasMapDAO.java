package BancoDeDados;

import Usuario.Notas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NotasMapDAO implements InotasDAO {
    private Map<String, Notas> listaNotas;

    public NotasMapDAO() {
        listaNotas = new HashMap<>();
    }

    @Override
    public void cadastrarNotas(Notas notas) {
        String idAluno = notas.getNumeroAluno();
        if (!listaNotas.containsKey(idAluno)) {
            listaNotas.put(idAluno, notas);
        }
    }

    @Override
    public void atualizarNotas(Notas notas) {
        String idAluno = notas.getNumeroAluno();
        if (listaNotas.containsKey(idAluno)) {
            Notas notasExistente = listaNotas.get(idAluno);

            // Atualizar os dados (exceto o ID do aluno)
            notasExistente.setNome(notas.getNome());
            notasExistente.setTurma(notas.getTurma());
            notasExistente.setNotas(notas.getNotas());

            listaNotas.put(idAluno, notasExistente);
        }
    }



    @Override
    public void excluirNotas(Notas notas) {
        String idAluno = notas.getNumeroAluno();
        if (listaNotas.containsKey(idAluno)) {
            listaNotas.remove(idAluno);
        }
    }

    @Override
    public void buscarNotas(Notas notas) {
        String idAluno = notas.getNumeroAluno();
        if (listaNotas.containsKey(idAluno)) {
            Notas notasAluno = listaNotas.get(idAluno);
            double[] notasArray = notasAluno.getNotas();


        }
    }


}