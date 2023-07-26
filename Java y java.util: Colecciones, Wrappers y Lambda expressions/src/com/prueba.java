package com.bytebank.modulo;

public class prueba {
	public static void main(String[] args) {
		String nombre = "kevin";//metodo literal
		String otro = new String("KEVIN");//en la practica se prefiere el metodo literal.

		//String nuevo = otro.replace("k", "K");
		//System.out.println(nuevo);

		String nuevo = nombre.toLowerCase(); //También hay que probra ToUppercase
		System.out.println(nuevo);

		char c = nombre.charAt(3); //char i
		System.out.println(c);

		int pos = nombre.indexOf("rio");
		System.out.println(pos);

		String sub = nombre.substring(1);
		System.out.println(sub);

		for(int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		} 
	}
}
