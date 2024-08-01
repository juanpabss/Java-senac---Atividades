import java.util.Scanner;

public class Quest06 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int numero;
        int desejaContinuar;

        System.out.println("\nProgama para descobir se o numero perfeitos");

        do{
            System.out.printf("\n\nInforme o um numero interio: ");
            numero = scanner.nextInt();

            int soma = 0;

            for(int i = 1; i < numero; i++){
                if(numero % i == 0){
                    soma += i;
                }
            }

            if(soma == numero){
                System.out.printf("\nEsse numero é perfeito!\n");
            }else{
                System.out.printf("\nEsse numero não é perfeito!\n");
            }

            do{
                System.out.println("\nDeseja continuar Digitando números");
                System.out.println("0 - continuar");
                System.out.println("1 - sair");
                desejaContinuar = scanner.nextInt();

                if(desejaContinuar != 0 && desejaContinuar != 1){
                    System.out.println("\n\nOpção invalida!");
                    System.out.println("Digite uma opção valida!");
                }
            }while(desejaContinuar != 0 && desejaContinuar != 1);

        }while(desejaContinuar != 1);

    }
}
