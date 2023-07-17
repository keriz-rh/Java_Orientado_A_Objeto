package bytebanck_heredado;
//public son llamados codificadores de acceso 
 
public abstract class Cuenta {
	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	
	/*Static nos dice que la variable no pertenece a la instancia
	 No será alterada por la instancia sino más bien por la clase.*/
	private static int total;
	
	
	
	public Cuenta(int agencia, int numero) {
	    this.agencia = agencia;
	    this.numero = numero;
	    total++;
	   // System.out.println("Van creadas: "+total+" cuentas");
	}
	
	/*public Cuenta(int agencia) {
		
		if (agencia <= 0) {
		System.out.println("No se permite 0");
		this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Se van creando: " + total + " cuentas");

	}*/
	
	//No retorna valor
	 public abstract void depositar (double valor);
	

	/*Siempre que se tenga declarar algún mensaje de "exito o error" 
	podemos representarlo atraves de un booleano*/

	//Retorna valor
	
	public boolean retirar(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {return false;
		
		}
	}


	public boolean transferir(double valor, Cuenta cuenta) {
	    if (this.saldo >= valor) {
	        this.retirar(valor);
	        cuenta.depositar(valor);
	        return true;
	    }
	return false;
	}
	
	
	/*public boolean transferir(double valor, Cuenta cuenta){
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} return false;

	}
	*/
	public double getSaldo() {
		return this.saldo;
	}
	
	/*public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No están permitidos valores negativos");
		}
	}*/
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	}

