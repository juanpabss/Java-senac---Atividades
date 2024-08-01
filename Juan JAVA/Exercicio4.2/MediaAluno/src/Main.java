import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1,nota2,nota3,nota4;
        double media;

        
        System.out.printf("\nDigite a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.printf("\nDigite a segunda nota: ");
        nota2 = scanner.nextDouble();
        System.out.printf("\nDigite a terceira nota: ");
        nota3 = scanner.nextDouble();
        System.out.printf("\nDigite a quarta nota: ");
        nota4 = scanner.nextDouble();

        media = (nota1+nota2+nota3+nota4)/4;

        if(media >= 2.0){
            if(media >= 7.0){
                System.out.printf("\nMÉDIA: %.2f", media);
                System.out.printf("\nSua média é maior ou igual a 7, você esta APROVADO!\n");
            }else{
                System.out.printf("\nMÉDIA: %.2f", media);
                System.out.printf("\nSua média esta entre 2.00 e 6.99, você tem direito a fazer RECUPERAÇÂO!\n");
            }
        }else{
            System.out.printf("\nMÉDIA: %.2f", media);
            System.out.printf("\nSua média foi inferior a 2.00, você esta REPROVADO!\n");
        }


    }
}