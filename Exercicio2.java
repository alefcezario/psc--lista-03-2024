import java.util.Scanner;

public class Exercicio2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorDaCompra, valorPago,troco;
        
        System.out.println("Digite o valor da sua compra R$");
        valorDaCompra = scanner.nextDouble();

        System.out.println("Agora digite o valor que vc irá pagar:");
        valorPago = scanner.nextDouble();
        
  
        if (valorPago < valorDaCompra) {
            System.out.println("O valor que vc pagou é menos do que o que vc precisa pagar.");
        }else{

        troco = valorPago - valorDaCompra;
        System.out.println("Troco R$" + troco);

        int[] notas={50, 20, 10, 5, 2, 1 };
        for (int nota : notas) {
            int quantidadeNotas=(int) (troco / nota);
            if (quantidadeNotas>0) {
                System.out.println("Notas de R$"+nota+": "+quantidadeNotas);
                troco%=nota;
            }
        }
    }
        scanner.close();
    }    
}
