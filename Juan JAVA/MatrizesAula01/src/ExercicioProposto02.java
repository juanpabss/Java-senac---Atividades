import java.util.Random;

public class ExercicioProposto02 {
    public static void main(String[] args) {
        Random gerador = new Random();

        double[][] matriz01 = new double[4][4];
        double[][] matriz02 = new double[4][4];

        double[][] matrizMultiplica = new double[4][4];

        for (int linhas = 0; linhas < 4; linhas++) {

            for (int colunas = 0; colunas < 4; colunas++) {
                matriz01[linhas][colunas] = gerador.nextDouble(10);
                matriz02[linhas][colunas] = gerador.nextDouble(10);

                matrizMultiplica[linhas][colunas] = ( matriz01[linhas][colunas] * matriz02[linhas][colunas] );

            }
        }


        System.out.println("\nMatriz 01: ");
        for (int linhas = 0; linhas < 4; linhas++) {

            for (int colunas = 0; colunas < 4; colunas++) {
                System.out.printf(" %.2f ", matriz01[linhas][colunas]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz 02: ");
        for (int linhas = 0; linhas < 4; linhas++) {

            for (int colunas = 0; colunas < 4; colunas++) {
                System.out.printf(" %.2f ", matriz02[linhas][colunas]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz 01 * Matriz 02: ");
        for (int linhas = 0; linhas < 4; linhas++) {

            for (int colunas = 0; colunas < 4; colunas++) {
                System.out.printf(" %.2f ", matrizMultiplica[linhas][colunas]);
            }
            System.out.println();
        }

    }
}