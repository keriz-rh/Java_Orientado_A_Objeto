# polimorfismo
El polimorfismo es un concepto fundamental en la programación orientada a objetos (POO) que se refiere a la capacidad de un objeto de tomar diferentes formas o comportamientos en función del contexto en el que se utilice.

En la POO, el polimorfismo permite que un objeto de una clase específica pueda ser tratado como un objeto de una clase más general. Esto significa que un objeto puede ser referenciado a través de una clase base, pero ejecutar el comportamiento específico definido en su clase derivada. En otras palabras, se puede utilizar una interfaz o tipo genérico para manipular objetos de diferentes clases, siempre y cuando hereden de una misma clase base o implementen una misma interfaz.

El polimorfismo se basa en dos conceptos clave: la herencia y el enlace tardío (late binding) o enlace dinámico (dynamic binding). La herencia permite que una clase herede atributos y métodos de otra clase, mientras que el enlace tardío permite que los métodos se resuelvan en tiempo de ejecución, en lugar de en tiempo de compilación.

El polimorfismo ofrece ventajas como la reutilización de código, la flexibilidad en el diseño y la capacidad de escribir código más genérico y fácil de mantener. Al aprovechar el polimorfismo, los desarrolladores pueden escribir programas más modulares y escalables, ya que los objetos pueden ser intercambiados y utilizados de manera más flexible en diferentes partes del código.

+ En el mundo orientado a objetos, el polimorfismo permite que:

Las referencias de tipos de clases más genéricos referencian objetos más específicos.
Vimos eso en el código, a través del ejemplo:

```java
Funcionario e = new Gerente();
```
Para controlar la bonificación de funcionario, cree la clase ControleBonificacion con el atributo privado suma, de tipo double, y su getter.

En esa clase, cree el método de registrar, que recibe un Funcionario por parámetro, toma su bonificación y luego lo suma con las otras bonificaciones. Y también cree el método getSuma para devolver el valor del atributo de suma:
```java
public void registrar(Funcionario e) {
    double boni = e.getBonificacion();
    this.suma = this.suma + boni;
}

public double getSuma() {
    return this.suma;
}
```
Para probar, cree dos nuevos Funcionarios, o sea, dos nuevas clases con bonificaciones diferentes. Por ejemplo, la clase EditorVideo con bonificación de $150 e la clase Designer, con bonificación de $200.

Cree la clase TestReferencias, donde instancie funcionarios diferentes. Registre sus bonificaciones y visualice sus sumas.

```java
public class TestReferencias {

    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        g1.setNombre("Marcos");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacion controle = new ControleBonificacion();
        controle.registrar(g1);
        controle.registrar(ev);
        controle.registrar(d);

        System.out.println(controle.getSuma());

    }
}
```
*aprendimos que:*

+ los objetos no cambian de tipo;
+ la referencia puede cambiar, y ahí es donde entra el polimorfismo;
+ el polimorfismo permite utilizar referencias más genéricas para comunicarse con un objeto;
+ el uso de referencias más genéricas permite desacoplar sistemas.

###  Herencia de clases

Con respecto a la herencia de clases, tenemos las afirmaciones:
+ Cuando una clase hereda de otra clase, también recibe sus métodos.
+ Cuando una clase hereda de otra clase, también recibe sus atributos.

  ## Sobre el constructor
El constructor por default de java deja de existir a partir del momento que alguno es declarado en la clase.

Tan pronto como creamos nuestro propio constructor, el constructor predeterminado (sin parámetros) deja de existir. Sin embargo, nada impide agregar explícitamente el constructor por default.

### La anotación *@Override*
Se utiliza para sobrescribir el método de la clase madre, lo que indica que se ha modificado el método original.

### Sobre la abstraccion
+ No se pueden ser instanciadas. Para crear una instancia, primero debemos crear una clase hija no abstracta.
+ Una clase abstracta representa un concepto, algo abstracto, y el compilador no permite instanciar un objeto de esa clase. + Para crear una instancia, es necesario crear primero una clase hija no abstracta.
+ No tienen cuerpo (implementación), solo definen la firma.
+ un método abstracto define solo la firma (visibilidad, retorno, nombre del método y parámetros).
+ No se puede crear una instancia, porque lo abstracto (la clase) no puede volverse concreto (objeto). Por lo tanto, no podemos instanciar objetos de una clase abstracta.
+ Puede tener métodos abstractos (sin implementació), una clase abstracta puede tener métodos sin implementación. Por lo tanto, obligamos a un hijo a implementar el método.
+ Pueden tener atributos podemos tener atributos Una clase abstracta es una clase normal, simplemente no puede instanciar y puede tener métodos abstractos. ¡El resto sigue siendo válido!
+ Puede tener métodos concretos (con implementación) como pueden tener atributos, ¡también pueden tener métodos concretos!

  ### Clase abastracta e dinterfaz
  ![image](https://github.com/Kerizr/Java_Orientado_A_Objeto/assets/114261500/a328f147-bef9-4e7e-baea-5cbbb0855eb5)

  ### Clases y metodos abstractactos
+ Las clases abstractas son útiles cuando queremos utilizar comportamientos y atributos basados ​​en clases con comportamientos comunes.
+ ¡Los beneficios de la herencia siguen siendo válidos!

+ Usamos métodos abstractos cuando queremos "forzar" a un hijo concreto (clase concreta) a implementar un método.
+ Ese es el significado de los métodos abstractos, garantizar que el hijo implemente un comportamiento.

### Lo que aprendimos
+ Qué son las clases abstractas
+ Para qué sirven las clases abstractas
+ Qué son los métodos abstractos
+ Para qué sirven los métodos abstractos

# Interfaces
Vimos en la última clase que no hay herencia múltiple en Java. ¿Cómo podemos evitar la falta de ella?
Podemos solucionar esta situación con el uso de interfaces.
Usando interfaces tenemos otra forma de lograr polimorfismo sin herencia.
TODA INTERFAZ ES ABSTRACTA
### Clases abstractactas e interfaces
+ Podemos extender solo una clase abstracta, pero podemos implementar varias interfaces.
+ Solo existe una herencia simple en Java, pero podemos implementar tantas interfaces como queramos.
+ Todos los métodos de una interfaz son abstractos, los de una clase abstracta pueden no serlo.
+ todos los métodos en la interfaz son siempre abstractos y siempre públicos.
+ En una clase abstracta podemos tener métodos concretos y abstractos.

### Sobre el polimorfismo
+ Es la capacidad de un objeto de ser referenciado por varios tipos.
+ Podemos comunicarnos con un objeto a través de diferentes tipos de variables.
+ Por ejemplo, si hay una clase Gerente que sea hija de Funcionario. Un objeto de tipo Gerente puede ser referenciado como tipo Funcionario también.
+ Tenemos polimorfismo cuando una clase se extiende de otra o también cuando una clase implementa una interfaz.
+ tenemos polimorfismo por herencia o interfaz.

  ### Aprendimos
+  No hay herencia múltiple en Java.
+ Conceptos de interfaz.
+ Diferencias entre clases abstractas e interfaces.
+ Las interfaces son una alternativa a la herencia con respecto al polimorfismo

