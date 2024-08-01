import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int[] numeros = new int[10];
         int soma = 0;
         long produto = 1;
         double media;
         int maior = 0;
         int menor = 0;

         for(int contador = 0; contador < 10; contador++){
             System.out.printf("\nDigite o %d° numero: ", contador + 1);
             numeros[contador] = scanner.nextInt();

             //
             soma += numeros[contador];
             produto *= numeros[contador];

             //
             if(contador == 0){
                 maior = numeros[contador];
                 menor = numeros[contador];
             }else{
                 if(numeros[contador] > maior){
                     maior = numeros[contador];
                 }else if(numeros[contador] < menor){
                     menor = numeros[contador];
                 }
             }
            //

         }

       /* for(int contador = 0; contador < numeros.length-1; contador++){
            System.out.printf("\n%d° numero: %d", contador+1, numeros[contador]);
        }*/

        System.out.printf("\n\nSoma dos números do array: %d", soma);
        System.out.printf("\nProdutos dos números do array: %d", produto);
        media = (float)soma/numeros.length;
        System.out.printf("\nMédia dos números do array: %.2f", media);
        System.out.printf("\nMaior números do array: %d", maior);
        System.out.printf("\nMenor números do array: %d", menor);

    }
}