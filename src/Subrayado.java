public final class Subrayado extends DecoradorDeTexto {
    public Subrayado(Texto textoInterno) {
        super(textoInterno);
    }

    @Override
    public String obtenerContenido() {
        return "<u>" + textoInterno.obtenerContenido() + "</u>";
    }
}
