import java.util.Scanner;

public class Ex09_ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        System.out.println("Escolha o número da conversão que deseja: ");
        System.out.println("1 = De Celsius para Fahrenheit");
        System.out.println("2 = De Fahrenheit para Celsius");
        escolha = scanner.nextInt();

        double celsius;
        double fahrenheit;
        double resultado;

        if (escolha == 1) {
            System.out.println("\nDigite a temperatura em graus Celsius: ");
            celsius = scanner.nextDouble();
            resultado = (celsius * 9/5) + 32;
            System.out.println("\nA temperatura em Fahrenheit é: " + resultado + "°F");

        } else if (escolha == 2) {
            System.out.println("\nDigite a temperatura em Fahrenheit: ");
            fahrenheit = scanner.nextDouble();
            resultado = (fahrenheit - 32) * 5/9;
            System.out.println("\nA temperatura em Celsius é: " + resultado + "°C");

        } else {
            System.out.println("\nOpção inválida, escolha 1 ou 2.");
        }
    }
}