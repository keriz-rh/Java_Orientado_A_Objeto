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

#  Ventajas de los atributos privados.
### Romulo creó una clase con varios atributos privados, pero no sabe exactamente qué ventaja utilizar este enfoque. 
* ¿Cuál es la ventaja de usar atributos privados?
* R/ La implementación interna se puede modificar sin afectar ningún código fuera de la clase misma.

  # Para aprender más: Cuidado con el modelo anémico
Durante el aprendizaje de Getters y Setters es normal pensar siempre en su necesidad de cambiar algún estado de nuestros objetos.

Pero el uso de esta práctica no siempre es el más adecuado y expresa la realidad.

Tenga en cuenta la clase Cuenta representada a continuación que usa solo getter y setters como métodos:
```java
class Cuenta{
    private String titular;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }
}
```
Continuamos usando atributos privados y nuestro modelo parece seguir perfectamente la propuesta de encapsulación donde la clase misma administra sus estados (atributos). Un uso clásico de esa cuenta nos llevaría al siguiente escenario:
```java
Cuenta cuenta = new Cuenta();
cuenta.setTitular("Fábio")
cuenta.setSaldo(100.0);
```
Todo parece perfecto, ahora imagina que necesitas retirar 50.0 de esa cuenta. Esta operación requerirá que el saldo sea suficiente. Una simple verificación de la siguiente manera aseguraría que el saldo no haya sido negativo. En nuestro ejemplo no hay límite más allá del saldo :)
```java
Cuenta cuenta = new Cuenta ();
cuenta.setTitular("Fábio")
cuenta.setSaldo(100.0);

double valorSaque = 50.0

if(cuenta.getSaldo() >= valorSaque){
    double nuevoSaldo = cuenta.getSaldo() - valorSaque;
    cuenta.setSaldo(nuevoSaldo)
}
 ```

¡Funcionó! Pero un problema es que esta lógica de restringir el retiro al monto del saldo deberá rehacerse cada vez que se necesite una operación de retiro en nuestra cuenta. Además del problema de duplicación de esta sección, un problema para la encapsulación es que quien realmente controla las reglas de saldo de la cuenta es quién está usando la cuenta. En otras palabras, nada impide que alguien implemente un límite adicional para esto y tenga una regla completamente diferente de otros objetos de tipo Cuenta:

``` java
Cuenta conta = new Cuenta ();
cuenta.setTitular("Fábio");
cuenta.setSaldo(100.0);

double valorSaque = 50.0;

if(cuenta.getSaldo() + 1000.0 >= valorSaque){
    double nuevoSaldo = conta.getSaldo() - valorSaque;
    cuenta.setSaldo(nuevoSaldo)
}
```

Cuando creamos clases que se limitan a tener atributos privados con setters y getters, generalmente decimos que son clases que solo cargan valor, por lo que comúnmente se llaman clases de títeres o `Value Objects`.

¡Una clase de títeres es una que no tiene responsabilidad, aparte de llevar un puñado de atributos! ¡Esto definitivamente no está orientado a objetos! Este modelo, aunque a veces se usa, no debería ser una práctica común al desarrollar el dominio de nuestro proyecto con el riesgo de caer en el `modelo anémico`, que es exactamente lo que la `Cuenta` es hoy. Una clase donde los datos y los comportamientos / lógica no están juntos.

Volviendo a nuestro ejemplo de la Cuenta, está claro que en el mundo real las operaciones podrían representarse con métodos como `saca()` y `deposita()` en lugar de simplemente establecer `SetSaldo()`:
```java
class Cuenta{ private String titular; private double saldo;

public void setTitular(String titular){
    this.titular = titular;
}

public String getTitular(){
    return titular;
}

public void saca(double valor){
    if(valor > 0 && saldo >= valor){
        saldo -= valor;
    }
}

public void deposita(double valor){
    if(valor>0){
        saldo += valor;
    }
}

public double getSaldo(){
    return saldo;
}
```

