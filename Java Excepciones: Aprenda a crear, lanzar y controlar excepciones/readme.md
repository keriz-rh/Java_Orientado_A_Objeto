# Throwable
En Java, "Throwable" es una clase raíz de la jerarquía de excepciones. Todas las excepciones y errores en Java están subclaseadas desde esta clase, lo que permite que puedan ser capturadas y manejadas en tiempo de ejecución.

La clase "Throwable" tiene dos subclases principales:

1. "Error": Las clases que heredan de "Error" representan problemas graves que generalmente están fuera del control del programador y que indican situaciones que probablemente no se puedan recuperar. Algunos ejemplos de errores son "OutOfMemoryError" y "StackOverflowError". Normalmente, no se recomienda capturar o manejar errores en el código, ya que generalmente implican problemas críticos en la ejecución del programa.

2. "Exception": Las clases que heredan de "Exception" representan problemas que generalmente pueden ser manejados y recuperados por el programador. Las excepciones son más comunes y se utilizan para indicar situaciones anómalas en la ejecución del programa. Algunos ejemplos de excepciones son "NullPointerException", "IOException" y "NumberFormatException". Es recomendable capturar y manejar adecuadamente las excepciones en el código para evitar que el programa se bloquee o muestre mensajes de error confusos al usuario.

La jerarquía se ve de la siguiente manera:

```
                Throwable
                /      \
              Error  Exception
```

Cuando ocurre una excepción o un error durante la ejecución del programa, se puede capturar y manejar utilizando bloques "try-catch" para evitar que el programa se detenga abruptamente y, en su lugar, proporcionar una respuesta más controlada a la situación de error.

Aquí hay un ejemplo básico de cómo usar un bloque "try-catch" para manejar una excepción:

```java
public class EjemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0); // Llamamos a un método que puede arrojar una excepción
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }

    public static int dividir(int a, int b) {
        return a / b; // Aquí puede ocurrir una excepción si b es igual a 0
    }
}
```

En este ejemplo, si el valor de "b" fuera 0, se lanzaría una excepción "ArithmeticException". Mediante el bloque "try-catch", podemos capturar la excepción y manejarla adecuadamente en lugar de que el programa termine inesperadamente.

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

Las unchecked son las que extienden de RuntimeException, y por lo tanto las que no son verificadas por el compilador. Contrario a checked, que extienden de Exception y sí son verificadas en el momento pues de hacer la compilación. Entonces en resumen lo único que diferencia es al momento de la compilación, si tú quieres que el compilador te ayude a decidir cómo tratar la excepción y si tú quieres atrapar el error porque tú crees que pueda dar ese error.

## Ejercicio
¡Miguel pide ayuda!
Miguel está siguiendo el curso y decidió crear su propia excepción para representar la violación de una regla en su aplicación de stock. Escribió el siguiente código:

```java
public class StockInsuficienteException {

}
```
Luego, todo feliz y genial, fue a usar la excepción recién creada en su aplicación:
```java
public void RealizaCompra(Producto producto) { 
    //otras instrucciones aquí..
    if (totalDeProductosEnStock < 0) {
        throw new StockInsuficienteException(); 
    }
}
```
Pero recibe un error de compilación al crear una instancia de la clase.
Ayude a Miguel indicándole lo que debe hacer para que la aplicación vuelva a funcionar.

### Solución.
Miguel necesita hacer con la clase StockInsuficienteException heredar de alguna clase en la jerarquía Throwable. Por ejemplo, RuntimeException:
```java
public class StockInsuficienteException extends RuntimeException {
}
```
## Ejercicio
¡Miguel pide ayuda! #2

Miguel estaba realmente emocionado con la clase y decidió mejorar su clase de excepción StockInsuficienteException, lo que obligó al compilador a verificar si se estaba manejando la excepción. Para esto, la herencia de la clase cambió de acuerdo con el siguiente código:
```java
public class StockInsuficienteException extends Exception {

    public StockInsuficienteException (String msg) {
        super(msg);
    }

} 
```
Sin embargo, el código del método RealizaCompra empezó a dar un error. Analiza como esta:
```java
public void RealizaCompra(Producto producto) { 
    //otras instrucciones aquí..
    if (totalDeProductosEnStock < 0) {
        throw new StockInsuficienteException("Stock insuficiente"); 
    }
} 
```
¿Qué debe hacer Miguel para que su método vuelva a compilarse?
### respuesta
```java
public void RealizaCompra(Producto producto) throws StockInsuficienteException {
    //otras instrucciones aquí..
    if (totalDeProdutosEnStock < 0) {
        throw new StockInsuficienteException("Stock insuficiente"); 
    }
}
```
Correcto. ¡Eso ahí! Necesitamos cambiar la firma del método para que quede explícito que puede lanzar tal excepción.

