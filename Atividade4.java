import java.util.Scanner;

public class Atividade4 {
    
    public static void main (String[] args) {

double capital, prazo, jurosMensal, jurosPorcentagem, montante;
Scanner scanner = new Scanner(System.in);


System.out.println("Programa para calcular juros composto de uma aplicação" );

System.out.println("Digite o valor capital: ");
capital = scanner.nextDouble();

System.out.println("Digite o prazo da aplicação em mes: ");
prazo = scanner.nextDouble();

System.out.println("Digite a taxa de juros mensal: ");
jurosMensal = scanner.nextDouble();

 montante = capital * Math.pow((1 + jurosMensal), prazo);

        System.out.printf("O montante a ser recebido é: R$ %.2f", montante);

        scanner.close();
}
}