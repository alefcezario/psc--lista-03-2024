import java.util.Random;
import java.util.Scanner;
public class Exercicio6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int primeiroNumero, segundoNumero, menorNumero, maiorNumero, resultadoSorteio;

        System.out.println("Digite o primeiro número para o sorteio:");
        primeiroNumero = scanner.nextInt();

        System.out.println("Agora digite o segundo número:");
        segundoNumero = scanner.nextInt();

        menorNumero = Math.min(primeiroNumero, segundoNumero);
        maiorNumero = Math.max(primeiroNumero, segundoNumero);
        resultadoSorteio = random.nextInt((maiorNumero-menorNumero)+1)+menorNumero;

        System.out.println("O resultado do sorteio é: "+resultadoSorteio);

        if (resultadoSorteio % 2 == 0) {
            System.out.println("Esse número é par!");
        } else {
            System.out.println("Esse número o é ímpar!");
        }

        scanner.close();
    }
}
