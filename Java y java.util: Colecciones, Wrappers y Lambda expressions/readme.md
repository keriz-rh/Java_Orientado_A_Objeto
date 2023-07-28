### SObre los arrays
+ Un array es una estructura de datos y se usa para almacenar elementos (valores primitivos o referencias)
+ Los arrays usan corchetes ([]) sintácticamente
+ ¡Los arrays tienen un tamaño fijo!
+ ¡Un array también es un objeto!
+ Los arrays son zero-based(el primer elemento se encuentra en la posición 0)
+ Un array siempre se inicializa con los valores padron.
+ Al acceder a una posición no válida recibimos la excepción ArrayIndexOutOfBoundException
+ Las matrices tienen un atributo length para conocer el tamaño
+ La forma literal de crear un array, utilizando llaves {}.
+ En el próximo capítulo hablaremos un poco más sobre array

## Cast explícito e implícito


Ya hemos hablado mucho sobre Type Cast que no es más que convertir de un tipo a otro.

Cast implícito y explícito de primitivos

Para ser correctos, ya hemos visto cast sucediendo incluso antes de definirlo. Tenemos dos ejemplos, el primero en el mundo de los primitivos:
```java
int numero = 3;
double valor = numero; //cast implícito
```
Observe que colocamos un valor de la variable numero (tipo int) en la variable valor (tipo double), sin usar un cast explícito. ¿Esto funciona? La respuesta es sí, ya que cualquier entero cabe dentro de un double. Por eso el compilador se queda quieto y no exige un cast explícito, pero nada le impide escribir lo:
```java
int numero = 3;
double valor = (double) numero; //cast explícito
```
Ahora bien, lo contrario no funciona sin cast, ya que un double no cabe en un int:
```java
double valor = 3.56;
int numero = (int) valor; //cast explícito es exigido por el compilador
```
En este caso, el compilador desecha todo el valor fraccionario y almacena solo el valor entero.

# Wrappers
En el contexto de programación en Java, un "wrapper" se refiere a un tipo de clase que se utiliza para envolver o encapsular un valor primitivo en un objeto. Los tipos primitivos en Java son aquellos que representan datos simples, como enteros, caracteres, booleanos y números en coma flotante. Los wrappers proporcionan una manera de trabajar con estos tipos primitivos como si fueran objetos, lo que permite utilizarlos en contextos donde solo se admiten objetos, como en colecciones (por ejemplo, listas o mapas) o en ciertas clases y métodos que requieren objetos.

En Java, hay ocho tipos primitivos:

1. byte
2. short
3. int
4. long
5. float
6. double
7. char
8. boolean

Y para cada uno de estos tipos primitivos, hay una clase "wrapper" correspondiente con un nombre similar:

1. Byte
2. Short
3. Integer
4. Long
5. Float
6. Double
7. Character
8. Boolean

Por ejemplo, para envolver un valor entero (tipo primitivo `int`) en un objeto, puedes usar el wrapper `Integer` de la siguiente manera:

```java
int valorPrimitivo = 42;
Integer wrapperInteger = Integer.valueOf(valorPrimitivo); // Envolver en el wrapper Integer
```

Del mismo modo, para obtener el valor primitivo desde el wrapper, puedes utilizar el método `intValue()`:

```java
int valorDesenvuelto = wrapperInteger.intValue(); // Obtener el valor primitivo desde el wrapper Integer
```

Los wrappers también proporcionan métodos útiles para convertir valores primitivos en cadenas (`toString()`) o para convertir cadenas en valores primitivos (`parseXxx()`), donde "Xxx" representa el tipo primitivo, por ejemplo, `parseInt()` para `int`.

Es importante tener en cuenta que a partir de Java 5, se introdujo la "autoboxing" y "unboxing", lo que permite que Java realice automáticamente la conversión entre tipos primitivos y sus wrappers cuando sea necesario, simplificando en gran medida el código que los involucra. Por ejemplo, ahora puedes asignar directamente un valor primitivo a un wrapper:

```java
int valorPrimitivo = 42;
Integer wrapperInteger = valorPrimitivo; // Autoboxing: Se convierte automáticamente a Integer
```

Y también se puede hacer la operación inversa de manera similar:

```java
Integer wrapperInteger = 42;
int valorPrimitivo = wrapperInteger; // Unboxing: Se convierte automáticamente a int
```

En general, los wrappers en Java son útiles cuando necesitas trabajar con tipos primitivos en contextos donde solo se permiten objetos o cuando deseas utilizar los métodos y funcionalidades adicionales proporcionadas por las clases wrapper. Sin embargo, es esencial tener en cuenta que los wrappers añaden cierta sobrecarga debido a la necesidad de envolver y desenvolver los valores primitivos, por lo que es importante utilizarlos con prudencia para evitar posibles problemas de rendimiento.

byte - 1 byte
short - 2 bytes
int - 4 bytes
long - 8 bytes
float - 4 bytes
double - 8 bytes
char - 2 bytes
boolean - 1 byte (algunas implementaciones podrían usar menos, pero generalmente es 1 byte)
Tamaños en bytes de los wrappers:

Byte - 1 byte (almacena un byte)
Short - 2 bytes (almacena un short)
Integer - 4 bytes (almacena un int)
Long - 8 bytes (almacena un long)
Float - 4 bytes (almacena un float)
Double - 8 bytes (almacena un double)
Character - 2 bytes (almacena un char)
Boolean - 1 byte (generalmente almacena un boolean, aunque algunas implementaciones podrían usar menos)
