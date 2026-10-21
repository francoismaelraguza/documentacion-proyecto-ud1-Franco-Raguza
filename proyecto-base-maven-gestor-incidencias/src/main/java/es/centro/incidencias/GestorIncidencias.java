package es.centro.incidencias;

import java.util.List;

/**
 * Gestiona una colección en memoria de objetos {@link Incidencia}.
 *
 * <p>Permite listar todas la incidencias o solo las abiertas Y buscarlas por id  </p>
 *
 * @author Franco Raguza
 * @version 1.2.0
 * @since 1.0.0
 */
public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Mustra todas la incidencias.
     *
     * @return Lista con todas la incidencias.
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Muestra todas las incidencias marcadas como "abiertas".
     *
     * @return Lista que contiene solo las incidencias abiertas.
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Busca una incidencias por su id o por us titulo.
     * @param texto id o titulo de la incidencia
     * @return Lista con la incidencia o lista vacia
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Busca una incidencia por su id, sin distinguir mayúsculas.
     *
     * @param id identificador de la incidencia
     * @return la incidencia encontrada
     * @throws IncidenciaNoEncontradaException si no existe ninguna con ese id
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * Obtiene una incidencia por su id.
     *
     * @param id identificador de la incidencia
     * @return la incidencia, o {@code null} si no existe
     * @deprecated usar {@link #buscarPorId(String)}
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}
