public class NumerosImpares {
    public static void main(String[] args){
        int soma = 0;
        for(int contador = 101; contador <= 199; contador++){
            if(contador % 2 != 0){
                soma += contador;
            }

        }
        System.out.printf("\nA soma dos numero primos é %d", soma);
    }
}
