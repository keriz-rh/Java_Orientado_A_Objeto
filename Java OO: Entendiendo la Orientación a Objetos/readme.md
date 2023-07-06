# Idea central del paradigma OO
________________________________________________
Los datos y la funcionalidad de una entidad van de la mano.
__________________________________________________________
Un poco de programación procedural
### No es un signo de la programación procedural.
- Múltiples equipos trabajando en un solo proyecto.
+ Para que varios equipos puedan trabajar en el mismo proyecto, es necesario que las responsabilidades de cada código estén bien definidas y claras, evitando conflictos al hacer cambios y evoluciones. El código con responsabilidades cohesivas es un signo del paradigma OO.
__________________________________________________________________________
## ¿Cómo llamamos, en orientación a objeto, las características de una clase?
* Atributo

# Definiendo tipos
_______________________________________________________
+ Una clase es una especificación de un tipo, que define atributos y comportamientos.
+ Un objeto es una instancia de una clase donde podemos definir valores para sus atributos.
+ Para crear una instancia necesitamos usar la palabra clave new
__________________________________________________
# sobre métodos
* Es posible que un método no tenga parámetros.
Un método puede tener ninguno, uno o más parámetros.
Un método define el comportamiento o la forma de hacer algo.

* Este es el objetivo de los métodos, definir lo que un objeto sabe hacer. El comportamiento se implementa dentro del método.
Por convención, el nombre del método en el mundo Java debe comenzar con una letra minúscula.

* Los ejemplos de nombres de métodos son: transferir transferirPara transferisParaOtroTitular
Tenga en cuenta que todos los nombres comienzan con una letra minúscula y luego usan "CamelCase".

_______________________________________________________
# ¿Cómo llamar a un método?
### ¿Cuál es la sintaxis y el orden correctos para llamar a un método con Java?
+ **nombreDeReferencia.nombreDelMetodo();**
_____________________________________________
# ¿Conoces this?
+ El this es una palabra clave.
 El this es una palabra clave igual al void, class, new, int y varias otras. El IDE Eclipce muestra todas las palabras claves en un color diferente, el color "púrpura".

+ El this es una referencia.
 El this esta es una referencia, es decir, "apunta" a un objeto.
  _____________________________________________________________________________
  # Métodos validos
  ## Suponiendo que cada método a continuación está dentro de una clase, declaraciones son válidas (compilan)
```java
      void deposita(){
      }

     void deposita(double valor, int numero){
    }
 ```
_____________________________________________________________________________________________
# ¿Dónde usar this? (Ejercicio)
Ana está practicando OO con Java y creó otra clase Cuenta con solo dos atributos y un método. Sin embargo, dado que el uso de this es opcional, ella tiene dudas sobre dónde usar la palabra clave this dentro de una clase.

Ella nos envió el código a continuación usando los caracteres [ ] en varios lugares, aquí está el código:
```java
class Cuenta {

        [1] double saldo;
        int numero;

        void deposita([2] double valor) {
            [3]saldo = [4]saldo + [5]valor;
        }
}
```
Observe que tenemos [1], [2], [3], [4] y [5] como lugares posibles para poner this, pero ¿cuál realmente funcionará y se compilará?
**La respuesta correcta es Solo [3] y [4]**
_________________________________________________________
# Declaración de método (ejercicio)
Pedro escribió el siguiente método, que no está compilando:
```java
// asumiendo que este método está dentro de la clase Cuenta que tiene los atributos
public void sacar(double valor) {
    if(saldo >= valor) {
        saldo -= valor;
        return true;
    } else {
        return false;
    }
}
```
"¿Qué hay de malo con el método?"
### RESPUESTA
### Era necesario definir el tipo correcto de retorno en el método.
* El método no puede declararse como void. Es correcto usar el tipo boolean:
```java
public boolean sacar(double valor) {

    if(saldo >= valor) {
        saldo -= valor;
        return true;
    } else {
        return false;
    }
}
```
__________________________________________________________________
# Lo que aprendimos

### En esta clase hablamos sobre el comportamiento que son los métodos.

### Vimos:

+ *cómo definir métodos con parámetros y retorno cómo devolver algo usando la palabra clave return cómo usar la referencia thispara acceder a un atributo que podemos pasar una referencia como parámetro de método los métodos se invocan desde la referencia utilizando el operador.*

+ *Si aún tiene dudas sobre las referencias, this y el uso de métodos, tenga la seguridad de que en las próximas clases (y cursos) revisaremos los conceptos y practicaremos mucho más.*
_________________________________________________________________________________________

# Encapsulamiento.

### Ejemplo
Luan decidió crear un modelo para entrenar la orientación y encapsulación de objetos:
```java
public class Cliente {
    String nombre;
    private String numeroIdentidad;
    int edad;
}
// Y está creando un objeto Cliente en la otra clase:

public class Banco {

  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.nombre = "José";
    cliente.numeroIdentidad = "12312312312";
    cliente.edad = 49;
  }
}
```
 * ¿Qué podemos decir sobre el código?
 * R/ *No compila porque el numeroIdentidad es privado.*

#  Creando Getters e Setters
Paulo está creando getters y setters para la siguiente clase:
```java
public class Alumno {
    private String nombre;
    private String matricula;
}
```
### ¿Cómo sería, la declaración de getters y setters para los dos atributos de la clase?

```java
public String getNombre(){
   return this.nombre;
}

public String getMatricula(){
   return this.matricula;
}

public void setMatricula(String matricula){
   this.matricula = matricula;
}

public void setNombre(String nombre){
   this.nombre = nombre;
}
```
