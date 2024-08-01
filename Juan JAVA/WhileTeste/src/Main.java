import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int numero = 1;
       int somatorio = 0;
       int contador = 0;
       double media;

       while(numero != 0){
           numero = 0;

           System.out.printf("\nDigite um numero: ");
           numero = scanner.nextInt();

           somatorio += numero;

           contador++;
       }

       System.out.printf("\nSomatorio dos numeros: %d", somatorio);

       media = (double) somatorio/(contador-1);

       System.out.printf("\nMedia dos numeros: %.2f", media );


    }
}