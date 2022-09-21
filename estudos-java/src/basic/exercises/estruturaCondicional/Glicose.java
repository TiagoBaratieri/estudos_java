package basic.exercises.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Glicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("informe a medida da clicose:");
        double clicose = scan.nextDouble();

        System.out.print("Classificação:");
        if (clicose <= 100) {
            System.out.print("Normal");
        } else if (clicose <= 140) {
            System.out.print("Elevado");
        } else {
            System.out.print("Diabetes");
        }

        scan.close();
    }
}
