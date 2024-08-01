import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int codigoPeca;
        int codigoVendedor;
        int quantidadeVendida;
        double valorUnitario;
        double comisao;


        System.out.printf("\nDigite o seu codigo de vendedor: ");
        codigoVendedor = scanner.nextInt();
        System.out.printf("\nDigite o codigo da peça: ");
        codigoPeca = scanner.nextInt();
        System.out.printf("\nDigite o quantidade de vendidas: ");
        quantidadeVendida = scanner.nextInt();
        System.out.printf("\nDigite o preço unitario da peça: ");
        valorUnitario = scanner.nextInt();

        comisao =( (double) (quantidadeVendida * valorUnitario) * 0.05 );

        System.out.println("------------------------------");
        System.out.println("calculando sua comissão.");
        System.out.printf("\nPeça: %d", codigoPeca);
        System.out.printf("\nVendedor: %d", codigoVendedor);
        System.out.printf("\nSua comisão: R$ %.2f", comisao);

    }
}
