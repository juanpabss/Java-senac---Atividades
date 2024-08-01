import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tenhoQueContinua= true;
        float resultadoFinal = 0;


        do{
            System.out.println("\n\n====== Venda de produtos =======");
            System.out.println("1 - Garrafa");
            System.out.println("2 - Lauril");
            System.out.println("3 - Sulfanico");
            System.out.println("4 - Renex");
            System.out.println("5 - Barrilha");
            System.out.println("0 - Sair do progama!!");
            System.out.println("================================");
            System.out.print("\nEscolha entre as opção: ");
            int produto = scanner.nextInt();

            int quantidade;
            float resultado;

            switch (produto){
                case 0:
                    System.out.println("\nEncerrando compra!");
                    tenhoQueContinua = false;
                    break;

                case 1:
                    System.out.printf("\nDigite a quantidade de Garrafas que você quer comprar:");
                    quantidade = scanner.nextInt();
                    resultado  = ((float) 2.98 * quantidade);
                    resultadoFinal += resultado;

                    System.out.printf("\nPreço: R$%.2f", resultado);
                    break;

                case 2:
                    System.out.printf("\nDigite a quantidade de Lauril que você quer comprar:");
                    quantidade = scanner.nextInt();
                    resultado  = ((float) 4.50 * quantidade);
                    resultadoFinal += resultado;

                    System.out.printf("\nPreço: R$%.2f", resultado);
                    break;

                case 3:
                    System.out.printf("\nDigite a quantidade de Sulfonico que você quer comprar:");
                    quantidade = scanner.nextInt();
                    resultado  = ((float) 9.98 * quantidade);
                    resultadoFinal += resultado;

                    System.out.printf("\nPreço: R$%.2f", resultado);
                    break;

                case 4:
                    System.out.printf("\nDigite a quantidade de Renex que você quer comprar:");
                    quantidade = scanner.nextInt();
                    resultado  = ((float) 4.49 * quantidade);
                    resultadoFinal += resultado;

                    System.out.printf("\nPreço: R$%.2f", resultado);
                    break;

                case 5:
                    System.out.printf("\nDigite a quantidade de Lauril que você quer comprar:");
                    quantidade = scanner.nextInt();
                    resultado  = ((float) 6.87 * quantidade);
                    resultadoFinal += resultado;

                    System.out.printf("\nPreço: R$%.2f", resultado);
                    break;
                default:
                    System.out.println("Escolha uma opção valida!\n");
                    break;
            }

        }while(tenhoQueContinua);

        System.out.printf("\nValor final da compra: R$%.2f\n", resultadoFinal);

    }
}