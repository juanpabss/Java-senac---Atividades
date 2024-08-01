import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int dividendo = 1000;

        System.out.println("\n Progama que imprime na tela os numeros que estão entre 1000 e 1999\n que os resta da divisão por 11 é igual 5.");

        System.out.println("Resultados: ");
        for(int i = 1; i <= 999; i++){

            int resto = dividendo % 11;

            if(resto == 5){
                System.out.printf("%d, ", dividendo);

            }
            dividendo++;
        }
    }
}
