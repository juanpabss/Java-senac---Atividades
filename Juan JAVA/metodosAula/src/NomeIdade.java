import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int anoDeNascimento;
        String nomeDaPessoa;

        System.out.println("Qual é o seu nome?");
        nomeDaPessoa = entrada.nextLine();

        System.out.println(nomeDaPessoa + ", qual foi o seu ano de nascimento?");
        anoDeNascimento = entrada.nextInt();

        idade(nomeDaPessoa, anoDeNascimento);

    }

    public static void idade(String nome, int ano){
        int idade = 2024 - ano;
        System.out.println(nome + ", você tem " + idade + " anos de idade");
    }
}
