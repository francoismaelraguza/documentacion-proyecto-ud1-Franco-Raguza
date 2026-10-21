# Gestor de incidencias

Aplicación Java de consola para consultar los avisos de soporte de un centro.

## Funcionalidades

- Listar todas las incidencias.
- Listar únicamente las abiertas.
- Buscar incidencias por texto (en el identificador o el título).
- Consultar una incidencia por su identificador.
- Menú interactivo cuando no se pasan argumentos.

## Requisitos

- JDK 25 o compatible.
- Maven, o el wrapper incluido en el proyecto (`mvnw.cmd`).

Comprueba la instalación:

```bash
java --version
javac --version
javadoc --version
```

## Estructura

```text
documentacion_proyecto_ud1/
├── README.md
├── docs/
└── proyecto-base-maven-gestor-incidencias/
    ├── pom.xml
    ├── mvnw.cmd
    └── src/
        └── main/
            └── java/
                └── es/
                    └── centro/
                        └── incidencias/
                            ├── App.java
                            ├── GestorIncidencias.java
                            ├── Incidencia.java
                            └── IncidenciaNoEncontradaException.java
```

## Compilación

Desde la carpeta del proyecto Maven:

```bash
.\mvnw.cmd compile
```

## Ejecución

Menú interactivo:

```bash
java -cp target/classes es.centro.incidencias.App
```

Con argumentos:

```bash
java -cp target/classes es.centro.incidencias.App <operación>
```

| Operación        | Descripción                                   |
|------------------|-----------------------------------------------|
| `ayuda`          | Muestra la ayuda                              |
| `listar`         | Muestra todas las incidencias                 |
| `abiertas`       | Muestra las incidencias abiertas              |
| `buscar <texto>` | Busca por identificador o título              |
| `detalle <id>`   | Muestra una incidencia (por ejemplo, INC-001) |


Documentación publicada:

https://francoismaelraguza.github.io/documentacion-proyecto-ud1-Franco-Raguza/es/centro/incidencias/package-summary.html

