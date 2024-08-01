import java.util.Scanner;

public class Quest02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeros;

        int maiorNumero = 0;
        int menorNumero = 0;
        int soma = 0;

        int contador = 0;

        System.out.println("\nProgama que recebe numero(s), é no final informa qual é o maio e o menor numero.");

        do{
            System.out.printf("\n\nInforme o um numero interio: ");
            numeros = scanner.nextInt();

            if(contador == 0){
                maiorNumero = numeros;
                menorNumero = numeros;
                contador++;

            }else{
                if(numeros >= maiorNumero){
                    maiorNumero = numeros;

                }else{
                    if(numeros != 0){
                        menorNumero = numeros;
                    }

                }
            }

            soma += numeros;
            contador++;


        }while(numeros != 0);

        System.out.printf("\n\n Resultado!");
        System.out.printf("\nMaior número: %d", maiorNumero);
        System.out.printf("\nMenor número: %d", menorNumero);
        System.out.printf("\nMédia: %d", soma/(contador-2) );


    }
}
