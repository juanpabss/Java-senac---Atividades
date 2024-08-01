import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variaveis utilizaveis
        int quantidadeDeNumeros;
        int numeros;
        int soma = 0;
        float media = 0;
        int maiorNumero = 0;
        int menorNumero = 0;
        int produto = 1;


        //Definição do número de repetição do loop
        System.out.printf("\n Digite o quantidades de interios que vai quere digitar: ");
        quantidadeDeNumeros = scanner.nextInt();

        int contador = 0;// Variárel feita unicamente para testar se é a primeira vzs que o loop esta sendo axecutado.

        for(int i = 1; i <= quantidadeDeNumeros; i++){

            System.out.printf("\n Digite o %dº número: ", i);
            numeros = scanner.nextInt();

            //soma dos numeros
            soma += numeros;

            // Maior e menor número
            if(contador == 0){
                maiorNumero = numeros;
                menorNumero = numeros;
                contador++;

            }else{
                if(numeros >= maiorNumero){
                    maiorNumero = numeros;

                }else if (numeros < menorNumero){
                        menorNumero = numeros;
                }
            }

            // produto dos números
            produto *= numeros;


        }

        boolean tenhoQueContinua = true;

        do{
            System.out.println("\n\n========== MENU ===========");
            System.out.println("1 - SOMA DOS NÚMEROS");
            System.out.println("2 - MÉDIA");
            System.out.println("3 - MAIOR VALOR");
            System.out.println("4 - MENOR VALOR");
            System.out.println("5 - PRODUTO DOS NÚMEROS");
            System.out.println("0 - Sair do progama!!");
            System.out.println("===========================");
            System.out.print("\nEscolha entre as opção: ");
            int op = scanner.nextInt();

            switch (op){
                case 0:
                    System.out.println("\nEncerrando compra!");
                    tenhoQueContinua = false;
                    break;

                case 1:
                    System.out.printf("\nSoma: %d\n", soma);
                    break;

                case 2:
                    media = ((float)soma / quantidadeDeNumeros);

                    System.out.printf("\nMédia: %.2f\n", media);
                    break;

                case 3:
                    System.out.printf("\nMaior valor: %d\n", maiorNumero);
                    break;

                case 4:
                    System.out.printf("\nMenor valor: %d\n", menorNumero);
                    break;

                case 5:
                    System.out.printf("Produto: %d\n", produto);
                    break;
                default:
                    System.out.println("Escolha uma opção valida!\n");
                    break;
            }

        }while(tenhoQueContinua);



    }
}