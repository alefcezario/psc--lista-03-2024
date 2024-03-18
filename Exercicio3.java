import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double valorA, valorB, valorC, valorDelta, valorRaiz,primeiraRaiz,segundaRaiz;

        System.out.println("Digite o coeficiente a:");
        valorA = scanner.nextDouble();


        System.out.println("Digite o coeficiente b:");
        valorB = scanner.nextDouble();

        System.out.println("Digite o coeficiente c:");
        valorC = scanner.nextDouble();

        valorDelta = valorB * valorB - 4 * valorA * valorC;

        if (valorA == 0 && valorB == 0 && valorC != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }else if(valorA == 0 && valorB != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            valorRaiz = -valorC / valorB;
            System.out.println("A raiz real da equação é: " + valorRaiz);
        }else if(valorDelta < 0) {
            System.out.println("Esta equação não possui raízes reais");
        }else if(valorDelta == 0){
            System.out.println("Esta equação possui duas raízes reais iguais.");
            valorRaiz = -valorB / (2 * valorA);
            System.out.println("As raízes reais da equação são: " + valorRaiz + " e " + valorRaiz);
        } else {
            System.out.println("Essa equação possui duas raízes reais diferentes.");
            primeiraRaiz = (-valorB + Math.sqrt(valorDelta)) / (2 * valorA);
            segundaRaiz = (-valorB - Math.sqrt(valorDelta)) / (2 * valorA);
            System.out.println("As raízes da equação são: " + primeiraRaiz + " e " + segundaRaiz);
        }
        scanner.close();
    }
}
