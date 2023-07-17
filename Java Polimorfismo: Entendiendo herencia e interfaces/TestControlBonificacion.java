package bytebanck_heredado;

public class TestControlBonificacion {
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
	
		Contador Alexis = new Contador();
		Alexis.setSalario(5000);
		
		
		ControlBonificacion controlBonificacion = 
				new ControlBonificacion();
		
		
		controlBonificacion.registrarSalario(diego);  
		controlBonificacion.registrarSalario(jimena);  
		controlBonificacion.registrarSalario(Alexis);  

		
	}
}
