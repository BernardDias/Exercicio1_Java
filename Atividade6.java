import java.util.Scanner;

public class Atividade6{

    public static void main (String[] args) {
        
        double baselogaritimo, logaritmo, logaritmando;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa para calcular logaritmo");

        System.out.println("\nMe informe o logaritmando: ");
        logaritmando = scanner.nextDouble();
        
        System.out.println("Informe a base: ");
        baselogaritimo = scanner.nextDouble();

        logaritmo = Math.log(logaritmando) / baselogaritimo;
   
        System.out.println("O logaritmo é " + logaritmo);

        scanner.close();
        }

}

