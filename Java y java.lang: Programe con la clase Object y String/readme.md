
Tenemos cuatro modificadores: private, protected, default y public. Donde el orden del más restrictivo al menos restrictivo es: private, default, protected y public

--------------------------------
Clase	Package	Clase Hijo	Cualquier Package
✔    	✔       	✔         	✘
-----------------------------
protected

¡Correcto! El modificador protected funciona al igual que <<package private>> pero agrega visibilidad para los hijos (llamado de "public para los hijos").
