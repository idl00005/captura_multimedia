# Changelog
## [1.1] - 2024-03-08
### Changed
- Transformadas todas las vistas html a jsp, excepto buscaClases que se ha pasado a jsf. [Ignacio Delgado Lobelle y Juan Manuel Arriaza Rey]
- Modificado web.xml para que aparezca como página de bienvenida la página principal. [Juan Manuel Arriaza Rey]
- Modicado web.xml para que la página de error 404 y error general sea personalizada. [Juan Manuel Arriaza Rey]
- 
### Added
- Añadido archivo footer.jspf y header.jspf que se emplea en las vistas jsp. [Juan Manuel Arriaza Rey]
- Añadida clase Actividad que representa a la entidad actividad. [Ignacio Delgado Lobelle]
- Añadida la clase User que representa a la entidad usuario. [Ignacio Delgado Lobelle]
- Añadido el Servlet LoginServlet que se encarga de gestionar el login de los usuarios. [Ignacio Delgado Lobelle]
- Añadido el Servlet inscribeServlet que gestiona la inscripción de nuevos usuarios. [Juan Manuel Arriaza Rey]
- Añadido controlador activityController que gestiona las actividades que se muestran en buscaClases.xhtml. [Ignacio Delgado Lobelle]
- Añadido template.xhtml que se emplea como plantilla que muestra la cabecera y pie de página [Ignacio Delgado Lobelle]
- Añadido página de detalle de actividad. [Juan Manuel Arriaza Rey]
- Generación del detalle de la actividad con JSF [Juan Manuel Arriaza Rey]

## [0.2] - 2024-02-16
### Changed
- Modificación del footer de las páginas elige suscripción, formulario inscripción y busca clases [Juan Manuel Arriaza Rey]
- Modificación con boostrap de la página principal [Ignacio Delgado Lobelle]
- Modificación con boostrap de la página de login [Ignacio Delgado Lobelle]
- Modificación con boostrap de la página de inscripción [Juan Manuel Arriaza Rey]
- Modificación con boostrap de la página de elección de suscripción [Juan Manuel Arriaza Rey]
- Modificación con boostrap de la página de búsqueda de clases [Juan Manuel Arriaza Rey]

### Added
- Imagen de fondo para el apartado de inscripción de la página principal [Ignacio Delgado Lobelle]
- Imagen de fondo para el apartado de clases de la página principal [Ignacio Delgado Lobelle] 
- Página cuenta, que muestra los datos de usuario, la duración de su membresía y permite actualizar algunos de los 
  campos. [Ignacio Delgado Lobelle]

## [0.1] - 2024-02-15

### Added
- Creación de la estructura de la página elige suscripción [Juan Manuel Arriaza Rey]
- Creación de la estructura de la página buscaClases [Juan Manuel Arriaza Rey]
- Creación de la estructura de la página formulario inscripción [Juan Manuel Arriaza Rey]
- Creación de la estructura de la página de login [Ignacio Delgado Lobelle]
- Creación de la estructura de la página principal [Ignacio Delgado Lobelle]