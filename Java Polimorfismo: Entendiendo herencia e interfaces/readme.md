
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
+Herencia en Python: class Carro (Vehiculo)

## Crea el codigo
En Eclipse, cree un proyecto nuevo Java llamado byteBank-heredado.

Dentro del proyecto, cree la clase Funcionario con los atributos privados nombre e documentoIdentidad de tipo String, e salario de tipo double.

Genere los getters e setters para todos los atributos de la clase Funcionario

El funcionario puede recibir una bonificación del 10% de su salario, así que cree el método getBonificacion(), que haga ese cálculo:
```java
      
public double getBonificacion() {
    return this.salario * 0.1;
}
```
      
Para probar la clase que acabas de implementar, cree la clase TestFuncionario, con el método main. En él, instancia un Funcionario asignándole un nombre, documentoIndentidad y salario, e imprímelos.
```java
public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario nico = new Funcionario();

        nico.setNombre("Nico Steppat");
        nico.setDocumentoIdentidad("223355646-9");
        nico.setSalario(2590.80);

        System.out.println(nico.getNombre());
        System.out.println(nico.getBonificacion());

    }

}
```
      
Ahora, crea la clase Gerente, que es un Funcionario, luego haga que la clase herede todo de la clase Funcionario

Además, un Gerente tiene una contraseña, así que cree este atributo, de tipo entero y privado, junto a su setter, y un método para autenticar esa contraseña en el sistema:

```java     
public boolean autenticar(int contraseña) {
    if (this.contraseña == contraseña) {
        return true;
    } else {
        return false;
    }
}
```
      
Finalmente, para probar la clase Gerente, cree una clase TestGerente, con el método main. En ella instancie un Gerente, asígnale un nombre, documento de Identidad, salario y contraseña, luego imprímelos. Además de eso, pruebe la autenticación de la contraseña.
```java
public class TestGerente {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNombre("Marco");
        g1.setDocumentoIdentidad("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNombre());
        System.out.println(g1.getDocumentoIdentidad());
        System.out.println(g1.getSalario());

        g1.setContraseña(2222);
        boolean autentico = g1.autenticar(2222);

        System.out.println(autentico);

    }

}
```

En esta parte aprendemos:
+ Cuáles son los problemas que la herencia resuelve.
+ Cómo usar la herencia en Java a través de la palabra llave extends
+ Al heredar la clase hija gana todas las características (atributos) y todas las funcionalidades (métodos) de la clase madre.
+ Conocimos el primer beneficio de la herencia: La reutilización de código.


# Code Smells
¿Cuáles fueron los problemas presentados en la implementación de la clase Funcionario?

Nota: Esos problemas en el código o en el diseño también son llamados de Code Smells. Existe un libro famoso llamado Clean Code, del autor Robert C Martin, que se hizo famoso por mostrar el Code Smells y como resolverlo. El libro ya es un poco antiguo, pero vale la pena leerlo.

+ Código no muy expresivo
  Por ejemplo, ¿cuál tipo de Funcionario representa el valor 0?. 
+ Código repetido
  Es muy probable que tengamos que repetir el if en otros puntos del código 
+ Muchos if que no paran de crecer
   Para cada nuevo tipo de Funcionario es necesario agregar una nueva condición if .
  
