# Changelog

Todos los cambios importantes en este proyecto serán documentados en este archivo.

Este proyecto sigue versionado semántico (SemVer) y el formato de [Keep a Changelog](https://keepachangelog.com/es-ES/1.0.0/).

---
## [0.1.0] - 2026-11-17

### Added
* En DateTool se agrega:
    * getMananaDatePorZonaHoraria(String zonaHoraria) para obtener la fecha del día siguiente según la zona horaria especificada.
    * validarZonaHoraria(String zona) para validar zonas horarias.
    * getDiassemana() para tener acceso a las claves de los días de la semana.


## [0.0.2] - 2026-04-16

### Added
* Se agregan archivos de documentación del proyecto (README.md, CHANGELOG.md y LICENSE).

### Maintenance
- **CI/CD:** Implementado pipeline automatizado de compilación y despliegue a GitHub Packages.
- Se agrega entrada al pom.xml para indicar despliegue en Github Packages para **CI/CD**.

## Nota
Los cambios previos a esta versión (desde el inicio del proyecto) no están documentados por tratarse de la fase inicial de desarrollo.
