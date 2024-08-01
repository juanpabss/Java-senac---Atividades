
//QUESTAO 7

public class Questao7 {
  public static void main(String[] args){
    int somaDosNumeros = 0;

    for(int contador = 1; contador <= 100; contador++){
        somaDosNumeros += contador;
    }
    System.out.printf("\nO resultado da soma dos numeros de 1 a 100 é: %d", somaDosNumeros);
  }  
}
