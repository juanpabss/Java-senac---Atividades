import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cachorro meuCachorro = new Cachorro();

        System.out.printf("\nDigite a raça do seu Cachorro: ");
        String racaDoCachorro = scanner.nextLine();

        meuCachorro.setRaca(racaDoCachorro);

        System.out.printf("\nDigite o nome do seu cachorro: ");
        String nomeCachorro = scanner.nextLine();

        meuCachorro.setNome(nomeCachorro);

        System.out.printf("\nDigite a idade do seu cachorro: ");
        int idade = scanner.nextInt();

        meuCachorro.setIdade(idade);

        System.out.printf("\nDigite a altura do seu cachorro: ");
        double altura = scanner.nextDouble();

        meuCachorro.setAltura(altura);

        System.out.println("\n--------------------------------------");
        System.out.printf("Meu cachorro é da raça %s", meuCachorro.getRaca());
        System.out.printf("\nMeu cachorro se chama %s", meuCachorro.getNome());
        System.out.printf("\nMeu cachorro tem %d anos", meuCachorro.getIdade());
        System.out.printf("\nMeu cachorro tem %.2f de altura", meuCachorro.getAltura());

        meuCachorro.latir();


    }
}