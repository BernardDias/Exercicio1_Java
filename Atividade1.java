import java.util.Scanner;

public class Atividade1{

    public static void main (String[] args) {
        
        double numeroUm, numeroDois, media;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Algoritimo Calculo Média Aritmética");

        System.out.println("\nMe informe um numero positivo: ");
         numeroUm = scanner.nextDouble();
        
        System.out.println("Informe o segundo numero positivo: ");
        numeroDois = scanner.nextDouble();

        media = (numeroUm + numeroDois) / 2;
   
        System.out.println("A media aritimetica é " + media);

        scanner.close();
        }

}

