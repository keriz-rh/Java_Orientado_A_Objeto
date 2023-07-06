package proyecto_bytebank;

public class PruebaConstructor {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(555);
		Cuenta cuenta2 = new Cuenta(333);
		Cuenta cuenta3 = new Cuenta(888);
		
		System.out.println(Cuenta.getTotal());
			
	}
}
