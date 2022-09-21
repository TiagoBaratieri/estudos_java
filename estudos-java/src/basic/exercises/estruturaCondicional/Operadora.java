package basic.exercises.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidades de minutos:");
        int minutos = scan.nextInt();

        double valor = 50.0;

        if (minutos > 100) {
            valor += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f\n", valor);

        scan.close();
    }
}
