public class Factorial {
    public static void main(String[] args) {

        int factorial = 1;  // Variable para almacenar el factorial, inicializada en 1
        for (int i = 1; i < 11; i++) {  // Bucle for para calcular el factorial de los números del 1 al 10
            factorial *= i;  // Calcula el factorial multiplicando el número actual por el factorial acumulado
            System.out.println("Factorial de " + i + " = " + factorial);  // Imprime el resultado del factorial

        }

    }
}
