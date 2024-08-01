import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NOMES_ALUNOS =  10;
        final int QUANTIDADE_NOTAS = 2;

        double[][] notasDosAlunos = new double[NOMES_ALUNOS][QUANTIDADE_NOTAS];
        String[] nomesDosAlunos = new String[NOMES_ALUNOS];

        for(int linha = 0; linha < NOMES_ALUNOS; linha++){
            System.out.printf("\nDigite o nome do aluno: ");
            nomesDosAlunos[linha] = scanner.nextLine();

            System.out.println("Informe as notas do aluno(a) " + nomesDosAlunos[linha]);

            for(int coluna = 0; coluna < QUANTIDADE_NOTAS; coluna++){
                System.out.printf("\n%d° nota: ", (coluna+1) );
                nomesDosAlunos[QUANTIDADE_NOTAS] = scanner.nextLine();
            }
        }


    }
}