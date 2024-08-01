
//QUESTAO 3


import java.util.Scanner;
public class questao3{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("\nDigite sua idade");
        idade = sc.nextInt();  
        
        if(idade < 16){
            System.out.println("Não eleitor: Você não tem a idade de um eleitor");
        }else if(idade >= 18 && idade <= 65){
            System.out.println("Eleitor Obrigatório: Você é obrigado a votar");
        }else if((idade >= 16 && idade < 18) || idade > 65){
            System.out.println("Eleitor Facultativo: Você não é obrigado a votar");
        }
        
    }
}