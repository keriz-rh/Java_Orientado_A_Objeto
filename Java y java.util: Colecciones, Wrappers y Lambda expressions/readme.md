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
