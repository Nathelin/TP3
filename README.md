# Trabajo Práctico N°3 - Menacho Natalia A. & Roko María G.

El siguiente es el tercer trabajo práctico de la materia de Programación Orientada a Objetos II de la carrera de Licenciatura en Sistemas de Información de la UNaM.

## Justificación de la solución.

### Requerimiento 1

- Se eligió trabajar con el patrón de diseño **factory**.
- Esta elección surge a partir de que se necesita contar con distintas lógicas de renderizado, contenidas en clases, para distintos formatos de reporte. Utilizar factory permite que las clases hijas sobreescriban el constructor de acuerdo a las necesidades del cliente.
- El cliente simplemente debe ingresar el tipo de reporte que requiere, sea por ejemplo pdf, y el programa operará con la clase correspondiente.
- Este método es útil porque inicialmente, en ejecución, no sabemos qué subclase se requiere hasta que el usuario la elige. Además permite definir una base común para el renderizado.

...Añadir ejemplo en código de cómo usarlo una vez que lo tengamos?

### Requerimiento 2
método builder

### Requerimiento 3
singleton


Un archivo README.md en la raíz del proyecto que explique claramente:
 Para el Requerimiento 1 (Motor de Renderizado):
o ¿Qué patrón de diseño creacional eligieron?
o ¿Por qué este patrón es la solución adecuada para este problema?
o ¿Qué problema(s) evita (ej. acoplamiento, violación del principio
Abierto/Cerrado)?
 Para el Requerimiento 2 (Construcción de Reportes):
o ¿Qué patrón de diseño creacional eligieron?
o ¿Por qué este patrón es la solución adecuada?
o ¿Qué problemas específicos del "constructor" resuelve?
 Para el Requerimiento 3 (Gestor de Configuración):
o ¿Qué patrón de diseño creacional eligieron?
o ¿Por qué este patrón es la solución adecuada para este
requerimiento?
o ¿Cómo garantizaron la unicidad de la instancia? 
