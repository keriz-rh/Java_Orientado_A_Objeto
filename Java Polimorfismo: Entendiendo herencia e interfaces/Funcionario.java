package bytebanck_heredado;

public class Funcionario {

	private String nombre;
	private String documento; 
	private double salario;
	private int tipo;
	
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
	/*public double getBonificacion() {
		// si tipo = 1 es gerente
		// si tipo es 0 es funcionario
		
		if (this.tipo == 0) {
			return this.salario * 0.1;
		} else if (this.tipo == 1) {
			return this.salario;
		} else {
			return 0;
		}
	}*/

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	

}
