
Tenemos cuatro modificadores: private, protected, default y public. Donde el orden del más restrictivo al menos restrictivo es: private, default, protected y public

_________________________________________
Clase	Package	Clase Hijo	Cualquier Package
__________________________________________
✔    	✔       	✔         	✘
________________________________________________
protected

¡Correcto! El modificador protected funciona al igual que <<package private>> pero agrega visibilidad para los hijos (llamado de "public para los hijos").
______________________________________]
Y ahora, ¿qué modificador es visible en los siguientes lugares?

Clase	Package	Clase Hijo	Cualquier Package
_____________________________________
✔	✔	✘	✘
______________________________________
<<package private>> (ausencia de modificador)
En ausencia del modificador, también llamado package private o default, el miembro es visible en la clase y en el package, pero es invisible fuera del package (ni siquiera para los hijos).

1) En la clase Cuenta, elimine el modificador de acceso public y observe que su código en el package test deja de compilarse. Eliminando el modificador de acceso, transformamos la clase en package private, es decir, solo es visible dentro del paquete en el que está contenida.

2) Creamos una nueva clase, usamos el nombre CuentaEspecial, seleccionamos la superclase (Cuenta), también creamos un package llamada especial para la clase creada.

3) Tenemos un error de compilación, corríjalo implementando el constructor.

4) En la clase Cuenta, elimine el modificador protected del atributo saldo, transformándolo en un package private.

5) Tenga en cuenta que aunque la clase CuentaEspecial es una clase hija de Cuenta, no tiene acceso al atributo package private.

6) Vuelva a poner el protected y verifique que su clase hija tenga acceso nuevamente al atributo de la clase madre, incluso si está en otro paquete.

NOTA: ¡Solo es visible para los hijos!

¿Qué aprendimos?
En esta clase volvimos a hablar sobre visibilidad y aprendimos:

+ Hay 3 palabras clave relacionadas con la visibilidad: private, protected, public
+ Hay 4 niveles de visibilidad (de menor a mayor)
  + + private (visible solo en clase)
  + + <<package private>> (visible en la clase y en cualquier otro miembro del mismo paquete, que puede ser llamado de default)
  + + protected (visible en la clase y en cualquier otro miembro del mismo paquete y para cualquier hijo)
  + + public (visible en cualquier paquete)
+ Los modificadores pueden ser usados en la definición de la clase, atributo, constructor y método.

### Con respecto a javadoc 
Ya vimos en esta clase algunas tag (o anotaciones) de javadoc como @version o @author.

Aquí está la lista completa:

@author (usado en la clase o interfaz)
@version (usado en la clase o interfaz)
@param (usado en el método y constructor)
@return (usado solo en el método)
@exception o @throws (en el método o constructor)
@see
@since
@serial
@deprecated
Es importante que las etiquetas javadoc existan solo para estandarizar algunos datos fundamentales de su código fuente, como el autor y la versión

## La clase Object es la clase raíz de Java, es correcto afirmar:

No es necesario que dejar explícito en la declaración de una clase que debe heredar de Object, porque esto es automático.
no hay necesidad de heredar de Object explícitamente, el compilador inserta automáticamente la declaración.


Cualquier objeto puede ser referenciado por el tipo de Object, ya que es el principal.
el tipo de objeto es la forma más genérica de hacer referencia a un objeto.
  
