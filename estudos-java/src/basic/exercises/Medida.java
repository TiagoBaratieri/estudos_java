package basic.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Medida {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a medida A:");
        double a = scan.nextDouble();
        System.out.print("Digite a medida B:");
        double b = scan.nextDouble();
        System.out.print("Digite a medida C:");
        double c = scan.nextDouble();


        double quadrado = a * a;
        System.out.printf("Area do quadrado = %,4f\n", quadrado);

        double triangulo = (a * b) / 2;

        System.out.printf("Area do triangulo = %,4f\n", triangulo);

        double trapezio = ((a + b) * c) / 2;

        System.out.printf("Area do trapezio = %.4f\n", trapezio);
    }
}
