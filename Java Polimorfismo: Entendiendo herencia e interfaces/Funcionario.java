package bytebanck_heredado;

public class Funcionario {

	private String nombre;
	private String documento; 
	private double salario;
	
	/*Constructor es aquel metodo publico donde el tipo de objeto es la clase en sí.
	 Y este puede o no recibir variables*/
	public Funcionario() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacion() {
		return this.salario * 0.1;	
	}

}
