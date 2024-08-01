import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tenhoQueContinua= true;
        int idade;

        do{
            System.out.println("====== Dias da Semana =======");
            System.out.println("1 - Segunda-Feira");
            System.out.println("2 - Terça-Feira");
            System.out.println("3 - Quarta-Feira");
            System.out.println("4 - Quinta-Feira");
            System.out.println("5 - Sexta-Feira");
            System.out.println("6 - Sabado");
            System.out.println("7 - Domingo");
            System.out.println("0 - Sair do progama!!");
            System.out.println("================================");
            System.out.print("\nEscolha entre as opção: ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Dia escolhido: Segunda-Feira\n");
                    break;
                case 2:
                    System.out.println("Dia escolhido: Terça-Feira\n");
                    break;
                case 3:
                    System.out.println("Dia escolhido: Quarta-Feira\n");
                    break;
                case 4:
                    System.out.println("Dia escolhido: Quinta-Feira\n");
                    break;
                case 5:
                    System.out.println("Dia escolhido: Sexta-Feira\n");
                    break;
                case 6:
                    System.out.println("Dia escolhido: Sabado\n");
                    break;
                case 7:
                    System.out.println("Dia escolhido: Domingo\n");
                    break;
                case 0:
                    System.out.println("\nEncerrando!");
                    tenhoQueContinua = false;
                    break;
                default:
                    System.out.println("Escolha uma opção valida!\n");
                    break;
            }

        }while(tenhoQueContinua);

    }
}