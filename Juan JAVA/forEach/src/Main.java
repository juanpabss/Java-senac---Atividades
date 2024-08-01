import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] numeros = new int[36000000];

        for (int contador = 0; contador < 36000000; contador++) {
            numeros[contador] = rand.nextInt(10,500);
        }

        for(int numero: numeros) {
            System.out.printf(" - [%d]", numero);

        }
    }
}