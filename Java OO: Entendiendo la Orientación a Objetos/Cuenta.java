package proyecto_bytebank;
/*public son llamados codificadores de acceso esto permite que
 que sea visible desde cualquier parte del codigo
 de igual manera tenemos al private, con esta no tenemos accso a la información*/
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular = new Cliente();

	//No retorna valor
	void depositar(double valor) {
		//Esta cuenta		 Esta Cuenta
		//This account		 this account
		//This object
		this.saldo = this.saldo + valor;
	}

	/*Siempre que se tenga declarar algún mensaje de "exito o error" 
	podemos representarlo atraves de un booleano*/

	//Retorna valor
	public boolean retirar(double valor){
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} return false;

	}

	public boolean transferir(double valor, Cuenta cuenta){
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			cuenta.depositar(valor);
			return true;
		} return false;

	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		} else {
			System.out.println("No están permitidos valores negativos");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}

