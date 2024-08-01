import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;

        System.out.print("\nEnter your height: ");
        height = scanner.nextDouble();
        System.out.print("\nEnter your weight: ");
        weight = scanner.nextDouble();

        double imc = weight / (height * height);
        System.out.printf("\nImc: %.3f ", imc);

    }
}
