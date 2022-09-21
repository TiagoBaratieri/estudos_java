package basic.exercises.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class MenorDeTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o prineiro valor:");
        int a = scan.nextInt();
        System.out.print("Informe o segundo valor:");
        int b = scan.nextInt();
        System.out.print("Informe o terceiro valor:");
        int c = scan.nextInt();

        int menor;
        if (a < b && a < c) {
            menor = a;
        } else menor = Math.min(b, c);

        System.out.printf("Menor = %d\n", menor);
    }
}
