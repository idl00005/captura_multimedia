# PowerFIT - Fitness Center

PowerFIT es un gimnasio que cuenta con una aplicación web. Esta aplicación permite a sus usuarios inscribirse y 
iniciar sesión. Una vez iniciada sesión permite consultar las clases disponibles y sus horarios, así como reservar
una plaza en las mismas. Además, a la hora de inscribirse permite al usuario elegir la suscripción que más se ajuste
a sus necesidades entre tres tipos de subscripciones.

## Historias de usuario:
- El usuario podrá buscar clases de forma sencilla y rápida [Juan Manuel Arriaza Rey]
- El usuario podrá elegir la suscripción que más se ajuste a sus necesidades [Juan Manuel Arriaza Rey]
- El usuario podrá iniciar sesión en la web [Ignacio Delgado Lobelle]
- El usuario podrá acceder a la web y ver la información de la misma [Ignacio Delgado Lobelle]
- El usuario podrá inscribirse en las clases que desee [Juan Manuel Arriaza Rey]

## Construido con:
- **HTML** – Diseño de estructuras
- **CSS** – Estilos
- **JSF (JavaServer Faces)** – Framework de Java para la construcción de interfaces web basadas en componentes
- **JPA (Jakarta Persistence API)** – Acceso y gestión de datos en la base de datos
- **Patrón MVC (Model-View-Controller)** – La aplicación está organizada siguiendo este patrón:
  - **Modelo (Model):** Representado por las entidades y DAOs, que gestionan la lógica de negocio y el acceso a la base de datos mediante JPA.  
  - **Vista (View):** Implementada con páginas **XHTML de JSF**, que definen la interfaz de usuario y permiten enlazar directamente los formularios con los atributos de los beans.  
  - **Controlador (Controller):** Desarrollado mediante *Managed Beans*, que contienen la lógica para procesar las acciones del usuario y coordinar la comunicación entre la vista y el modelo.  


## Miembros del equipo:
- Juan Manuel Arriaza Rey
- Ignacio Delgado Lobelle


## Entidad relación del proyecto

- Usuario, representa a los usuarios de la aplicación. [Juan Manuel Arriaza Rey]
- Actividad, representa cada una de las clases a reservar. [Ignacio Delgado Lobelle, Juan Manuel Arriaza Rey]
- Membresía, representa los tipos de suscripción que puede elegir el usuario. [Ignacio Delgado Lobelle, Juan Manuel 
Arriaza Rey]

![](./storyboard/entidad-relacion.png)
## Resultado final del proyecto
- Página de inicio
  ![](./storyboard/index.PNG)
- Página de login
  ![](./storyboard/login.PNG)
- Elección de suscripción
![](./storyboard/inscripcion.PNG)
- Formulario de inscripción
  ![](./storyboard/formularioInscripcion.PNG)
- Buscador de clases
![](./storyboard/clases.PNG)
- Perfil del usuario
  ![](./storyboard/perfil.PNG)

