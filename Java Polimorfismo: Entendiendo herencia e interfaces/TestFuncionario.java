package bytebanck_heredado;

public class TestFuncionario {
	public static void main(String[] args) {
		
		Funcionario diego = new Funcionario();
		diego.setNombre("Diego");
		diego.setDocumento("5465/8");
		diego.setSalario(2000);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
