package java_pila_ejecucion;

public class FlujoconTratamiento {

		  public static void main(String[] args) {
		    System.out.println("Inicio de main");
		    metodo1();
		    System.out.println("Fin de main");
		  }
		  public static void metodo1(){
		    System.out.println("Inicio do metodo1");
		    metodo2();
		    System.out.println("Fim do metodo1");
		  }
		  public static void metodo2(){
		    System.out.println("Inicio do metodo2");
		    throw new ArithmeticException("Surgio un erro");
		    
		    	}

		  }
		  
		  
	