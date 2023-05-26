package Bumplay;
import java.util.ArrayList;
import java.util.List;

class Trial extends Playlist {
    @Override
    public void verificarTipoAssinatura() {
        System.out.println("Tipo de assinatura: Trial");
    }

    @Override
    public void criarPlaylist(List<Artista> artistas) {
        // Verificar a nacionalidade de cada artista e adicionar à playlist apenas os artistas internacionais
        playOficial = new ArrayList<>();

        for (Artista artista : artistas) {
            if (!artista.getPaisDeOrigem().equalsIgnoreCase("Brasil")) {
                String nomeArtista = artista.getNome();
                String generoMusical = artista.getGeneroMusical();
                int anoLancamento = artista.getAnoLancamento();

                playOficial.add(nomeArtista + " - " + generoMusical);
                playOficial.add("Ano de lançamento: " + anoLancamento);
            }
        }

        System.out.println("Playlist criada com sucesso!");
}
}