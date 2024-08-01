import java.util.Random;

public class ExerciciosProposto01 {
    public static void main(String[] args){
        Random gerador = new Random();

        int[][] matriz01 = new int[5][3];
        int[][] matriz02 = new int[5][3];

        int[][] matrizSoma = new int[5][3];

        for(int linhas = 0; linhas < 5; linhas++){

            for(int colunas = 0; colunas < 3; colunas++){
                matriz01[linhas][colunas] = gerador.nextInt(10);
            }
        }

        for(int linhas = 0; linhas < 5; linhas++){

            for(int colunas = 0; colunas < 3; colunas++){
                matriz02[linhas][colunas] = gerador.nextInt(10);
            }
        }

        for(int linhas = 0; linhas < 5; linhas++){

            for(int colunas = 0; colunas < 3; colunas++){
                matrizSoma[linhas][colunas] = ( matriz01[linhas][colunas] + matriz02[linhas][colunas] );
            }
        }

        System.out.println("\nMatriz 01: ");
        for(int linhas = 0; linhas < 5; linhas++){

            for(int colunas = 0; colunas < 3; colunas++){
                System.out.printf(" %d ",matriz01[linhas][colunas]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz 02: ");
        for(int linhas = 0; linhas < 5; linhas++){

            for(int colunas = 0; colunas < 3; colunas++){
                System.out.printf(" %d ",matriz02[linhas][colunas]);
            }
            System.out.println();
        }

        System.out.println("\nMatriz 01 + Matriz 02: ");
        for(int linhas = 0; linhas < 5; linhas++){

            for(int colunas = 0; colunas < 3; colunas++){
                System.out.printf(" %d ",matrizSoma[linhas][colunas]);
            }
            System.out.println();
        }

    }
}
