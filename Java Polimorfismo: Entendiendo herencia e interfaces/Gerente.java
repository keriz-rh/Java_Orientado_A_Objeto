package bytebanck_heredado;
					//Extiende de, es un.
public class Gerente extends Funcionario implements Atunticable{

	
	@Override
	public double getBonificacion() {
		return 200;
	}
	
	@Override
	public void setclave(String clave) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
}
