import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {

        int totalVeiculos, totalRodas, qtdMotos, qtdCarros;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo para calcular quantidade de veiculos no estacionamento.");

        System.out.print("Digite o total de veículos no estacionamento: ");
         totalVeiculos = scanner.nextInt();

        System.out.print("Digite o total de rodas dos veículos: ");
         totalRodas = scanner.nextInt();

         qtdMotos = (totalRodas - (totalVeiculos * 4)) / 2;
         qtdCarros = totalVeiculos - qtdMotos;

        System.out.printf("O estacionamento tem %d carros e %d motos.", qtdCarros, qtdMotos);

        scanner.close();
    }
}
