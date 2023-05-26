package Bumplay;

import java.util.ArrayList;
import java.util.List;

public class Tocador {
    public static void main(String[] args) {
        // Criando instância do Tocador
        Tocador tocador = new Tocador();

        // Testando a criação de playlists para diferentes tipos de assinatura
        tocador.testarPlaylist(new Free());
        tocador.testarPlaylist(new Premium());
        tocador.testarPlaylist(new Trial());
    }

    public void testarPlaylist(Playlist playlist) {
        // Verificando o tipo de assinatura
        playlist.verificarTipoAssinatura();

        // Criando playlist com base em uma lista de artistas
        List<Artista> artistas = new ArrayList<>();
        artistas.add(new AbbeyRoadStudios());
        artistas.add(new EstúdioMosh());
        artistas.add(new StudioDeLaGrandeArmée());

        playlist.criarPlaylist(artistas);

        // Imprimindo a playlist oficial
        if (playlist.playOficial != null) {
            System.out.println("Playlist Oficial:");
            for (String item : playlist.playOficial) {
                System.out.println(item);
            }
        }
        System.out.println();
    }
}
