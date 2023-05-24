package BancoDeDados;

import Usuario.Notas;

public interface InotasDAO {

    public  void cadastrarNotas(Notas notas);
    public void atualizarNotas(Notas notas);
    public void excluirNotas(Notas notas);
    public void buscarNotas(Notas notas);
}
