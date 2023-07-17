package bytebanck_heredado;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente (int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //Nos ayuda confirmar la sobreescritura de un metodo
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}
}
