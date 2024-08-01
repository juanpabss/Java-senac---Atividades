import java.util.Scanner;

public class Quest05 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("progama que mostra a fatorial de 1 a 20.");
        int contador= 1;

        while(contador < 21){
            System.out.printf("\nFatorial de %d: ", contador);

            long multiplicacao = 1;
            long fatorial = contador;

            while(fatorial != 0){
                System.out.printf(" %d*", fatorial);
                multiplicacao *= fatorial;
                fatorial--;
            }

            System.out.printf(" = %d", multiplicacao);

            contador++;
        }



    }
}
