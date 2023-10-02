import java.util.Scanner;

public class Ex06_MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros;
        System.out.println("Quantos números deseja inserir? ");
        quantidadeNumeros = scanner.nextInt();

        double soma = 0;
        double numero;

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("\nDigite o número: ");
            numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma/quantidadeNumeros;
        System.out.println("\nA média dos números é: " + media);

    }
}