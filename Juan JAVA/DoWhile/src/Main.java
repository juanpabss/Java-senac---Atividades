import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "";
        int idade;

        int maiorIdade = 0;
        String pessoaVelha = "";
        int menorIdade = 0;
        String pessoaNova = "";

        int desejaContinuar;

        int contador = 0;

        do{
            System.out.printf("\n\nInforme o nome do seu nome: ");
            nome = scanner.next();

            System.out.printf("\nInforme a sua idade: ");
            idade = scanner.nextInt();

            if(contador == 0){
                pessoaVelha = nome;
                maiorIdade = idade;

                pessoaNova = nome;
                menorIdade = idade;

                contador++;

            }else{
                if(idade >= maiorIdade){
                    pessoaVelha = nome;
                    maiorIdade = idade;
                }else{
                    pessoaNova = nome;
                    menorIdade = idade;
                }

            }

            do{
                System.out.println("\nDeseja continuar cadastrando?");
                System.out.println("0 - continuar");
                System.out.println("1 - sair");
                desejaContinuar = scanner.nextInt();

                if(desejaContinuar != 0 && desejaContinuar != 1){
                    System.out.println("\n\nOpção invalida!");
                    System.out.println("Digite uma opção valida!");
                }
            }while(desejaContinuar != 0 && desejaContinuar != 1);

        }while(desejaContinuar != 1);

        System.out.printf("\n\n Cadastro finalizado!");
        System.out.printf("\nPessoa mais velha é %s ela tem %d anos", pessoaVelha, maiorIdade);
        System.out.printf("\nPessoa mais nova é %s ela tem %d anos", pessoaNova, menorIdade);



    }
}




















