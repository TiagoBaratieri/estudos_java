package exerciciosSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo:");
        double raio = scan.nextDouble();

        double area = 3.14159 * raio * raio;

        System.out.printf("Area = %.3f\n", area);
        scan.close();
    }
}
