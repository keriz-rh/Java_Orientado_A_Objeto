package bytebanck_heredado;

public class Testsistemainterno {
	public static void main(String[] args) {
		Sistemainterno sistema = new Sistemainterno();
		Gerente g1 = new Gerente();
		Administrador a1 = new Administrador();
	
		sistema.autentica(g1);
		sistema.autentica(a1);

	}
 	
}
