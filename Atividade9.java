import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        
        int totalSegundos, horas, minutos, segundos;
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Algoritimo para calcular horas, minutos e segundos.");

        System.out.print("Digite a quantidade de segundos: ");
        totalSegundos = scanner.nextInt();

        horas = totalSegundos / 3600;
        minutos = (totalSegundos % 3600) / 60;
        segundos = totalSegundos % 60;

        System.out.println(horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
        
        scanner.close();
    }
}
