import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaSenac minhaConta = new ContaSenac();

        boolean tenhoQueContinua= true;


        do{
            System.out.println("===========================");
            System.out.println("1 - Exibir saldo disponivel");
            System.out.println("2 - Lançar receita");
            System.out.println("3 - Lançar despesa");
            System.out.println("0 - Sair do progama");
            System.out.println("================================");
            System.out.print("\nopção: ");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("\nEncerrando Atividade no banco, até mais...!");
                    tenhoQueContinua = false;
                    break;
                case 1:
                    minhaConta.exibirSaldo();
                    break;
                case 2:
                    minhaConta.lancarReceita();
                    break;
                case 3:
                    minhaConta.lancarDespesa();
                    break;
                default:
                    System.out.println("Escolha uma opção valida!\n");
                    break;
            }

        }while(tenhoQueContinua);



    }


    //Metodo de lançar despesas
    public static void lancarDespesa(){
        System.out.printf("\nDigite o valor da despesa: ");
        Scanner scanner;
        double novaDespesa = scanner.nextDouble();
        System.out.printf("\nQual é o motivo da despersa: ");
        String motivo = scanner.nextLine();


    }


    //Metodo de lançar receita
    double novareceita;
    public void lancarReceita(){
        System.out.printf("\nDigite o valor da despesa: ");
        Scanner scanner;
        double novareceita = scanner.nextDouble();
        System.out.printf("\nQual é a fonte dessa receita: ");
        String fonte = scanner.next();


    }

    public void exibirSaldo(){
        System.out.printf("\nSaldo: R$ %.2f \n\n", );
    }

}