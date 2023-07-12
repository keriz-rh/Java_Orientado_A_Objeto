# Code Smells
## ¿Cuáles fueron los problemas presentados en la implementación de la clase Funcionario?

### Nota: Esos problemas en el código o en el diseño también son llamados de Code Smells. Existe un libro famoso llamado Clean Code, del autor Robert C Martin, que se hizo famoso por mostrar el Code Smells y como resolverlo. El libro ya es un poco antiguo, pero vale la pena leerlo.

+ Código no muy expresivo
  Por ejemplo, ¿cuál tipo de Funcionario representa el valor 0?.
  
+ Código repetido
  Es muy probable que tengamos que repetir el if en otros puntos del código
  
+ Muchos if que no paran de crecer
   Para cada nuevo tipo de Funcionario es necesario agregar una nueva condición if .
