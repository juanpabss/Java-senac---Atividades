import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base;
        int exponte;

        System.out.println("\n||||||||||||||||| POTÊNCIA ||||||||||||||||||||");
        System.out.printf("\nDigite um numero da base: ");
        base = scanner.nextInt();
        System.out.printf("\nDigite um numero da exponente: ");
        exponte = scanner.nextInt();

        potencia(base, exponte);
    }

    public static void potencia (int base, int exponte){
        long produto = 1;
        for(int i = 1; i <= exponte; i++){
            produto *= base;
        }
        System.out.printf("\n%d elevando a %d é igual a %d\n", base, exponte, produto);
    }

}
