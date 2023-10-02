import java.util.Scanner;

public class Ex07_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int resultado;
        System.out.println("Digite um número para calcular a tabuada: ");
        number = scanner.nextInt();

        System.out.println("\nA tabuada de " + number + " é: ");

        for (int i = 1; i <= 10; i++) {
            resultado = number * i;
            System.out.println(number + " x " + i + " = " + resultado);
        }
    }
}