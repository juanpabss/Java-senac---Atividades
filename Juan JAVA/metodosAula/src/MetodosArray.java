import java.util.Scanner;

public class MetodosArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tenhoQueContinua= true;



        do{
            System.out.println("\n\n====== OPERAÇÕES ARRAY MODULARIZADO ========");
            System.out.println("|\t\t1 - SOMA\t\t\t\t\t\t|");
            System.out.println("|\t\t2 - MEDIA");
            System.out.println("|\t\t3 - PRODUTO");
            System.out.println("|\t\t4 - MENOR");
            System.out.println("|\t\t5 - MAIOR");
            System.out.println("|\t\t0 - Sair do progama!!");
            System.out.println("============================================");
            System.out.print("\nEscolha entre as opção: ");
            int produto = scanner.nextInt();



            switch (produto){
                case 0:

                    break;

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;
                default:
                    System.out.println("Escolha uma opção valida!\n");
                    break;
            }

        }while(tenhoQueContinua);


    }
}