Tenga en cuenta que la lógica de saque y depósito está representada dentro de la clase y, además, nuestro `setSaldo()` ya no tiene sentido para el usuario de la Cuenta. La forma de interactuar con el saldo es siempre a través de una de las operaciones anteriores:

```java
Cuenta cuenta = new Cuenta(); cuenta.setTitular("Fábio"); cuenta.deposita(100.0);

double valorSaque = 50.0; cuenta.saca(valorSaque);

```

¿Mucho mejor no es así? No hay duplicaciones de código, y mucho menos otras clases que controlan el estado de nuestra cuenta como lo hicimos anteriormente.

Conclusión Los setters y getters deben usarse con precaución y no todos los atributos privados necesitan exponer estos dos métodos en riesgo de caer en un modelo anémico que tiene sus comportamientos controlados por otras clases.

## Lo que aprendimos
## Atributos privados, restringiendo el acceso a los atributos. Encapsulación de código Métodos de lectura de atributos, los getters Métodos para modificar atributos, los setters Getters y Setters de referencia

#  Utilizando constructores
## Los constructores se utilizan para inicializar los atributos.

# Ejercicio
##  ¿Por qué no suma?
Luan desarrolló un juego y siempre quiere mantener actualizada la cantidad de jugadores. Para esto, Luan escribió el siguiente código:
```java
public class Jugador {
    //Código omitido
    private int total = 0;

    public Jugador(//atributos){
       total++;
    }
}
```
Sin embargo, el contador siempre muestra 1 después de insertar un nuevo jugador. ¿Cuál es el motivo de este evento?
+ Respuesta/ **El total debe ser estático, por lo que cada vez que se crea un nuevo objeto de tipo Jugador, no se crea un nuevo total, manteniendo el valor correcto.**

## Ejrecicio
###  ¿Dónde está el error?
Todavía en el juego de Luan, tenemos otro fragmento de código:
```java
public class Juego {
    //Código omitido

    private Componente comp;
    public Juego(Usuario usuario){
       this.comp = usuario;
    }
}
```
Sin embargo, el código anterior ni siquiera se compila. ¿Cuál es el motivo de este evento?
* Respuesta/ **Se asignan objetos de diferentes tipos.**
  #  Para obtener más información: reutilizar entre constructores
  En este capítulo, nuestro aprendizaje se centró en los constructores. Están diseñados para que los objetos tengan sus atributos inicializados en la construcción misma. Esta estrategia evita estados inconsistentes en nuestro objeto. Vea esta clase:
```java
public class Carro{
    private int anho;
    private String modelo;
    private double precio;

    //getters e setters omitidos        

}
```
Como ya se sabe, cuando el constructor no se declara en la clase, se utiliza el valor predeterminado, que no recibe ningún parámetro. Por lo tanto, un uso de la clase podría ser el siguiente:
```java
Carro carro = new Carro();
carro.setAhho(2013);
carro.setPrecio(35000.0);
```
¡Falta información valiosa! ¿Cuál es su modelo? Para evitar este tipo de problema, debemos exigir los datos que tienen sentido cuando se crea el carro. Algo como:
```java
public class Carro{
    private int anho;
    private String modelo;
    private double precio;

    public Carro(int anho, String modelo, double precio){
        this.anho = anho;
        this.modelo = modelo;
        this.preco = precio;
    }
    //getters y setters omitidos        
}
```
Ahora el uso requiere la presencia de los 3 parámetros definidos.
```java
Carro carro = new Carro(2013, "Gol", 35000.0);
```
¡Todo funciona bien! Hasta que un día se le pide a nuestro sistema que acepte la creación con el paso de solo el modelo y el valor. En esta situación, el año debería verse como 2017. Una solución sería:
```java
public class Carro{
    private int anho;
    private String modelo;
    private double precio;

    public Carro(int anho, String modelo, double precio){
        this.ahno = anho;
        this.modelo = modelo;
        this.precio = precio;
    }

    //Nuevo constructor AQUI!
    public Carro(String modelo, double precio){
        this.anho = 2017;
        this.modelo = modelo;
        this.precio = precio;
    }

    //getters e setters omitidos        

}
```
Y de esa manera puedes construir autos con cualquiera de los dos constructores:
```java
Carro carro = new Carro(2013, "Gol", 35000.0);
Carro otroCarro = new Carro("Civic", 95000.0);
```
Sin embargo, en la compañía donde se codifica este sistema, hay un equipo de prueba que verificó que nuestro sistema permite la creación de un automóvil con fechas anteriores al primer automóvil que llegó a Brasil, un Peugeot traído por Santos Dumont en 1891. Además de permitir que el modelo no se pase (null) y el precio inválido.

