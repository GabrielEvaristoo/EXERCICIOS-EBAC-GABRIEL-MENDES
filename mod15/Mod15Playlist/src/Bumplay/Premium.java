package Bumplay;
import java.util.ArrayList;
import java.util.List;

class Premium extends Playlist {
    @Override
    public void verificarTipoAssinatura() {
        System.out.println("Tipo de assinatura: Premium");
    }

    @Override
    public void criarPlaylist(List<Artista> artistas) {
        // Adicionar todos os artistas à playlist, independentemente da nacionalidade
        playOficial = new ArrayList<>();

        for (Artista artista : artistas) {
            String nomeArtista = artista.getNome();
            String generoMusical = artista.getGeneroMusical();
            int anoLancamento = artista.getAnoLancamento();

            playOficial.add(nomeArtista + " - " + generoMusical);
            playOficial.add("Ano de lançamento: " + anoLancamento);
        }

        System.out.println("Playlist criada com sucesso!");
    }
}
