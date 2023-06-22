
public class EjemploValoresVariables {

	public static void main(String[] args) {
		
		//JAVA no utiliza punteros, él trabaja directamente sobre la variables.
		
		int numero1 = 5;
		int numero2 = 9;
		
		System.out.println(numero2);
		
		numero2 = numero1; //5
		System.out.println(numero2);
		
		numero1 = 88;
		// numero2 = ???
		System.out.println(numero2);

	}
}
