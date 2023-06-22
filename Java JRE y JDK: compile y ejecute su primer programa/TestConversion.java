
public class TestConversion {
	public static void main(String[] args) {
		
		float puntoFlotante = 3.14F;
		
		double salario = 1270.50;
		int valor = (int) salario; //Casteamos
		System.out.println(valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);

		/* double variable1 = 230.89;
		
		int variable1Entero = (int) variable1; // Cast
		
		System.out.println(variable1Entero);
	
		//Otros tipos no se utilizan demasiado en comparación con int y double.
		//long prueba = 122222222222222L;
		
		short numeroPequeño = 13555;
		byte numeroAunMasPequeño = 15;
		float numeroDecimalPequenho = 205F;
		
		double resultado = (int) variable1 + variable1Entero;
		System.out.println(resultado); */
	}
}
