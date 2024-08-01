
//QUESTAO 5

import java.util.Scanner;
public class Questao5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("\nDigite três números...");
        System.out.print("\nNúmero 1: ");
        numero1 = sc.nextInt();
        System.out.print("\nNúmero 2: ");
        numero2 = sc.nextInt();
        System.out.print("\nNúmero 3: ");
        numero3 = sc.nextInt();
        
        if(numero1 > numero2 && numero1 > 3){
            if(numero2 > numero3){
                System.out.println(numero1 + ", " + numero2 + ", " + numero3);
            }else{
                System.out.println(numero1 + ", " + numero3 + ", " + numero2);

            }
        }else if(numero1 < numero2 && numero3 < numero2){
            if(numero1 > numero3){
                System.out.println(numero2 + ", " + numero1 + ", " + numero3);

            }else{
                System.out.println(numero2 + ", " + numero3 + ", " + numero1);
            }
        }else{
            if(numero3 > numero1 && numero3 > numero2){
                if(numero1 > numero2){
                    System.out.println(numero3 + ", " + numero1 + ", " + numero2);
    
                }else{
                    System.out.println(numero3 + ", " + numero2 + ", " + numero1);
                }
            }
        }
    }
}