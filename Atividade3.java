import java.util.Scanner;

public class Atividade3 {
    
public static void main (String[] args) {

double numeroUm, temperatura;

Scanner scanner = new Scanner(System.in);

System.out.println("Programa para converter Fahrenheit em graus centigrados");

System.out.println("Informe os graus em Fahrenheit :");
numeroUm = scanner.nextDouble();

temperatura = (numeroUm - 32) / 1.8;

System.out.println("A temperatura convertida é: " + temperatura);

scanner.close();

}
}
