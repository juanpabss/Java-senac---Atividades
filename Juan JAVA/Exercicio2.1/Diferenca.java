import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numero1, numero2;
        double resultado;

        System.out.printf("\nDigite o primerio numero: ");
        numero1 = sc.nextDouble();
        System.out.printf("\nDigite o segundo numero: ");
        numero2 = sc.nextDouble();

        if (numero1 > numero2) {
            resultado = numero1 - numero2;
            System.out.printf("\n Diferença entre o maior numero e o menor numero: %.2f ", resultado);
        } else {
            resultado = numero2 - numero1;
            System.out.printf("\n Diferença entre o maior numero e o menor numero: %.2f ", resultado);
        }
    }
}
