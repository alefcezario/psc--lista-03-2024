import java.util.Scanner;

public class Exercicio4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int indicadorOperacao;
        double raioCircEsf, perimetroCirculo, areaCirculo, volumeEsfera;

        System.out.println("Digite o indicador da operao:");
        System.out.println("1 perímetro do círculo");
        System.out.println("2 área do círculo");
        System.out.println("3 volume da esfera");
        indicadorOperacao = scanner.nextInt();

        System.out.println("Agora digite o raio do círculo/esfera:");
        raioCircEsf = scanner.nextDouble();

        if (indicadorOperacao == 1) {
            perimetroCirculo = 2 * Math.PI * raioCircEsf;
            System.out.println("O perímetro do círculo é: " + perimetroCirculo);

        } else if (indicadorOperacao == 2) {
            areaCirculo = Math.PI * raioCircEsf * raioCircEsf;
            System.out.println("a área do círculo é: " + areaCirculo);

        } else if (indicadorOperacao == 3) {

            volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raioCircEsf, 3);

            System.out.println("O volume da esfera é: " + volumeEsfera);

        } else {

            System.out.println("Código invalido. Insira apenas os valores solicitados!");
        }

        scanner.close();
    }
}
