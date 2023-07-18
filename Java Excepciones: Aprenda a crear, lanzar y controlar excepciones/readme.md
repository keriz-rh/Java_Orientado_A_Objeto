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

private static void metodo2() {
        System.out.println("Inicio del metodo2");
        ArithmeticException exception = new ArithmeticException();
        throw exception;
}

5) No es necesario guardar la excepción en una referencia, puede lanzarla directamente en una línea:

private static void metodo2() {
        System.out.println("Inicio del metodo2");
        throw new ArithmeticException();
}

6) Y también puede enviar un mensaje como parámetro al constructor de la excepción:

private static void metodo2() {
        System.out.println("Inicio del metodo2");
        throw new ArithmeticException("Surgió un error");
}

7) En la siguiente clase, verá cómo crear su propia excepción.
