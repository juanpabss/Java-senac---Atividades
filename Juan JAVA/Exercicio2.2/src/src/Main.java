import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.printf("\nDigite um numero interio: ");
        numero = scanner.nextInt();

        if(numero >= 0 ){
            if(numero <= 9){
                System.out.printf("\nNúmero valido! O Numero esta entre zero e nove!");
            }else {
                System.out.printf("\nNumero invalido! numero maior que nove!");
            }
        }else{
            System.out.printf("\nNumero invalido! Numero menor que zero!");

        }

    }
}