## RESUMEN
1) Existe una gran jerarquía de clases que representan excepciones. Por ejemplo, ArithmeticException es hija de RuntimeException, que hereda de Exception, que a su vez es hija de la clase de excepciones más ancestral, Throwable. Conocer bien esta jerarquía significa saber cómo usar las excepciones en su aplicación.
2) Throwable es la clase que necesita ser extendida para poder lanzar un objeto en la pila (usando la palabra reservada throw)
3) StackOverflowError es un error de la máquina virtual para informar que la pila de ejecución no tiene más memoria.
4) Las excepciones se dividen en dos grandes categorías: las que el compilador comprueba obligatoriamente y las que no. Los primeros se denominan checked y se crean al pertenecer a una jerarquía que no pasa por RuntimeException. Los segundos son unchecked y se crean como descendientes de RuntimeException.

## Qué aprendimos
+ Existe una gran jerarquía de clases que representan excepciones. Por ejemplo, ArithmeticException es hija de RuntimeException, que hereda de Exception, que a su vez es hija de la clase de excepciones más ancestral, Throwable. Conocer bien esta jerarquía significa saber cómo usar las excepciones en su aplicación.
+ Throwable es la clase que debe extenderse para poder lanzar un objeto en la pila (usando la palabra reservada throw)
+ Es en la clase Throwable donde tenemos casi todo el código relacionado con las excepciones, incluyendo getMessage() e printStackTrace (). El resto de la jerarquía tiene solo algunas sobrecargas de constructores para comunicar mensajes específicos.
+ La jerarquía que comenzó con la clase Throwable se divide en excepciones y errores. Las excepciones se utilizan en los códigos de aplicación. Los errores son utilizados exclusivamente por la máquina virtual.
+ Las clases que heredan de Error se utilizan para informar errores en la máquina virtual. Los desarrolladores de aplicaciones no deben crear errores que hereden de Error.
+ StackOverflowError es un error de máquina virtual para informar que la pila de ejecución no tiene más memoria.
+ Las excepciones se dividen en dos categorías amplias: las que el compilador comprueba obligatoriamente y las que no.
+ Los primeros se denominan checked y se crean por pertenecer a una jerarquía que no pasa RuntimeException.
+ Los segundos están unchecked y se crean como descendientes de RuntimeException.

##  ¿Cómo compilar?
```java
class ConexionException extends Exception {

    // ------

}

// ------

class Conexion {

    public void cerrar() throws ConexionException {

        //implementación omitida
    }
}

// ------

class TestConexion {

    public static void main(String[] args) {

        Conexion con = new Conexion();

        con.cerrar ();
    }
}
```
La descripción dice que el código no se compila.

+ Simplemente agregue throws ConexionException en la firma del método main.
  + Cuando se comprueba que la excepción es checked, debemos realizar una "acción" en el método main. Una forma es poner throws en la firma del main:
```java 
public static void main(String[] args) throws ConexionException
```
+Simplemente agregue un bloque try-catch a la llamada con.cerrar() dentro del método main.
 +Como la excepción es checked, debemos realizar una "acción" en el método main. Una forma es usar try-catch:
```java
public static void main(String[] args) {

    Conexion con = new Conexion(); try {
        con.cerrar();
    } catch(ConexionException ex) {
        ex.printStackTrace();
    }
}
```
+ Simplemente eliminar extends Exception en la clase ConexionException
+ En la clase ConexionException, basta extender la clase RuntimeExeption en lugar de Exception.
+ De esta manera, se torna un unchecked y el compilador no obliga más a "tomar una acción”.

  # ¿Qué captura?
 
Ya hemos visto en este curso dos formas de capturar varias excepciones a través del bloque catch. (1) La forma tradicional, que ha funcionado desde el comienzo de Java, simplemente repite el bloque catch para cada excepción:
```java
try {
    metodoPeligrosoQuePuedeLanzarVariasExcepciones();
} catch(MiExcepcion ex) {
    ex.printStackTrace();
} catch(OtraExcepcion ex) {
    ex.printStackTrace();
}
```
Y (2) la forma más actual, que se introdujo en Java 7, le permite definir las diversas excepciones en el mismo bloque (multi catch):
```java
try {
    metodoPeligrosoQuePuedeLanzarVariasExcepciones ();
} catch(MiExcepcion | OtraExcepcion ex) { 
    // multi-catch
    ex.printStackTrace();
}
```
Encontrarás ambas formas en tu día a día como desarrollador Java. Ahora, vea la firma del "método peligroso" en cuestión:
```java
//funciona, podemos colocar dos excepciones en la firma

public void metodoPeligrosoQuePuedeLanzarVariasExcepciones() throws MiExcepcion, OtraExcepcion {
    // código omitido
}
```
Vimos otra variación más de catch, no sintáctica, sino conceptual. ¿Qué declaración se puede utilizar para capturar todas las excepciones de este "método peligroso"?

Importante: ¡asumiendo que ambas excepciones son de tipo checked!
## respuesta
```java
try { 
    metodoPeligrosoQuePuedeLanzarVariasExcepciones();
} catch(Exception ex) {
    ex.printStackTrace();
}
```
Creamos un catch genérica que captura cualquier excepción, incluidas las excepciones checked.

NOTA:
***Esto puede parecer una buena práctica, pero generalmente no lo es. Como regla general, siempre trate de ser lo más específico posible en el bloque catch favoreciendo multiples bloques de catch o utilizando multi-catch.***
