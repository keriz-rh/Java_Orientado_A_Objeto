package proyecto_bytebank;

public class TestReferencia {
	public static void main(String[] args) {
		
		//Variable			= Valor
		// Variable 		= 123FFD
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 200;

		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 100;

		System.out.println("Saldo primera Cuenta: " 
				+ primeraCuenta.saldo);

		System.out.println("Saldo segunda "
				+ "Cuenta:" + segundaCuenta.saldo);
		
		segundaCuenta.saldo += 400;
		System.out.println("Saldo primera "
				+ "Cuenta:" + segundaCuenta.saldo);

		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
		
		if (primeraCuenta == segundaCuenta) {
			System.out.println("Son la misma madre");
		} else {
			System.out.println("Son madres distintas");
		}
	}
}
