import java.util.Scanner;

public class Ex02_ParImpar {
    public static void main(String[] args) {
        Scanner parImpar = new Scanner(System.in);
        int number;

        System.out.println("Digite um número: ");
        number = parImpar.nextInt();

            if (number % 2 == 0) {
                System.out.println("0 número " + number + " é par!");
            }else{
                System.out.println("O número " + number + " é ímpar!");
        }
    }
}