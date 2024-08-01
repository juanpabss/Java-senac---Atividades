import java.util.Random;

public class ExercicioProposto03 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int [][] matriz = new int[3][3];

        for(int linhas = 0; linhas < 3; linhas++){

            for(int colunas = 0; colunas < 3; colunas++){
                matriz[linhas][colunas] = gerador.nextInt(20);
            }
        }

        System.out.println("\nMATRIZ COMPLETA: ");
        for(int linhas = 0; linhas < 3; linhas++){

            for(int colunas = 0; colunas < 3; colunas++){
                System.out.printf("%d\t", matriz[linhas][colunas]);
            }
            System.out.println();
        }

        System.out.println("\nDIAGONAL DA MATRIZ: ");
        for(int linhas = 0; linhas < 3; linhas++){

            for(int colunas = 0; colunas < 3; colunas++){

                if(linhas == colunas) {
                    System.out.printf("%d\t", matriz[linhas][colunas]);
                }else{
                    System.out.printf("\t");
                }

            }
            System.out.println();
        }


    }
}