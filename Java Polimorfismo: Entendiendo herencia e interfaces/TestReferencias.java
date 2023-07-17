package bytebanck_heredado;

public class TestReferencias {

	public static void main(String[] args) {
		
		//El elemento más generico puede ser adaptado al elemento más especifico.
	
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(1000);
		
		
	}
	
}
