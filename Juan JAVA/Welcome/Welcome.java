import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = scanner.nextLine();

        System.out.println("Welcome to java, "+ name + ", enjoy your experience!");

        System.out.println("Good luck!");
        System.out.println("Enter your birth year: ");
        int year = scanner.nextInt();

        int currentYear = 2024;
        int age = currentYear -year;


        System.out.printf("Hey %s, you are " + age + " years old\n", name);


        boolean continuar = true;

        while (continuar) {

            System.out.println("\n\nChoose between options:");
            System.out.println("1. Plus ");
            System.out.println("2. Minus");
            System.out.println("3. Times");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            char option = scanner.next().charAt(0);

            if (option == '0') {
                continuar = false;
                System.out.println("Exit!!!!!!!!!!");
                break;
            }

            System.out.print("\nDigite o Primeiro numero inteiro: ");
            int numero1 = scanner.nextInt();
            System.out.print("\nDigite o segundo numero inteiro: ");
            int numero2 = scanner.nextInt();



            switch(option){
                case '1':
                    System.out.println("\nResult: " + (numero1 + numero2));
                break;

                case '2':
                    System.out.println("Result: " + (numero1 - numero2));
                break;

                case '3':
                    System.out.println("Result: " + (numero1 * numero2));
                break;

                case '4':
                    if (numero2 == 0){
                        System.out.println("ERRO!");
                    } else {
                        System.out.println("Result: " + (numero1 / numero2));
                    }
                break;

                default:
                    System.out.println("ERRO!");
                break;
            }
        }
    }
}
