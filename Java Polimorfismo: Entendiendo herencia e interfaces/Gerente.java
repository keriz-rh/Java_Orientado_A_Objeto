package bytebanck_heredado;
		   //Extiende de, es un.
public class Gerente extends Funcionario{

	private String clave;
	
	public void setcalve(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "contraseña";
	}

	public double getBonificacion() {
		return super.getSalario();
	}
}

/*public class Gerente {
	private String nombre;
	private String documento;
	private double salario;
	
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
		return this.salario;
	} 
	
} */
