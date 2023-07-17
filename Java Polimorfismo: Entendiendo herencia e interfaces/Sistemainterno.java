package bytebanck_heredado;

public class Sistemainterno {

	private String clave = "contraseña";
	
	 public boolean autentica(Atunticable gerente) {
		 boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		  
		 if (puedeIniciarSesion) {
			System.out.println("login exitoso");
			return true;
		} else {
			System.out.println("Erro login");
			return false;
		}
	 }
	 

}
