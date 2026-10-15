public final class TextoPlano implements Texto {
    private final String contenido;

    public TextoPlano(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String obtenerContenido() {
        return contenido;
    }
}
