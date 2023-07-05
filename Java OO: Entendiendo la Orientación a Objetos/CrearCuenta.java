package proyecto_bytebank;

	public class CrearCuenta {
		public static void main(String[] args) {
			//vARIABLE			=	VALOR
			Cuenta primeraCuenta = new Cuenta();
			primeraCuenta.saldo = 1000;
			// primeraCuenta.pais = "peru"; NO COMPILA
			System.out.println(primeraCuenta.saldo);
			
			Cuenta segundaCuenta = new Cuenta();
			segundaCuenta.saldo = 500;
			System.out.println(segundaCuenta.saldo);
			System.out.println(primeraCuenta); //valor Default 0
			
		}
		
	}

