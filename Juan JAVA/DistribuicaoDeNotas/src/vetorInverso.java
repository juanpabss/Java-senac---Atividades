import java.util.Scanner;

public class vetorInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int[] numerosIvertido = new int[10];

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.printf("\nDigite o %dº numero: ", contador + 1);
            numeros[contador] = scanner.nextInt();

        }
        for (int contador = 0; contador < numeros.length; contador++) {
            numerosIvertido[contador] = numeros[9-contador];
        }

        System.out.printf("\n Vetor original: ");
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.printf("%d ", numeros[contador]);
        }

        System.out.printf("\n Vetor com valores invertido: ");
        for (int contador = 0; contador < numerosIvertido.length; contador++) {
            System.out.printf("%d ", numerosIvertido[contador]);
        }
    }
}
