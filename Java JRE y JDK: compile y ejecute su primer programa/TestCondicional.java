
public class TestCondicional {
public static void main(String[] args) {
	System.out.println("probando condicionales");
	
	//int edad = 20;
	int edad = 17;
	int cantidadPersonas = 3;
	
	if (edad >= 18) {
		System.out.println("Su edad esta dentro de lo esperado.");
		System.out.println("¡Bienvenido al desmadre!");
	} else {
		if (cantidadPersonas >= 3) {
			System.out.println("Aunque seas un niño traes barrio "
					+ "y te permito pasar.");
			System.out.println("No te ensucies y diviertete.");
		} else {
		System.out.println("Su edad NO esta dentro de lo esperado.");
		System.out.println("Vuelve a casa muchacho.");
			}
		}
	}
}
