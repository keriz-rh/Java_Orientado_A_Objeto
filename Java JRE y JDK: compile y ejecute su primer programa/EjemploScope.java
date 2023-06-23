//Todo aquello pque esta limitado por llaves.
public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Hello world");

		//int edad = 17;
		int edad =21;
		int cantidadDePersonas = 2;
		//Todo boolean por defecto es False
		boolean esPareja;
		
		if (cantidadDePersonas > 1) {
			esPareja = true;
		} else {
			esPareja = false;
		}
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		System.out.println("El valor de la operación es: " + esPareja);
	
			if (puedeEntrar) 
			{
			System.out.println("usted puede entrar.");
		} else {
			System.out.println("Usted no esta permitido a  " + "entrar.");
		}

	}
}
