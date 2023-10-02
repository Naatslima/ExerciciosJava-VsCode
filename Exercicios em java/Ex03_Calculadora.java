import java.util.Scanner;

public class Ex03_Calculadora {
    public static void main(String[] args) {
        Scanner calculadoraSimples = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Escolha o número da operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = calculadoraSimples.nextInt();

        System.out.println("\nDigite o primeiro número: ");
        double numero1 = calculadoraSimples.nextDouble();

        System.out.println("\nDigite o segundo número: ");
        double numero2 = calculadoraSimples.nextDouble();

        double resultado = 0;

        if (operacao == 1) {
            resultado = numero1 + numero2;

        }else if(operacao == 2) {
            resultado = numero1 - numero2;

        }else if(operacao == 3) {
            resultado = numero1 * numero2;

        }else{
            resultado = numero1 / numero2;
        }

        System.out.println("\nO resultado da sua conta é: " + resultado);
    }
}