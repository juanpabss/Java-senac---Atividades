import java.util.Scanner;

public class Atividade01 {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);

        // variaveis
        float estoqueMedio;
        float quantMinima;
        float quantMaxima;

        // recebendo valores do usuario;
        System.out.print("\n________ESTOQUE MÉDIO_________");
        System.out.print("\nDigite a quantidade minima: ");
        quantMinima = scanner.nextFloat();
        System.out.printf("\nDigite a quantidade maxima; ");
        quantMaxima = scanner.nextFloat();

        //calculando estoque medio - (quantidade maxima + qunatidade minima)/2
        estoqueMedio = (quantMinima + quantMaxima)/2;

        //saida do resultado
        System.out.printf("Estoque médio: %.2f", estoqueMedio);

    }
}
