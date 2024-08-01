
//QUESTÃO 2

import java.util.Scanner;
public class questao2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("\nDigite um número");
        numero = sc.nextInt();

        // verificando se o numero é divissivel por 10.
        if(numero % 10 == 0){
            System.out.println("Esse número é divisivel por 10.");
        }else{
            System.out.println("Esse número não é divisivel por 10.");
        }
        
        // verifindo se o numero é divisivel por 5
        if (numero % 5 == 0){
            System.out.println("Esse número é divisivel por 5.");
        }else {
                System.out.println("Esse número não é divisivel por 5.");
        }
                
                // verifindo se o numero é divisivel por 2
        if(numero % 2 == 0){
            System.out.println("Esse número é divisivel por 2.");
        }else {
            System.out.println("Esse número não é divisivel por 2.");
        }

    }

        
}

