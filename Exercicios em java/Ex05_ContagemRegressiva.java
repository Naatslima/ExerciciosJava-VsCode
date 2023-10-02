import java.util.Scanner;

public class Ex05_ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorContagem;
        System.out.println("Insira o valor para iniciar a contagem regressiva: ");
        valorContagem = scanner.nextInt();

        if (valorContagem <=1) {
            System.out.println("Valor inválido");
        }else{
            System.out.println("\nA contagem regressiva é: ");
            for (; valorContagem >= 1; valorContagem--) {
                System.out.println(valorContagem);
            }
        }
    }
}