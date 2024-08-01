import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numeros = new double[10];
        double[] quadradoNumeros = new double[10];

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.printf("\nDigite o %dº numero: ", contador + 1);
            numeros[contador] = scanner.nextDouble();

        }
        for (int contador = 0; contador < numeros.length; contador++) {
            quadradoNumeros[contador] = (numeros[contador]*numeros[contador]);
        }

        System.out.printf("\n Vetor original: ");
        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.printf("%.2f ", numeros[contador]);
        }

        System.out.printf("\n Vetor com o quadrado do valores: ");
        for (int contador = 0; contador < quadradoNumeros.length; contador++) {
            System.out.printf("%.2f ", quadradoNumeros[contador]);
        }
    }
}
