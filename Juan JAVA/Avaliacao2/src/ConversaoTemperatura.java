import java.util.Scanner;

public class ConversaoTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler temperatura em Celsius e converter para Fahrenheit
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitConvertido = celsiusParaFahrenheit(celsius);
        System.out.println(celsius + " graus Celsius é igual a " + fahrenheitConvertido + " graus Fahrenheit.");

        // Ler temperatura em Fahrenheit e converter para Celsius
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusConvertido = fahrenheitParaCelsius(fahrenheit);
        System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsiusConvertido + " graus Celsius.");

        scanner.close();
    }

    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
