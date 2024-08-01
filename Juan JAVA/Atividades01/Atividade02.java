import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args){
        // variaveis
        boolean continuar = true;
        char op;
        float dolar,real;
        float dolarcotacao = 5.07f;
        float valorConvertido;
        

        //classes
        Scanner scanner = new Scanner(System.in);

        while (continuar){
            System.out.printf("\n======= CONVERTER DÓLAR =========");
            System.out.printf("\n1 - Converter Dólar para Real");
            System.out.printf("\n2 - Converter Real para Dólar");
            System.out.printf("\n0 - Sair\n");
            op = scanner.next().charAt(0);

            if(op == '0'){
                System.out.printf("\nEncoutando programa, tenha um bom dia!\n");
                continuar = false;
                break;
            }

            switch (op) {
                case '1':
                    System.out.printf("\nDigite o valor em dólar que quer converter para real: ");
                    dolar = scanner.nextFloat();

                    valorConvertido = dolar*dolarcotacao;
                    
                    System.out.printf("\n%.2f dolar(es) esquivale à %.2f em real\n\n", dolar, valorConvertido);

                    break;
                    
                case '2':
                    System.out.printf("\nDigite o valor em dólar que quer converter para real: ");
                    real = scanner.nextFloat();

                    valorConvertido = real/dolarcotacao;

                    System.out.printf("\n%.2f Real(s) esquivale à %.2f em dolar\n\n", real, valorConvertido);

                    break;

                default:
                    System.out.printf("Digite uma opç]ao valida!");
                    break;
            }
        }
    }
}
