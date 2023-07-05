package proyecto_bytebank;

public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
			this.saldo = this.saldo - valor;
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
}
