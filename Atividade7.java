import java.util.Scanner;

public class Atividade7{

    public static void main (String[] args) {
        
        double salariofixo, valorVendas, comissao, comissaototal, salariototal;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa para calcular valor de vendas");

        System.out.println("\nMe informe o salario fixo do vendedor: ");
        salariofixo = scanner.nextDouble();
        
        System.out.println("Informe o valor total de vendas: ");
        valorVendas = scanner.nextDouble();

        System.out.println("Informe o percentual de comissao: ");
        comissao = scanner.nextDouble();
        
        comissaototal = (comissao / 100) * valorVendas;
        salariototal = salariofixo + comissaototal;
   
        System.out.printf("n/O salário total do vendedor é: R$ %.2f", salariototal);

        scanner.close();
        }

}

