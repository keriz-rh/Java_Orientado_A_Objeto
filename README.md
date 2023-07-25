# Java_Orientado_A_Objeto
Se hará una recopilación del codigo escrito durante el curso de java orientado a objetos de #AluraLatam y #OracleOneNextEducaction

# Conceptos generales:
 A continuación te proporciono una lista de conceptos generales que son fundamentales para comprender la Programación Orientada a Objetos (POO):

1. Clase: Es una plantilla o modelo que define las propiedades y comportamientos que tendrán los objetos creados a partir de ella. Representa un tipo de dato personalizado.

2. Objeto: Es una instancia concreta de una clase. Es una entidad que tiene atributos y puede realizar acciones definidas por la clase.
   
3. Atributo: Representa las características o propiedades de un objeto. Son variables declaradas dentro de una clase.

4. Método: Son funciones o procedimientos definidos dentro de una clase que definen el comportamiento de los objetos creados a partir de esa clase.

   
```java
   // Clase que representa una Persona
public class Persona {
    // Atributos
    String nombre;
    int edad;

    // Método
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

// Uso de la clase Persona
public class Main {
    public static void main(String[] args) {
        // Creación de objetos (instancias) de la clase Persona
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.edad = 30;

        Persona persona2 = new Persona();
        persona2.nombre = "María";
        persona2.edad = 25;

        // Uso del método saludar()
        persona1.saludar(); // Salida: "Hola, soy Juan y tengo 30 años."
        persona2.saludar(); // Salida: "Hola, soy María y tengo 25 años."
    }
}
```
5. Encapsulación: Es un principio de POO que consiste en ocultar los detalles internos de una clase y exponer solo aquellos métodos y atributos que sean necesarios para interactuar con el objeto.
```java
// Clase que representa un Banco con encapsulación
public class Banco {
    // Atributos privados
    private String nombre;
    private int cantidadClientes;

    // Métodos públicos para acceder y modificar los atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }

    public void setCantidadClientes(int cantidadClientes) {
        this.cantidadClientes = cantidadClientes;
    }
}

// Uso de la clase Banco con encapsulación
public class Main {
    public static void main(String[] args) {
        Banco miBanco = new Banco();
        miBanco.setNombre("Banco XYZ");
        miBanco.setCantidadClientes(1000);

        System.out.println("Nombre del banco: " + miBanco.getNombre());
        System.out.println("Cantidad de clientes: " + miBanco.getCantidadClientes());
    }
}

```

6. Herencia: Es un mecanismo mediante el cual una clase puede heredar propiedades y comportamientos de otra clase. Permite crear jerarquías de clases y reutilizar código.
```java
// Clase base que representa un Animal
public class Animal {
    String especie;

    public void emitirSonido() {
        System.out.println("Sonido indefinido");
    }
}

// Clase derivada que representa un Perro, heredando de Animal
public class Perro extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("Guau guau");
    }
}

// Uso de las clases Animal y Perro con herencia
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emitirSonido(); // Salida: "Sonido indefinido"

        Perro perro = new Perro();
        perro.emitirSonido(); // Salida: "Guau guau"
    }
}

```
7. Polimorfismo: Es la capacidad de un objeto de tomar múltiples formas. En Java, esto se logra a través de la sobreescritura de métodos y la implementación de interfaces.
   
 ```java
// Clase base que representa una Figura
public class Figura {
    public void dibujar() {
        System.out.println("Dibujando figura");
    }
}

// Clases derivadas que representan figuras específicas
public class Circulo extends Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando círculo");
    }
}

public class Cuadrado extends Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando cuadrado");
    }
}

// Uso del polimorfismo con las clases Figura, Circulo y Cuadrado
public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo();
        Figura figura2 = new Cuadrado();

        figura1.dibujar(); // Salida: "Dibujando círculo"
        figura2.dibujar(); // Salida: "Dibujando cuadrado"
    }
}

  ```

8. Abstracción: Es el proceso de simplificar y representar entidades del mundo real en forma de clases y objetos. Permite enfocarse en los aspectos relevantes y ocultar los detalles innecesarios.
  ```java
// Clase abstracta que representa una Forma geométrica
public abstract class Forma {
    public abstract double calcularArea();
}

// Clases concretas que implementan la clase Forma
public class Circulo extends Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Rectangulo extends Forma {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }
}

// Uso de la abstracción con las clases Circulo y Rectangulo
public class Main {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5.0);
        Forma rectangulo = new Rectangulo(3.0, 4.0);

        System.out.println("Área del círculo: " + circulo.calcularArea()); // Salida: "Área del círculo: 78.53981633974483"
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea()); // Salida: "Área del rectángulo: 12.0"
    }
}

  ```
9. Interfaz: Es una colección de métodos abstractos que definen un conjunto de comportamientos que una clase debe implementar. Permite la implementación de múltiples interfaces para lograr el polimorfismo.

10. Instancia: Es un objeto específico creado a partir de una clase.

11. Constructor: Es un método especial de una clase que se ejecuta automáticamente cuando se crea un nuevo objeto. Se utiliza para inicializar los atributos del objeto.

12. Sobrecarga: Es la capacidad de definir múltiples métodos con el mismo nombre pero con diferentes parámetros. Los métodos se diferencian por la cantidad o tipos de parámetros.

13. Palabra clave `this`: Se utiliza para hacer referencia al objeto actual dentro de la clase. Permite distinguir entre el atributo de la clase y el parámetro del método que pueden tener el mismo nombre.

14. Palabra clave `super`: Se utiliza para hacer referencia a la clase padre o superclase desde una subclase. Permite acceder a los miembros de la clase padre.

