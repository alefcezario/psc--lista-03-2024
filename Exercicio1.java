import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNum, segundoNum, terceiroNum, maiorNum, menorNum, media;

        System.out.println("Digite o primeiro numero:");
        primeiroNum = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        segundoNum = scanner.nextInt();
        System.out.println("Digite o terceiro numero:");
        terceiroNum = scanner.nextInt();

        if (primeiroNum>segundoNum&&primeiroNum>terceiroNum) {
        System.out.println("O maior numero é: "+primeiroNum);  
            
        }else if (segundoNum>primeiroNum&&segundoNum>terceiroNum) {
            System.out.println("O maior numero é: "+segundoNum);   
        }else{
            System.out.println("O maior numero é: "+terceiroNum);  
        }

        media = (primeiroNum + segundoNum + terceiroNum) / 3;

        System.out.println("A media dos numeros é: "+media);

        scanner.close();
    }
}
