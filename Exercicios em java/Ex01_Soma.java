import java.util.Scanner;

public class Ex01_Soma {
    public static void main(String[] args) {
        Scanner somar = new Scanner(System.in);


        int primeiroValor, segundoValor, soma;

        System.out.println("Digite o primeiro valor: ");
        primeiroValor = somar.nextInt();

        System.out.println("Digite o segundo valor: ");
        segundoValor = somar.nextInt();

        soma = primeiroValor + segundoValor;

        System.out.println("\nO resultado da soma é = " + soma);
    }
}