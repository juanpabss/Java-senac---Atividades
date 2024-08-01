
//QUESTAO 8
import java.util.Scanner;
public class Questao8 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        int somaDasIdades = 0;
        int idade;

      for(int contador = 1; contador <= 20; contador++){
        System.out.printf("\ndigite %dº idade: ", contador);
        idade = sc.nextInt();
        somaDasIdades += idade;
      }
      System.out.printf("\nO resultado da soma das idades é: %d", somaDasIdades);
    }  
  }
  