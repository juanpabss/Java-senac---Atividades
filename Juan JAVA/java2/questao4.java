
//QUESTAO 4

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tenhoQueContinua= true;
        int idade;

        do{
            
            System.out.print("\nDigite um número entre 1 e 7:\nOu digite 0 para encerrar o programa\n");
            int op = scanner.nextInt();

            switch (op){
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