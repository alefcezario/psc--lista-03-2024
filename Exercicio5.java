import java.util.Scanner;
public class Exercicio5 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double primeiroNumero, segundoNumero, resultadoOperacao;
        char simboloOperacao;

        System.out.println("Digite o primeiro numero real:");
        primeiroNumero = scanner.nextDouble();

        System.out.println("Digite o segundo numero real:");
        segundoNumero = scanner.nextDouble();

        System.out.println("Digite o símbolo para a operação (+, -, *, /, ^):");
        simboloOperacao = scanner.next().charAt(0);
      
        resultadoOperacao = 0;
        switch (simboloOperacao) {
            case '-':
            resultadoOperacao = primeiroNumero - segundoNumero;
                break;

            case '+':
            resultadoOperacao = primeiroNumero + segundoNumero;
                break;

            case '*':
            resultadoOperacao = primeiroNumero * segundoNumero;
                break;
                
            case '/':
                if (segundoNumero != 0) {
                    resultadoOperacao = primeiroNumero / segundoNumero;
                } else {
                    System.out.println("Não é possivel dividir por zero!");

                }
                break;

            case '^':
            resultadoOperacao = Math.pow(primeiroNumero, segundoNumero);
                break;
            default:
                System.out.println("Simbolo diferente dos solicitados. Favor inserir apenas os simbolos (+, -, *, /, ^)");
   
        }

        System.out.println("O resultado é: " + resultadoOperacao);

        scanner.close();
    }
}
