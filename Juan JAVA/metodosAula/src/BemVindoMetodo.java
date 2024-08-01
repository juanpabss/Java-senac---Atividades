import java.util.Scanner;

public class BemVindoMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("\nDigite seu nome: ");
        String nome = scanner.nextLine();
        System.out.printf("\nDigite sua idade: ");
        int idade = scanner.nextInt();

        nomeIdade(nome, idade);
    }

    //Metodo para calcular a raiz quadrada
    public static void nomeIdade(String nome, int idade){
        System.out.printf("\nNome: %s", nome + "\nIdade: " + idade);
    }
}