import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario;
        double imposto;

        System.out.printf("\nDigite qual é o valor de seu salário: ");
        salario = scanner.nextDouble();
        if(salario < 0){
            System.out.println("Porfavor, digite um salario positivo\n");
            System.exit(0);
        }

        if (salario > 2259.20) {
            if (salario > 2826.65) {
                if (salario > 3751.05) {
                    if (salario > 4664.68) {
                        System.out.printf("\nSalario: %.2f\n", salario);
                        System.out.println("Seu salario esta acima de 4664.68, voce precisa 27,5% de imposto.");
                        imposto = salario*0.275;
                        System.out.printf("Imposto: %.2f\n", imposto);

                    } else {

                        System.out.printf("\nSalario: %.2f\n", salario);
                        System.out.println("Seu salario esta entre 3751.06 e 4664.68, voce precisa 22,5% de imposto.");
                        imposto = salario*0.225;
                        System.out.printf("Imposto: %.2f\n", imposto);

                    }

                } else {
                    System.out.printf("\nSalario: %.2f\n", salario);
                    System.out.println("Seu salario esta entre 2826.66 e 3751.05, voce precisa 15,0% de imposto.");
                    imposto = salario*0.15;
                    System.out.printf("Imposto: %.2f\n", imposto);

                }

            } else {
                System.out.printf("\nSalario: %.2f\n", salario);
                System.out.println("Seu salario esta entre 2259,21 e 2826.65, voce precisa 7,5% de imposto.");
                imposto = salario*0.075;
                System.out.printf("Imposto: %.2f\n", imposto);

            }

        } else {
            System.out.printf("\nSalario: %.2f\n", salario);
            System.out.println("seu salario é menor que 2259.20, você não paga imposto");
            
        }


    }
}