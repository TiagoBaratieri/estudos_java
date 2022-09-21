package basic.exercises.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a hora inicial do jogo: ");
        int hInicial = scan.nextInt();

        System.out.print("Informe a hora final do jogo: ");
        int hFinal = scan.nextInt();

        if (hInicial < hFinal) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", hFinal - hInicial);
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (hInicial - hFinal));
        }

        scan.close();
    }
}
