package java_pila_ejecucion;

public class Flujo {

		  public static void main(String[] args) {
		    System.out.println("Inicio de main");
		    try {
				metodo1();
			} catch (Miexception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    System.out.println("Fin de main");
		  }
		  public static void metodo1() throws Miexception{
		    System.out.println("Inicio do metodo1");
	
			    metodo2();
		  
		    System.out.println("Fim do metodo1");
		  }
		  public static void metodo2() throws Miexception{
		    System.out.println("Inicio do metodo2");
		    throw new Miexception("Mi exception fue lanzada");
		    	}
		  }
		  
		  
	/* PARTE DE METODO DOS
for(int i =1; i<= 5; i++){
		        System.out.println(i);
		        try { //intenta esto
		      	 // int xero = 0;
		    	    	//int resultado = i/xero;
		    	    	//System.out.println(resultado);
		      	  String test = null;	
		      	  System.out.println(test.toString());
		        } catch  (ArithmeticException |NullPointerException exception) {//Atrapa esto
		      	  System.out.println("Atrapo un exception");
		      	  System.out.println(exception.getMessage());
		      	  exception.printStackTrace();
		        }
		      		    System.out.println("Fim do metodo2");

		        }
*/