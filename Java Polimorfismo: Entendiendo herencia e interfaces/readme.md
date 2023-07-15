
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

# This y super
![image](https://github.com/Kerizr/Java_Orientado_A_Objeto/assets/114261500/3c500f8e-9ec6-4be8-9a50-9b87838b4839)

# Dominando la herencia
Sobre la herencia en Java, tenemos las siguientes declaraciones:

+ Una clase puede tener varias hijas, pero solo una madre.

+ Desde una instancia de una clase hija, podemos llamar a cualquier método público que haya sido declarado en la clase Madre.

+ En el siguiente ejemplo, Perro también hereda todo de la clase Animal:

```java 
class Animal {
    // atributos y métodos
}

class Mamifero extends Animal {
    // atributos y métodos
}

class Perro extends Mamifero {
    // atributos y métodos
}
```
**Se puede llamar a cualquier método de la clase madre. Una clase puede tener diversas “hijas y nietas” (que se heredan unos de otros) pero no podemos escoger lo que será heredado.**

# Sobreescritura 
a sobreescritura es un concepto importante de la herencia, porque permite redefinir un comportamiento previsto en la clase madre a través de la clase hija. Ahora vea la clase Vehiculo abajo.
```java
class Vehiculo {
    public  void encender() {
        // Alguna implementación
    }
}
```
Y la clase Hija Carro:
```java
class Carro extends Vehiculo {
    // ????
}
```

```java
public void encender() {
    // implementación
}
```
Observe que el método posee la misma firma. Esto significa, una misma visibilidad, un mismo retorno, un mismo nombre y los mismo parámetros.

## Visibilidad
En relación con lo que ha aprendido hasta ahora, el orden correcto de los modificadores de visibilidad, de menor a mayor visibilidad es el siguiente

private < public < protected

+ La palabra llave con menor visibilidad es private, después viene protected y después public.
+ private - solo visible dentro de la clase.
+ protected - visible dentro de la clase y también para las hijas.
+ public - visible en todo lugar.
+ También tenga en cuenta que protected está relacionado con la herencia.

# Modificadores de acceso
Los modificadores de acceso o accesibilidad son algunas palabras claves utilizadas en el lenguaje Java para definir el nivel de accesibilidad que los elementos de una clase (atributos y métodos) e incluso la propia clase puede tener los mismos elementos de otra clase.

Public

Este es el modificador menos restrictivo de todos. De esta manera, cualquier componente puede acceder a los miembros de la clase, las clases y las interfaces.

Protected

Al usar este modificador de acceso, los miembros de la clase y las clases son accesibles para otros elementos siempre que estén dentro del mismo package o, si pertenecen a otros packages, siempre que tengan una relación extendida (herencia), es decir, las clases secundarias pueden acceder a los miembros de su clase principal (o clase de abuelos, etc.).

Private

Este es el modificador de acceso más restrictivo de todos. Solo se puede acceder a los miembros definidos como privados desde dentro de la clase y desde ningún otro lugar, independientemente del paquete o la herencia.

###  Private x Protected
¿Cuál es la diferencia entre private y protected?
Solo la propia clase en sí ve atributos/métodos private, mientras que protected es visto por la propia clase más las clases hijas.

# Sobrecarga
Existe otro concepto en los lenguajes OO que se llama sobrecarga que es mucho más simple que la sobreescritura y no depende de la herencia.

Por ejemplo, en nuestra clase Gerente, imagina otro nuevo método autenticar que recibe además de la contraseña también el login:
```java 
public class Gerente extends Funcionario {

    private int contraseña;

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean autenticar(int contraseña) {
        if (this.contraseña == contraseña) {
            return true;
        } else {
            return false;
        }
    }

    // Nuevo método, recibiendo dos parámetros
    public boolean autenticar(String login, int contraseña) {
        // implementación omitida
    }

    // Otros métodos omitidos
}
```
Observe que hemos creado una nueva versión del método autenticar. Ahora tenemos dos métodos de autenticar en la misma clase que varían en el número o tipo de parámetros. Esto se llama sobrecarga de métodos.

La sobrecarga no tiene en cuenta la visibilidad o retorno del método, solo los parámetros y no depende de la herencia.

 # Lo aprendido 
+ que la clase madre es llamada de super o base class.
+ que la clase hija también es llamada de sub class.
+ como aumentar la visibilidad de un miembro (atributo, método) a través de protected.
+ cómo acceder o llamar un miembro (atributo, método) a través de super.
+ cómo redefinir un método a través de la sobreescritura. En la próxima clase veremos un nuevo beneficio de la herencia, el Polimorfismo. ¡Aguarda!

# Code Smells
¿Cuáles fueron los problemas presentados en la implementación de la clase Funcionario?

Nota: Esos problemas en el código o en el diseño también son llamados de Code Smells. Existe un libro famoso llamado Clean Code, del autor Robert C Martin, que se hizo famoso por mostrar el Code Smells y como resolverlo. El libro ya es un poco antiguo, pero vale la pena leerlo.

+ Código no muy expresivo
  Por ejemplo, ¿cuál tipo de Funcionario representa el valor 0?. 
+ Código repetido
  Es muy probable que tengamos que repetir el if en otros puntos del código 
+ Muchos if que no paran de crecer
   Para cada nuevo tipo de Funcionario es necesario agregar una nueva condición if .
  
