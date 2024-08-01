import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Op op = new Op();

        Complex numero01 = new Complex();
        Complex numero02 = new Complex();

        System.out.println("Digite a parte real do primeiro numero:  ");
        double parteReal = scanner.nextDouble();
        numero01.setParteReal(parteReal);

        System.out.println("Digite a parte imaginária do primeiro numero:  ");
        double parteImag = scanner.nextDouble();
        numero01.setParteImag(parteImag);

        System.out.println("Digite a parte real do segundo numero: ");
        parteReal = scanner.nextDouble();
        numero02.setParteReal(parteReal);

        System.out.println("Digite a parte imaginária do segundo numero:  ");
        parteImag = scanner.nextDouble();
        numero02.setParteImag(parteImag);


        System.out.println(op.SomarNumerosComplexos(numero01.getParteReal(), numero02.getParteReal())  );

        System.out.println( op.SomarNumerosComplexos(numero02.getParteImag(), numero02.getParteImag()) );

    }



    public static void somar(){
       
    }
}