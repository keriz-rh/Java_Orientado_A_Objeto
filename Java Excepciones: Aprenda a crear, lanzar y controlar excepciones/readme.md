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

Para lanzar una excepción, además de instanciarla, es necesario lanzarla a través del throw.

La excepción solo se puede lanzar a través de su referencia, por ejemplo:

 Podemos asignar un mensaje a la excepción.
