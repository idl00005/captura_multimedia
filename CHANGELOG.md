# Changelog
## [3.1] - 2024-04-12
### Changed
- Modificado login.jsp por login.xhtml, sustituido su servlet por el controlador. [Ignacio Delgado Lobelle]
- Sustituido index.jsp por index.xhtml. [Ignacio Delgado Lobelle]
- Sustituido eligeSuscripcion.jsp por eligeSuscripcion.xhtml. [Ignacio Delgado Lobelle]
- Modificación de las clases Actvidad y Usuario para que se puedan persistir en una base de datos relacional. [Juan Manuel Arriaza Rey]
### Added
- Añadida la funcionalidad de busqueda de actividades por nombre.[Ignacio Delgado Lobelle]
- Añadido botón de cerrar sesión en la cabecerá cuando la sesión está iniciada.[Ignacio Delgado Lobelle]
- Configuración de las entidades JPA y conexión de la aplicación web a una BD relacional. [Juan Manuel Arriaza Rey]
- Configuración de la unidad de persistencia. [Juan Manuel Arriaza Rey]
- Precarga de datos de prueba en las tablas de las bases de datos. [Juan Manuel Arriaza Rey]
- Crear dos implemetaciones de DAO basada en JPA para la entidad Actividad y Usuario. [Juan Manuel Arriaza Rey]
- Restricción de acceso a cuenta.xhtml para usuarios que no hayan iniciado sesión. [Ignacio Delgado Lobelle]
- Creación de los archivos DAOJpaActividad y DAOJpaUsuario que implementan la interfaz DAOActividad y DAOUsuario respectivamente. [Juan Manuel Arriaza Rey]

## [2.1] - 2024-03-22
### Changed
- Modificado el Formulario de inscripción por un JSF que se encargue de enviar los datos a un controlador, realizando la
  validación de los datos enviados desde el formulario. [Ignacio Delgado Lobelle]
- Modificar detalle.xhtml por un composite component para poder visualizar el detalle de una actividad [Juan Manuel Arriaza Rey]
- Modificar el atributo de capacidad de una actividad para que se muestre el detalle de la misma al pulsar sobre ella con AJAX [Juan Manuel Arriaza Rey]
- Modificación de la tabla de actividades por un datatable de la biblioteca de primefaces y fusión con la utilización de AJAX [Ignacio Delgado Lobelle y Juan Manuel Arriaza Rey]
- Modificación de cuenta para poder realizar la validación de datos con BEAN VALIDATION [Ignacio Delgado Lobelle]
- Sustituido cuenta.jsp por el archivo JSF cuenta.xhtml que se encarga de gestionar los datos de usuario [Ignacio Delgado Lobelle]

### Added
- Creación de archivo bean clase.xhtml que se encarga de gestionar el detalle de actividad que se muestra en capacidad [Juan Manuel Arriaza Rey]
- Añadida la funcionalidad que permite actualizar los datos de Usuario [Ignacio Delgado Lobelle]

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