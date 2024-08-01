import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a,b,c,d;
        double mut1,mut2,mut3,mut4;
        double soma1,soma2,soma3,soma4;


        System.out.printf("\nDigite o valor de A: ");
        a = scanner.nextDouble();
        System.out.printf("\nDigite o valor de B: ");
        b = scanner.nextDouble();
        System.out.printf("\nDigite o valor de C: ");
        c = scanner.nextDouble();
        System.out.printf("\nDigite o valor de D: ");
        d = scanner.nextDouble();

        System.out.printf("\nMultiplicação A*B: %.2f",(a*b));
        System.out.printf("\nSoma A+B: %.2f",(a+b));

        System.out.printf("\nMultiplicação A*C: %.2f",(a*c));
        System.out.printf("\nSoma A+C: %.2f",(a+c));

        System.out.printf("\nMultiplicação A*D: %.2f",(a*d));
        System.out.printf("\nSoma A+D: %.2f",(a+d));





    }
}
