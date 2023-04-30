import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        double valor1, valor2, valor3, mediaAritmetica, mediaHarmonica, mediaGeometrica;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        valor3 = scanner.nextDouble();

        mediaAritmetica = (valor1 + valor2 + valor3) / 3;
        mediaHarmonica = 3 / ((1 / valor1) + (1 / valor2) + (1 / valor3));
        mediaGeometrica = Math.cbrt(valor1 * valor2 * valor3);

        System.out.println("Média aritmética: " + mediaAritmetica);
        System.out.println("Média harmônica: " + mediaHarmonica);
        System.out.println("Média geométrica: " + mediaGeometrica);

        scanner.close();
    }
}
