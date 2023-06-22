public class TestCaracteres {

    public static void main(String[] args) {

        char letra = 'a';
        System.out.println(letra);

        char valor = 65;           // Compila!
        System.out.println(valor);

        valor = (char) ( valor + 1);         // No compila!
        System.out.println(valor);
    }

}