# Ejemplo de flujos

Este ejemplo muestra como operar con los flujos en los procesos gestionados por java.

La clase Flujo lanza invoca al comando grep y le pasa un texto. El comando grep analiza el texto y devuelve al programa principal (Flujo) el resultado de la salida.

```mermaid
flowchart LR

F["Flujo"]--texto-->G[grep]

G-.resultado.->F

```

## Ejecutar el programa

### Compilación y Ejecución Manual:

1. Compilamos el contenido de los paquetes
   
2. Ejecutamos el programa Flujo.


>NOTA: Recuerda que te tienes que situar en la carpeta `src/main/java` para que la invocación sea correcta si lo ejecutas de forma manual.

### Compilación y ejecución con Maven

1. Compilamos todo: `mvn compile`
2. Ejecutamos: `mvn exec:java`


## Repaso de sistemas

El comando grep permite localizar un patrón dentro de una secuencia de caracteres.

Ejemplo de uso: `grep PSP grep.txt`

>NOTA: El comando anterior es lo que ejecuta el programa que se ha implementado.