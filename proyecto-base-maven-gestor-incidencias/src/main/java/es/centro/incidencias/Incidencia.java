package es.centro.incidencias;

import java.util.Locale;

/**
 * Representa una incidencia de soporte del centro.
 *
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;
    /**
     * Crea una incidencia.
     *
     * @param id identificador único (por ejemplo, "INC-001")
     * @param titulo descripción breve del problema
     * @param prioridad prioridad de la incidencia (alta, media o baja)
     * @param abierta {@code true} si la incidencia sigue abierta
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }
    /** @return el identificador de la incidencia */
    public String getId() {
        return id;
    }

    /** @return el título de la incidencia */
    public String getTitulo() {
        return titulo;
    }

    /** @return la prioridad de la incidencia */
    public String getPrioridad() {
        return prioridad;
    }

    /** @return {@code true} si la incidencia está abierta */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprueba si el texto que se pasa como parametro aparece en el id o en el título
     *
     * @param texto
     * @return {@code true} si hay coincidencia
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}
