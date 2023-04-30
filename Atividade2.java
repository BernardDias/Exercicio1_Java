import java.util.Scanner;

public class Atividade2 {
    public static void main (String[] args) {

    double numeroUm, porcentagem;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Programa para acrescentar valor a um produto: ");

    System.out.println("Digite o valor do produto: ");
    numeroUm = scanner.nextDouble();

    porcentagem = numeroUm * 1.1;

    System.out.println("Esse é o novo valor do produto: " + porcentagem);

        scanner.close();

}
}