El desarrollador pronto intentó implementar esta regla en uno de los constructores:

Tenga en cuenta que, como tenemos dos constructores, la regla también debería aplicarse al otro:

```java
public class Carro{
    private int ano;
    private String modelo;
    private double precio;

    public Carro(int ano, String modelo, double precio){
        if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("El año informado no es válido. Por eso usaremos 2017!");
            this.ano = 2017;
        }

        if( modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("El precio no es válido. Por eso usaremos 40000.0!");
            this.precio = 40000.0;
        }

    }

    //Nuevo construtor AQUI!
    public Carro(String modelo, double precio){
        this.ano = 2017;
        if( modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("El precio no es válido. Por eso usaremos 40000.0!");
            this.precio = 40000.0;

        }

        //getters e setters omitidos

    }
```
¡Funcionó, pero el código está duplicado y nuestra clase comienza a no verse bien! Los códigos duplicados requieren un mantenimiento doble en el futuro y, en la mayoría de los casos, un futuro no muy lejano. Sería genial si fuera posible reutilizar la lógica de validación del primer constructor declarado, ¿no? Reutilizaríamos todo y cualquier cambio también tendría un impacto directo. En Java podemos llamar a la implementación de un constructor a través de otro usando simplemente this () con los parámetros requeridos por el constructor.

Observe cómo se vería el segundo constructor de nuestra clase:
```java
public Carro(String modelo, double precio){
    //llamando al constructor que recibe int, String y double primero!    
        this(2017, modelo, preco);
    }
```
Mucho más simple que:
```java
public class Carro{
    private int ano;
    private String modelo;
    private double precio;

    public Carro(int ano, String modelo, double precio){
        if(ano >= 1891){
            this.ano = ano;
        }else{
            System.out.println("El año informado no es válido. Por eso usaremos 2017!");
            this.ano = 2017;
        }

        if( modelo != null){
            this.modelo = modelo;
        }else{
            System.out.println("El modelo no fue informado. Por eso usaremos Gol!");
            this.modelo = "Gol";
        }

        if(precio > 0){
            this.precio = precio;
        }else{
            System.out.println("EL precio no es válido. Por eso usaremos 40000.0!");
            this.precio = 40000.0;
        }
    }

    //Nuevo constructor AQUI!
    public Carro(String modelo, double precio){
        this(2017, modelo, precio);
    }

    //getters e setters omitidos

}
```
## Conclusión
**En Java, es posible llamar a un constructor dentro de otro, y esto se hace para evitar la duplicación de códigos y reglas. Después de todo, una regla aplicada en un constructor normalmente será la misma para el otro caso. Para esto, se usa this (), pasando los parámetros correspondientes al constructor al que desea llamar.**
### Lo que aprendimos
### Constructor de clases, que permite recibir argumentos e inicializar atributos desde la creación de un objeto. Con esto, la inicialización de los atributos recibidos en el constructor se vuelve obligatoria. Atributos de clase, atributos estáticos. Métodos de clase, métodos estáticos. Ausencia de referencia, del this, dentro de los métodos estáticos.

