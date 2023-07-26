package com.bytebank.Test;
import com.bytebank.modulo.Cuenta;
public class CuentaEspecial extends Cuenta {

	@Override
	public void deposita(double valor) {
		super.saldo = 0.0;
	}

}
