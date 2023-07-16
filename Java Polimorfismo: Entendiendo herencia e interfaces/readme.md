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
