public class Main {
    private static void mostrar(String formato, Texto texto) {
        System.out.println(formato + ": " + texto.obtenerContenido());
    }

    public static void main(String[] args) {
        String mensaje = "Hola mundo";
        Texto textoPlano = new TextoPlano(mensaje);

        mostrar("Texto plano", textoPlano);
        mostrar("Negrita", new Negrita(textoPlano));
        mostrar("Cursiva", new Cursiva(textoPlano));
        mostrar("Subrayado", new Subrayado(textoPlano));

        // Cada decorador envuelve un objeto Texto y puede combinarse con otros.
        Texto negritaYCursiva =
                new Cursiva(new Negrita(textoPlano));
        mostrar("Negrita + cursiva", negritaYCursiva);

        Texto todosLosFormatos =
                new Subrayado(
                        new Cursiva(
                                new Negrita(textoPlano)
                        )
                );
        mostrar("Negrita + cursiva + subrayado", todosLosFormatos);
    }
}
