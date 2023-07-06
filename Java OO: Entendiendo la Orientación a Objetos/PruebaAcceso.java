package proyecto_bytebank;

public class PruebaAcceso {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(400);
		cuenta.retirar(300);
		System.out.println(cuenta.obtenerSaldo());
	}
}
