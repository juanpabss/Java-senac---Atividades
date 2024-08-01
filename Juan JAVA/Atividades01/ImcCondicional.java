import java.util.Scanner;

public class ImcCondicional {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;

        System.out.print("\nEnter your height: ");
        height = scanner.nextDouble();
        System.out.print("\nEnter your weight: ");
        weight = scanner.nextDouble();

        double imc = weight / (height * height);

        if (imc >= 18.5 && imc <= 25){
            System.out.printf("\nImc: %.3f ", imc);
            System.out.printf("\nVoce esta com um imc na dentre do aceitavel");

        } else if( imc <= 18.5) {
            System.out.printf("\nImc: %.3f ", imc);
            System.out.printf("\nVoce esta com um imc na dentre do abaixo aceitavel");

        } else {
            System.out.printf("\nImc: %.3f ", imc);
            System.out.printf("\nVoce esta com um imc na dentre do acima do aceitavel");
        }


        /*if(imc > 25){
            System.out.printf("\nImc: %.3f ", imc);
            System.out.printf("\nVoce esta com um imc acima do aceitavel");

            if(imc < 18.5){
                System.out.printf("\nImc: %.3f ", imc);
                System.out.printf("\nVoce esta com um imc do abaixo aceitavel");

            }else {
                System.out.printf("\nImc: %.3f ", imc);
                System.out.printf("\nVoce esta com um imc na dentre  do aceitavel");

            }

        }*/

    }
}
