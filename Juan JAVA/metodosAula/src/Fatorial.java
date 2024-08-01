import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("\n>>>>>>>>>>> FATORIAL <<<<<<<<<<<<<<");
        System.out.printf("\nDigite o numero que quer calcular a fatorial: ");
        numero = scanner.nextInt();

        fatorial(numero);

    }


    public static void fatorial(int numero) {
        System.out.printf("\nFatorial: ");

        long fatorial = 1;
        for(int i = numero; i > 0; i--){
            System.out.printf("*%d ", i);
            fatorial *= i;
        }
        System.out.printf("= %d\n", fatorial);
    }


}

