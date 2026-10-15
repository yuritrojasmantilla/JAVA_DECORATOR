public final class Cursiva extends DecoradorDeTexto {
    public Cursiva(Texto textoInterno) {
        super(textoInterno);
    }

    @Override
    public String obtenerContenido() {
        return "<i>" + textoInterno.obtenerContenido() + "</i>";
    }
}