15. Palabra clave `static`: Indica que un miembro (atributo o método) pertenece a la clase en lugar de pertenecer a una instancia específica. Los miembros estáticos se comparten entre todas las instancias de la clase.

Estos son algunos de los conceptos más importantes de la Programación Orientada a Objetos. Comprender y aplicar estos conceptos te permitirá crear código más modular, reutilizable y fácil de mantener. ¡Buena suerte en tu camino en la programación orientada a objetos!
_______________________________
A continuación te explico cada uno de los conceptos en el contexto de la programación orientada a objetos en Java:

1. Método:
Un método en Java es un bloque de código que contiene una serie de instrucciones que realizan una tarea específica. Los métodos son funciones asociadas a una clase y definen el comportamiento de los objetos creados a partir de esa clase. Los métodos pueden tener parámetros y pueden devolver valores. Se definen dentro de una clase y se invocan usando la notación de punto en una instancia de la clase.

```java
public class MiClase {
    // Método que suma dos números y devuelve el resultado
    public int sumar(int a, int b) {
        return a + b;
    }
}

// Uso del método
MiClase miObjeto = new MiClase();
int resultado = miObjeto.sumar(3, 5); // resultado será 8
```

2. Instancia:
Una instancia es un objeto creado a partir de una clase. En Java, las clases son solo plantillas o definiciones, mientras que las instancias son objetos reales que residen en la memoria y pueden manipularse y acceder a sus atributos y métodos. Puedes crear múltiples instancias de una misma clase.

```java
public class Persona {
    String nombre;
    int edad;
}

// Creación de instancias
Persona persona1 = new Persona();
persona1.nombre = "Juan";
persona1.edad = 30;

Persona persona2 = new Persona();
persona2.nombre = "María";
persona2.edad = 25;
```

3. Atributo:
Un atributo es una variable que pertenece a una clase y representa características o datos que los objetos creados a partir de esa clase pueden tener. Los atributos definen el estado del objeto y pueden ser de diferentes tipos de datos.

```java
public class Coche {
    String marca; // Atributo de tipo String
    int añoFabricacion; // Atributo de tipo int
    boolean enMarcha; // Atributo de tipo boolean
}

// Uso de los atributos
Coche miCoche = new Coche();
miCoche.marca = "Toyota";
miCoche.añoFabricacion = 2022;
miCoche.enMarcha = false;
```

4. Acceso estático:
En Java, los miembros estáticos (métodos y atributos estáticos) pertenecen a la clase en lugar de pertenecer a una instancia específica de la clase. Esto significa que se puede acceder a los miembros estáticos directamente a través de la clase sin necesidad de crear una instancia.

```java
public class MiClase {
    static int contador = 0; // Atributo estático

    static void aumentarContador() { // Método estático
        contador++;
    }
}

// Uso de miembros estáticos
MiClase.contador = 10; // Acceso al atributo estático
MiClase.aumentarContador(); // Llamada al método estático
```

5. Sobrecarga (Overloading):
La sobrecarga es una característica de Java que permite definir múltiples métodos con el mismo nombre dentro de una clase, pero con diferentes listas de parámetros. Esto permite que los métodos realicen acciones similares pero con diferentes tipos de datos o cantidades de parámetros.

```java
public class Calculadora {
    int sumar(int a, int b) {
        return a + b;
    }

    double sumar(double a, double b) {
        return a + b;
    }
}

// Uso de la sobrecarga
Calculadora calc = new Calculadora();
int resultado1 = calc.sumar(3, 5); // resultado1 será 8 (uso del primer método)
double resultado2 = calc.sumar(3.5, 2.1); // resultado2 será 5.6 (uso del segundo método)
```

6. Super:
La palabra clave `super` se utiliza en Java para referirse a la clase padre o superclase. Permite acceder a los miembros de la clase padre desde una subclase y se utiliza principalmente en el contexto de la herencia.

```java
public class Animal {
    void emitirSonido() {
        System.out.println("Sonido indefinido");
    }
}

public class Perro extends Animal {
    @Override
    void emitirSonido() {
        super.emitirSonido(); // Llamada al método de la clase padre
        System.out.println("Guau guau");
    }
}

// Uso de la clase Perro
Perro miPerro = new Perro();
miPerro.emitirSonido(); // Mostrará "Sonido indefinido" y luego "Guau guau"
```

7. Sobreescritura (Overriding):
La sobreescritura es una característica de la herencia en la programación orientada a objetos. Permite que una subclase proporcione una implementación específica de un método que ya está definido en la clase padre. Para lograr esto, se utiliza la anotación `@Override` en el método de la subclase.

```java
public class Animal {
    void emitirSonido() {
        System.out.println("Sonido indefinido");
    }
}

public class Perro extends Animal {
    @Override
    void emitirSonido() {
        System.out.println("Guau guau"); // Sobreescritura del método emitirSonido
    }
}

// Uso de la clase Perro
Perro miPerro = new Perro();
miPerro.emitirSonido(); // Mostrará "Guau guau"
```

Espero que esta explicación te haya ayudado a comprender estos conceptos de la programación orientada a objetos en Java. Si tienes más preguntas, no dudes en preguntar. ¡Buena programación!


Para comparar cada tipo primitivo más claramente, la siguiente tabla muestra el tamaño de cada uno.

|TIPO	   |    TAMAÑO  |
|---------|----------|
|boolean |   1 bit  |
|byte	   |    1 byte  |
|short	 |    2 bytes |
|char	   |     2 bytes  |
|int	   |     4 bytes|
|float	 |     4 bytes|
|long	   |    8 bytes  |
|double  |  	8 bytes |
