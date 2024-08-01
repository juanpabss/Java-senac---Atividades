import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso;
        double alturo;


        System.out.print("\nDigite sua altura: ");
        alturo = scanner.nextDouble();
        System.out.print("\nDigite seu peso: ");
        peso = scanner.nextDouble();

        double imc = peso / (alturo * alturo);

        if(imc > 18.5) {
            if(imc > 24.9){
                if(imc > 29.9){
                    if(imc > 39.9){
                        System.out.printf("\nIMC: %.2f", imc);
                        System.out.printf("\nSeu imc é  maior que 39.9. ");
                        System.out.printf("\nClassificação: Obesidade  grave III ");

                    }else{
                        System.out.printf("\nIMC: %.2f", imc);
                        System.out.printf("\nSeu imc esta entre 30.0 e 39.9. ");
                        System.out.printf("\nClassificação: Obesidade II ");
                    }

                }else{
                    System.out.printf("\nIMC: %.2f", imc);
                    System.out.printf("\nSeu imc esta entre 25.0 e 29.9. ");
                    System.out.printf("\nClassificação: Sobrepeso (Obesidade I)");
                }

            }else {
                System.out.printf("\nIMC: %.2f", imc);
                System.out.printf("\nSeu imc esta entre 18.5 e 24.9. ");
                System.out.printf("\nClassificação: Normal");
            }

        }else {
            System.out.printf("\nIMC: %.2f", imc);
            System.out.printf("\nSeu imc é menor que 18.5. ");
            System.out.printf("\nClassificação: Magreza");
        }




    }
}