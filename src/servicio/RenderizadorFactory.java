package servicio;

// clase factory, crea y devuelve el objeto renderizador según el tipo solicitado

public class RenderizadorFactory {

    public static IRenderizador crearRenderizador(String tipo) {

        // Validamos la entrada
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("El tipo de renderizador no puede ser nulo o vacío.");
        }

        // Usamos un 'switch' para decidir qué objeto concreto crear
        // [cite: 17]
        switch (tipo.toUpperCase()) {
            case "PDF":
                return new RenderizadorPDF();
            case "EXCEL":
                return new RenderizadorExcel();
            case "CSV":
                return new RenderizadorCSV();
            default:
                // Es buena práctica lanzar una excepción si el tipo no se conoce
                throw new IllegalArgumentException("Tipo de renderizador no soportado: " + tipo);
        }
    }


}
