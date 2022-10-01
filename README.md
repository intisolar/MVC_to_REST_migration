# MVC_to_REST_migration

Technologies used:
-Java 8
-Maven
-Spring boot
-Thymeleaf
-HTML
-Bootstrap 5
-React js

##ENG
This is part of an educational project, a series of lessons in which I teach students how to migrate from MVC to API REST applying clean code and several structure improvements. The Project is separated into different versions related to the stages we are on every lesson. Continue reading for more information about the different versions.
##ESP
Esto es parte de un proyecto educativo donde los estudiantes aprenden a migrar un proyecto de MVC con tymeleaf a una API REST aplicando código limpio y mejoras estructurales. El proyecto está separado en diferentes versiones que corresponden a cada una de las clases. Continuá leyendo para entender qué aplicamos en cada versión.

El contenido se divide en:

CAMBIO ESTRUCTURAL: Es el contenido donde nos desprendemos totalmente del modelo anterior.
MEJORA DE CÓDIGO: Implementación de herramientas que van de la mano con los principios de “código limpio” y SOLID, además de otras ventajas.
UTILIDADES: Contenidos varios que nos ayudan en el proceso de desarrollo.

# V1 : Proyecto Empleado con MVC (Solo GET Y POST)
Se partirá de un proyecto ficticio pequeño con un CRUD para una sola entidad Empleado con vistas simples de carga y muestras de datos ya conectados al back con thymeleaf y en funcionamiento. A partir de ahí se le empezarán a hacer modificaciones y mejoras clase a clase para llevarlo a un proyecto REST.

# V2: Patrón DTO (Solo GET Y POST)
En esta clase se implementarán DTOs en vez de objetos, lo cual no implicará un cambio fundamental en los proyectos. Además enseñaremos cómo crear una clase que ejecuta un algoritmo cada vez que se levanta el proyecto, lo que en este caso aplicaremos a crear entradas en la base de datos, para no lidiar con scripts externos que hay que ejecutar cada vez que se crea la BD. 


# V3: Controladores REST / Postman (CRUD COMPLETO)
Ya en este punto haremos el primer cambio estructural, borrando controladores que solo devuelven vistas y convirtiendo los métodos que devuelven Strings a respuestas HTTP mediante ResponseEntity. En este punto las vistas quedarán a un lado y aprenderemos a usar de forma básica la aplicación Postman, creando un proyecto para testeo de terminales (endpoints). 

# V4: Integración con React
Pasamos las vistas HTML a componentes de React. Aplicamos el paquete react-router-dom para crear las rutas internas. Aprendemos a consumir una API externa a través del método fetch, a enviar una solicitud y desestructurar una respuesta para mostrarla en los componentes.


# V5: Global Exception Handling
Implementamos validaciones en los DTOs de request y los controladores, excepciones personalizadas y controladores que devuelven respuestas HTTP de error aplicados a todo el proyecto a través de las anotaciones @ControllerAdvice y @ExceptionHandler.


Próximos pasos...

V6: Seguridad con JWT

En esta clase aprenderemos a crear un filtro para crear tokens de seguridad.

V7:  Servicios con interfaz e implementación / Seeders

Creamos interfaces CRUD para cada entidad, implementamos y sobreescribimos métodos en los servicios e inyectamos las interfaces en los controladores.

V8: Seguridad y autenticación en React
