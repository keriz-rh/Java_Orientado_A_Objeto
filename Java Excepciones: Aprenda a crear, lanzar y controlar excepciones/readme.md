# Sobre Stack
¿Porque la JVM utiliza usa un stack?
+ Para saber cuál método está siendo ejecutado.
  Una pila de Java es parte de la JVM y almacena los métodos que se están ejecutando. Además del bloque
  de código, la pila almacena las variables y referencias de ese bloque. Entonces, la JVM organiza la
  ejecución y sabe exactamente qué método se está ejecutando, que es siempre el método en la parte supertior
  de la pila. La JVM también sabe qué otros aún deben ejecutarse, que son precisamente los métodos que continúan.

  + Para organizar la ejecución de los metodos.
    Una pila de Java es parte de la JVM y almacena los métodos que se están ejecutando, Además de ese bloque.
    Entonces, la JVM organiza la ejecución y sabe exactamente qué método se está ejecutando, que es siempre el método
    en la parte superior de la pila. La JVM también sabe qué otros aún deben estar ejecutandose, que son precisamente
    los métodos que continúan.
    
+ Qué son las excepciones, para qué sirven y por qué se utilizarlas.
+ Cómo analizar el seguimiento de excepciones o stacktrace.
+ Manejar excepciones con bloques try-catch.
+ Manejar una excepción lanzada dentro del bloque catch.
+ Manejar múltiples excepciones con más de un bloque catcho usando Multi-Catch usando el pipe (|).

Sobre el lanzamiento de excepciones. Juzgue las siguientes afirmaciones a continuación.
Para lanzar una excepción, además de instanciarla, es necesario lanzarla a través del throw
Podemos asignar un mensaje a la excepción.
 
¡Lancemos nuestra primera excepción! Para hacer esto, siga los pasos a continuación:

1) En el proyecto Java-stack, haga una copia de la clase Flujo, renombrándola como FlujoConTratamiento.

2) En la clase FlujoConTratamiento, en el método2, elimine por completo el bucle for.

3) Crear una instancia de ArithmeticException:

ArithmeticException exception = new ArithmeticException();

4) Ahora, lanza la excepción:
```java
private static void metodo2() {
        System.out.println("Inicio del metodo2");
        ArithmeticException exception = new ArithmeticException();
        throw exception;
}
```
5) No es necesario guardar la excepción en una referencia, puede lanzarla directamente en una línea:
```java
private static void metodo2() {
        System.out.println("Inicio del metodo2");
        throw new ArithmeticException();
}
```
6) Y también puede enviar un mensaje como parámetro al constructor de la excepción:
```java
private static void metodo2() {
        System.out.println("Inicio del metodo2");
        throw new ArithmeticException("Surgió un error");
}
```
7) En la siguiente clase, verá cómo crear su propia excepción.

# Exceptciones
Throwable en la cabeza tiene dos grandes grupos de errores: errores y excepciones. Los errores son lanzados por los programadores que mantienen la máquina virtual de Java, la JVM, y las excepciones son lanzadas por nosotros que programamos sobre la JVM, la máquina virtual de Java. Dentro de este pequeño grupo de excepciones tenemos dos subgrupos: excepciones chequed y unchequed.

[04:45] Las unchecked son las que extienden de RuntimeException, y por lo tanto las que no son verificadas por el compilador. Contrario a checked, que extienden de Exception y sí son verificadas en el momento pues de hacer la compilación. Entonces en resumen lo único que diferencia es al momento de la compilación, si tú quieres que el compilador te ayude a decidir cómo tratar la excepción y si tú quieres atrapar el error porque tú crees que pueda dar ese error.
