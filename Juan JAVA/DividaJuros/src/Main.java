public class Main {
    public static void main(String[] args) {

        double valorDaDivida = 6895f;


        System.out.println("\n\n======= CALCÚLO DE JUROS =======");
        System.out.println("Sua divida inicial era de R$ 6895,00");
        System.out.println("\n Devido um atraso de 12 meses o valor que você tem que pagar mudou \n Cada mês que passou foi acrecentado 18% emcima dao valor da divida.");

        for(int i = 0; i < 12; i++){
             valorDaDivida = valorDaDivida + (valorDaDivida * 0.18);
        }

        System.out.printf("\nValor atual da divida: R$ %.2f ", valorDaDivida);



    }
}