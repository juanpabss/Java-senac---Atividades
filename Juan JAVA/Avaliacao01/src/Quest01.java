public class Quest01 {
    public static void main(String[] args) {

        System.out.println("Progama que imprime os nuero de 1 a 100 de forma decrecente.");
        int contador = 100;

        for(int i = 1; i <= 100; i++){
            System.out.printf("\n%d ",contador);
            contador--;
        }

    }
}