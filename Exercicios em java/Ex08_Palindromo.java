import java.util.Scanner;

public class Ex08_Palindromo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String palavra;

        System.out.println("Digite uma palavra para verificar se é um palíndromo: ");
        palavra = leitor.nextLine();

        if (verificador(palavra)) {
            System.out.println(palavra + " é um palíndromo!");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
        private static boolean verificador(String palavra){

        //remove os espaços em branco e converte a palavra em minúscula
        palavra = palavra.replaceAll("", "").toLowerCase();

            int tamanho = palavra.length();

            //comparar os caracteres da esquerda até a metada da palavra e verificar se é um palíndromo
            for (int i = 0; i < tamanho / 2; i++) {

                //verifica se ps caracteres correspondem na parte reversa da palavra
                if (palavra.charAt(i) != palavra.charAt(tamanho-1 -i)) {
                    return false;
                }
            }

            return true;
        }
    }