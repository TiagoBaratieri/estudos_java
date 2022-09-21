package basic.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double base, altura, area, perimitro, diagonal;

        System.out.print("Informe a base do retângulo:");
        base = scan.nextDouble();

        System.out.print("Informe a altura do retângulo:");
        altura = scan.nextDouble();
        area = base * altura;

        System.out.printf("Area = %.4f\n", area);

        perimitro = 2 * (base + altura);

        System.out.printf("Perimitro = %.4f\n", perimitro);

        diagonal = Math.sqrt(base * base + altura * altura);

        System.out.printf("Diagonal = %4.f\n", diagonal);
        scan.close();
    }
}
