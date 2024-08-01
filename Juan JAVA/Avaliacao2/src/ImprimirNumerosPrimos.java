public class ImprimirNumerosPrimos {
    public static void main(String[] args) {
        //Progama que imprimi todos os numeros primos de entre 2 é 1000

        for (int numero = 2; numero <= 1000; numero++){
                if (numero == 2 ) {
                    System.out.println(numero);
                }else {
                    if(eprimo(numero)){
                        System.out.println(numero);
                    }
                }

            }
        }

    public static boolean eprimo(int numero) {
        for (int contador = 2; contador < numero; contador++) {
            if (numero % contador == 0) {
                return false;
            }



        }
        return true;
    }

}

