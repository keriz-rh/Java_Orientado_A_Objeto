
# Herencia
La herencia en Java es un mecanismo que permite que una clase adquiera los atributos y métodos de otra clase, conocida como clase padre o superclase. Esto promueve la reutilización de código y la creación de jerarquías de clases. La clase hija o subclase hereda los miembros de la clase padre y puede agregar nuevos miembros o modificar el comportamiento heredado.
Ejemplo: 
```java
class Gerente extends Funcionario {
```
La clase Gerente, al extender la clase Funcionario.

+ Hereda todas las características de la Funcionario.
    La clase Gerente hereda todas las características de la clase Funcionario. Todos los atributos también forman parte       de la clase Gerente.
+ Hereda todo el comportamiento de clase Funcionario.
    La clase Gerente hereda todo el comportamiento de la clase Funcionario. Significa que, todos los métodos públicos         pueden ser utilizados en la clase Gerente.
+ Es un Funcionario.
   Al extender la clase Funcionario se puede decir que el Gerente es un Funcionario. Lo que significa que lo veremos con 
   más detalles. ¡Espere!
  
la sintaxis correcta para extender una clase en Java es la siguiente
```java
        class Carro extends Vehiculo { }
```
En el mundo Java se usa la palabra llave extends. Solo por curiosidad, todas las otras afirmaciones son ejemplos de herencia en otros lenguajes

+Herencia en C#: class Carro : Vehiculo { }
+Herencia en Ruby: class Carro < Vehiculo
+Herencia en Python: class Carro (Vehicul

# Code Smells
¿Cuáles fueron los problemas presentados en la implementación de la clase Funcionario?

Nota: Esos problemas en el código o en el diseño también son llamados de Code Smells. Existe un libro famoso llamado Clean Code, del autor Robert C Martin, que se hizo famoso por mostrar el Code Smells y como resolverlo. El libro ya es un poco antiguo, pero vale la pena leerlo.

+ Código no muy expresivo
  Por ejemplo, ¿cuál tipo de Funcionario representa el valor 0?. 
+ Código repetido
  Es muy probable que tengamos que repetir el if en otros puntos del código 
+ Muchos if que no paran de crecer
   Para cada nuevo tipo de Funcionario es necesario agregar una nueva condición if .
  
