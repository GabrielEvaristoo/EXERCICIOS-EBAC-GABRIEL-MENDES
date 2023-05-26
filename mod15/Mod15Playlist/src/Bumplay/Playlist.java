package Bumplay;

import java.util.ArrayList;
import java.util.List;

public abstract class Playlist {
    protected List<String> playOficial;
    private String assinatura;

    public abstract void verificarTipoAssinatura();
    public abstract void criarPlaylist(List<Artista> artista);

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }
}
