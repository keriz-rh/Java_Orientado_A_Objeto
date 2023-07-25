# Java_Orientado_A_Objeto
Se hará una recopilación del codigo escrito durante el curso de java orientado a objetos de #AluraLatam y #OracleOneNextEducaction

# Conceptos generales:
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
