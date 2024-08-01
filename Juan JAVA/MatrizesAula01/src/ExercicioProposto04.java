import java.util.Scanner;

public class ExercicioProposto04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matriz = new String[4][4];

        for(int linhas = 0; linhas < 4; linhas++){

            for(int colunas = 0; colunas < 4; colunas++){
                System.out.printf("\nDigite o nome: ");
                matriz[linhas][colunas] = scanner.nextLine();
            }
        }

        System.out.println("\nMATRIZ DE NOMES COMPLETA: ");
        for(int linhas = 0; linhas < 4; linhas++){

            for(int colunas = 0; colunas < 4; colunas++){
                System.out.printf("%s\t", matriz[linhas][colunas]);
            }
            System.out.println();
        }

        System.out.println("\nDIAGONAL DA MATRIZ DE NOMES: ");
        for(int linhas = 0; linhas < 4; linhas++){

            for(int colunas = 0; colunas < 4; colunas++){

                if(linhas == colunas) {
                    System.out.printf("%s\t", matriz[linhas][colunas]);
                }else{
                    System.out.printf("\t");
                }

            }
            System.out.println();
        }



    }
}