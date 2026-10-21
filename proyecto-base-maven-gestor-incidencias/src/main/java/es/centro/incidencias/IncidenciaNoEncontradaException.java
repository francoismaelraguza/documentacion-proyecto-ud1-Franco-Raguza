package es.centro.incidencias;
/**
 * Inicidencia que se lanza cuando no existe una incidencia con el identificador indicado.
 */
public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Crea la excepción con un mensaje que incluye el identificador buscado.
     *
     * @param id identificador que no se ha encontrado
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}
