
//QUESTAO 11

import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        int pessoaMaisNova = 1000000;
        int idade;
        String nome, nomeNovo = "";

      for(int contador = 1; contador <= 20; contador++){
        System.out.printf("\nDigite o %d° nome, ", contador);
        nome = sc.next();
        System.out.printf("\ndigite %dº idade: ", contador);
        idade = sc.nextInt();

            if(idade <= pessoaMaisNova){
                pessoaMaisNova = idade;
                nomeNovo = nome;
          }

      }

      System.out.printf("\nA pessoa mais nova é: %s", nomeNovo + "que tem: " + pessoaMaisNova + " anos de idade");

    }  
  }
  