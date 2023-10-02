import java.util.Scanner;

public class Ex04_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        System.out.println("Informe o número para calcular o fatorial: ");
        number = scanner.nextInt();

        if(number >= 0) {
            long fatorial = 1;
            int i = 1;

            for (i = 1; i <= number; i++) {
                fatorial = fatorial * i;
            }
            System.out.println("O fatorial de " + number + " é: " + fatorial);
        }else{
            System.out.println("O fatorial não existe!");
        }
    }
}