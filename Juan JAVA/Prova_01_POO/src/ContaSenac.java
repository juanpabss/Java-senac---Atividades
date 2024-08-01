import java.util.Scanner;

public class ContaSenac {

    Scanner scanner = new Scanner(System.in);

    private int agencia;
    private int numeroDaConta;
    private String titular;
    private double saldo;

    //Metodo de lançar despesas
    public void lancarDespesa(){
        System.out.printf("\nDigite o valor da despesa: ");
        double novaDespesa = scanner.nextDouble();
        System.out.printf("\nQual é o motivo da despersa: ");
        String motivo = scanner.nextLine();

        setDespesas(novaDespesa);
    }


    //Metodo de lançar receita
    double novareceita;
    public void lancarReceita(){
        System.out.printf("\nDigite o valor da despesa: ");
        double novareceita = scanner.nextDouble();
        System.out.printf("\nQual é a fonte dessa receita: ");
        String fonte = scanner.next();

        setReceita(novareceita);
    }

    public void exibirSaldo(){
        double saldoAtual = (getSaldo() - getDespesas());

        System.out.printf("\nSaldo: R$ %.2f \n\n", saldoAtual);
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
