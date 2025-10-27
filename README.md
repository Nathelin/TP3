# Trabajo Práctico N°3 - Menacho Natalia A. & Roko María G.

El siguiente es el tercer trabajo práctico de la materia de Programación Orientada a Objetos II de la carrera de Licenciatura en Sistemas de Información de la UNaM.

## Justificación de la solución.

### Requerimiento 1: El Motor de Renderizado.

- Se eligió trabajar con el patrón de diseño **factory**.

Esta elección surge a partir de que se necesita contar con distintas lógicas de renderizado, contenidas en clases, para distintos formatos de reporte. Utilizar factory permite que las clases hijas sobreescriban el constructor de acuerdo a las necesidades del cliente.

El cliente simplemente debe ingresar el tipo de reporte que requiere, sea por ejemplo pdf, y el programa operará con la clase correspondiente.

Este método es útil porque inicialmente, en ejecución, no sabemos qué subclase se requiere hasta que el usuario la elige. Además permite definir una base común para el renderizado.

Nos permite entonces definir en modo de ejecución y ocultar el funcionamiento de estas clases del cliente, para quien todos los objetos parecerán ser tratados de misma forma. Y no se acoplarán estas instancias a la clase. Todos serán tratados como formatos de renderizado.

...Añadir ejemplo en código de cómo usarlo una vez que lo tengamos?

### Requerimiento 2: La Construcción de los Reportes.
- Se eligió trabajar con el patrón de diseño **builder**.

Esta elección surge a partir de que se necesita tener una serie de parámetros obligatorios, aunque también existen numerosos parámetros opcionales. Se busca lograr que el constructor sea limpio y legible y evitar el uso excesivo de `null` al instanciar un objeto.

El método builder nos permite declarar parámetros obligatorios para todo reporte (Título y cuerpo principal) y permitir al usuario incorporar otro de los posibles datos según sus necesidades.

**ver si agregamos ejemplo de como funciona en nuestro programa**

### Requerimiento 3: El Gestor de Configuración Global.
- Se eligió trabajar con el patrón de diseño **singleton**.

Esta elección surge a partir de que se necesita un único punto de acceso a la configuración de la aplicación. Para ello, se debe instanciar una única instancia de `GestorConfiguracion`.

El método singleton nos permite garantizar que esto se cumpla. A través del mismo se crea un constructor privado accedido a través de un método público encargado de revisar si existe o no el objeto al que se busca acceder. En caso de que no exista, instanciará por su cuenta el objeto. En caso de que sí exista, siempre devolverá el único y mismo gestor de configuración al usuario, garantizando su unicidad.
