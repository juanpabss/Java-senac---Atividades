
//QUESTAO 10

import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        int maioresDeIdade = 0;
        int idade;

      for(int contador = 1; contador <= 20; contador++){
        System.out.printf("\ndigite %dº idade: ", contador);
        idade = sc.nextInt();
        if(idade >= 18){
           maioresDeIdade += 1;
        }
      }
      System.out.printf("\nA quantidade de maiores de idade é: %d", maioresDeIdade);
    }  
  }
  