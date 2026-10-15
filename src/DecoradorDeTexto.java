public abstract class DecoradorDeTexto implements Texto {
    protected final Texto textoInterno;

    protected DecoradorDeTexto(Texto textoInterno) {
        this.textoInterno = textoInterno;
    }
}
