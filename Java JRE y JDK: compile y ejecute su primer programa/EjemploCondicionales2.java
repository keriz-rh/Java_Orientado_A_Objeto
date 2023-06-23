
public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Hello world");

		//int edad = 17;
		int edad =21;
		int cantidadDePersonas = 2;
		
		boolean esPareja = cantidadDePersonas > 1; //variable de caracte primitivo
		//boolean puedeEntrar = edad >= 18 && esPareja;
		System.out.println("El valor de la operación es: " + esPareja);
		//if (edad >= 18 || cantidadDePersonas >= 2) {
		
			if (edad >= 18 && esPareja) 
			//if (puedeEntrar) 
			{
			System.out.println("usted puede entrar.");
		} else {
			System.out.println("Usted no esta permitido a  " + "entrar.");
		}

	}
}
