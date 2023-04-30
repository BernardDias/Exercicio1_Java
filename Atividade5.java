import java.util.Scanner;

public class Atividade5 {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      
      System.out.print("Digite o número de horas trabalhadas no mês: ");
      double horasTrabalhadas = scanner.nextDouble();

      System.out.print("Digite o valor recebido por hora de trabalho: ");
      double valorHora = scanner.nextDouble();

      System.out.print("Digite o valor do salário família: ");
      double salarioFamilia = scanner.nextDouble();

      System.out.print("Digite o número de filhos com idade menor que 14 anos: ");
      int numFilhos = scanner.nextInt();

     
      double salarioBruto = (horasTrabalhadas * valorHora) + (salarioFamilia * numFilhos);

   
      System.out.printf("O salário bruto a ser recebido é: R$%.2f\n", salarioBruto);

      scanner.close();
   
   }
}
