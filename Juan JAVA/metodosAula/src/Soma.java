import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.printf("\n++++++++++ SOMA ");
        System.out.printf("\nDigite o primeiro numero: ");
        numero1 = scanner.nextInt();
        System.out.printf("\nDigite o segundo numero: ");
        numero2 = scanner.nextInt();

        soma(numero1, numero2);
    }

    public static void soma(int numero1, int numero2){
        int soma = numero1 + numero2;
        System.out.printf("\nA soma do primeiro numero com segundo numero é %d", soma);
    }


}
