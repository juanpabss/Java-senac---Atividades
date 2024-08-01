import java.util.Scanner;

public class TrocaDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];
        double[] dobroNumeros = new double[10];

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.printf("\nDigite o %dº numero: ", contador + 1);
            numeros[contador] = scanner.nextDouble();

        }
        for (int contador = 0; contador < numeros.length; contador++) {
            dobroNumeros[contador] = (numeros[contador]*2);
        }

        System.out.printf("\n Vetor original: ");
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.printf("%.2f ", numeros[contador]);
        }

        System.out.printf("\n Vetor com valores dobradoa: ");
        for (int contador = 0; contador < dobroNumeros.length; contador++) {
            System.out.printf("%.2f ", dobroNumeros[contador]);
        }
    }
}
