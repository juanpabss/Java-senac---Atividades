import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tenhoQueContinua= true;
        float vendas;
        double comissaoPorRegiao = 0;

        do{
            System.out.println("\n\n============ CALCULADORA DE COMISÃO ============") ;
            System.out.println("Ecolha entre as opções qual é a sua região:");
            System.out.println("1 - NORDESTE");
            System.out.println("2 - SUDESTE");
            System.out.println("3 - NORTE");
            System.out.println("4 - SUL");
            System.out.println("5 - CENTRO OESTE");
            System.out.println("0 - Sair do progama!!");
            System.out.print("\nEscolha entre as opção: ");
            int op = scanner.nextInt();

            System.out.printf("\nInforme qual é o valor de suas vendas: ");
            vendas = scanner.nextFloat();

            switch (op){
                case 0:
                    System.out.println("\nEncerrando!");
                    tenhoQueContinua = false;
                    break;

                case 1:
                    int retornar = 1;

                    System.out.println("\nComissão calculada de arcordo com suas informaçãoes.");
                    System.out.printf("Região: Nordeste");
                    System.out.printf("\nVendas: %.2f\n", vendas);

                    if(vendas > 13500){
                        System.out.println("Você ganhou um bonus de 2% a mais, por que suas vendas ultrapassou R$13500.00");
                        comissaoPorRegiao = vendas * 0.12;

                    }else if(vendas < 0){
                        System.out.println("Valor de vendas invalidos!");
                        retornar = 0;

                    }else if(vendas < 3000){
                        System.out.println("Você perdeu 1% da sua comissão, por que suas vendas não ultrapassou R$3000.00");
                        comissaoPorRegiao = vendas * 0.09;
                    }else {
                        System.out.println("Você ganhou a comissão padrão");
                        comissaoPorRegiao = vendas * 0.1;

                    }
                    if (retornar == 1){
                    System.out.printf("\nComisão: %.2f", comissaoPorRegiao);
                    }

                    break;

                case 2:
                    System.out.println("\nComissão calculada de arcordo com suas informaçãoes.");
                    System.out.printf("\nRegião: Sudeste");
                    System.out.printf("\nVendas: %.2f\n", vendas);

                    if(vendas > 13500){
                        System.out.println("Você ganhou um bonus de 2% a mais, por que suas vendas ultrapassou R$13500.00");
                        comissaoPorRegiao = vendas * 0.08;

                    }else if(vendas < 3000){
                        System.out.println("Você perdeu 1% da sua comissão, por que suas vendas não ultrapassou R$3000.00");
                        comissaoPorRegiao = vendas * 0.05;

                    }else {
                        System.out.println("Você ganhou a comissão padrão");
                        comissaoPorRegiao = vendas * 0.06;

                    }

                    System.out.printf("\nComisão: %.2f", comissaoPorRegiao);

                    break;

                case 3:
                    System.out.println("\nComissão calculada de arcordo com suas informaçãoes.");
                    System.out.printf("\nRegião: Norte");
                    System.out.printf("\nVendas: %.2f\n", vendas);

                    if(vendas > 13500){
                        System.out.println("Você ganhou um bonus de 2% a mais, por que suas vendas ultrapassou R$13500.00");
                        comissaoPorRegiao = vendas * 0.09;

                    }else if(vendas < 3000){
                        System.out.println("Você perdeu 1% da sua comissão, por que suas vendas não ultrapassou R$3000.00");
                        comissaoPorRegiao = vendas * 0.06;

                    }else {
                        System.out.println("Você ganhou a comissão padrão");
                        comissaoPorRegiao = vendas * 0.07;

                    }

                    System.out.printf("\nComisão: %.2f", comissaoPorRegiao);

                    break;
                case 4:
                    System.out.println("\nComissão calculada de arcordo com suas informaçãoes.");
                    System.out.printf("\nRegião: Sul");
                    System.out.printf("\nVendas: %.2f\n", vendas);

                    if(vendas > 13500){
                        System.out.println("Você ganhou um bonus de 2% a mais, por que suas vendas ultrapassou R$13500.00");
                        comissaoPorRegiao = vendas * 0.010;

                    }else if(vendas < 3000){
                        System.out.println("Você perdeu 1% da sua comissão, por que suas vendas não ultrapassou R$3000.00");
                        comissaoPorRegiao = vendas * 0.07;

                    }else {
                        System.out.println("Você ganhou a comissão padrão");
                        comissaoPorRegiao = vendas * 0.08;

                    }

                    System.out.printf("\nComisão: %.2f", comissaoPorRegiao);

                    break;

                case 5:
                    System.out.println("\nComissão calculada de arcordo com suas informaçãoes.");
                    System.out.printf("\nRegião: Centro Oeste");
                    System.out.printf("\nVendas: %.2f\n", vendas);

                    if(vendas > 13500){
                        System.out.println("Você ganhou um bonus de 2% a mais, por que suas vendas ultrapassou R$13500.00");
                        comissaoPorRegiao = vendas * 0.11;

                    }else if(vendas < 3000){
                        System.out.println("Você perdeu 1% da sua comissão, por que suas vendas não ultrapassou R$3000.00");
                        comissaoPorRegiao = vendas * 0.08;

                    }else {
                        System.out.println("Você ganhou a comissão padrão");
                        comissaoPorRegiao = vendas * 0.09;

                    }

                    System.out.printf("\nComisão: %.2f", comissaoPorRegiao);

                    break;
                default:
                    System.out.println("Escolha uma opção valida!\n");
                    break;
            }

        }while(tenhoQueContinua);

    }
}