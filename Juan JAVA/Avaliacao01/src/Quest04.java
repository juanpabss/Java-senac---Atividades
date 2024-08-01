import java.util.Scanner;
import java.util.Random;

public class Quest04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100);
        int numero;
        int contador = 0;

        System.out.println("\nProgama para descobrir o numero aleatotio entre 1 e 100");
        System.out.println("\nCOMEÇOU!!!");

        do{

            System.out.printf("Digite um número: ");
            numero = scanner.nextInt();

            if(numero == numeroAleatorio){
                System.out.println("ACERTOU!");
            }else{
                if(numero > numeroAleatorio){
                    System.out.println("O numero aleatorio é menor!");
                }else{
                    System.out.println("O numero aleatorio é maior!");
                }
            }

        contador++;

        }while(numero != numeroAleatorio);


        System.out.printf("\n Você acertou o numero aleatorio é %d", numeroAleatorio);




        if(contador == 1){
            System.out.printf("\nMuito bom, você acertou de primeira!");
        }else{
            if(contador > 6){
                System.out.printf("\nVocê foi bem, acertou com menos de 6 tentaivas!");
            }else{
                System.out.printf("\nMuito ruim, você tentou varias vezas!");
            }
        }

    }
}
