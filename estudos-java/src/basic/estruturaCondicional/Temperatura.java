package basic.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual escala de temperatura você quer converter? (C/F)");
        char escala = scan.next().charAt(0);
        double fahrenheit;
        double celsius;

        if (escala == 'F') {
            System.out.print("Informe a tenperatura em fahrenheit: ");
            fahrenheit = scan.nextDouble();

            celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
            System.out.printf("Temperatura equivalente em celsius: 5.2f\n", celsius);
        } else {
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = scan.nextDouble();

            fahrenheit = celsius * 9.0 / 5.0 + 32.0;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", fahrenheit);
        }
    }
}
