package proyecto_bytebank;

	public class CrearCuenta {
		public static void main(String[] args) {
			//vARIABLE			=	VALOR
			Cuenta primeraCuenta = new Cuenta();
			primeraCuenta.depositar(1000);
			// primeraCuenta.pais = "peru"; NO COMPILA
			System.out.println(primeraCuenta.getSaldo());
			
			Cuenta segundaCuenta = new Cuenta();
			segundaCuenta.depositar(400);
			System.out.println(segundaCuenta.getSaldo());
			System.out.println(primeraCuenta); //valor Default 0
			
		}
		
	}

