import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diaDaSemana;
        int horaDoDia;
        System.out.println("Que dia é hoje ?");
        System.out.println("1. Segunda");
        System.out.println("2. terça");
        System.out.println("3. quarta");
        System.out.println("4. quinta");
        System.out.println("5. sexta");
        System.out.println("6. sabado");
        System.out.println("7. domingo");
        System.out.printf("\nDigite sua escolha: ");
        diaDaSemana = scanner.nextInt();

        System.out.printf("\nAgora digite a hora(entre 1 e 24 horas): ");
        horaDoDia = scanner.nextInt();

        if(diaDaSemana == 5 && horaDoDia >= 22){
            System.out.printf("\nDevido o horario e o dia, sextouuuuuuuuuuu");
        }
    }
}