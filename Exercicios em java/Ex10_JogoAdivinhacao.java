import java.util.Random;
import java.util.Scanner;

public class Ex10_JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Jogo de Adivinhação de números! Tente acertar de 1 a 100.");


        int numeroAleatorio;
        numeroAleatorio = random.nextInt(100);
        boolean acertou = false;

        System.out.println("\nDigite seu número: ");

        for (int i = 1; !acertou; i++) {
                int numero;
                numero = scanner.nextInt();

            if (numero < numeroAleatorio) {
            System.out.println("Errou, digite um número maior.");

            } else if (numero > numeroAleatorio) {
            System.out.println("Errou, digite um número menor.");

            } else {
            acertou = true;
            System.out.println("Parábens você adivinhou o número!!!");
            }
        }
    }
}