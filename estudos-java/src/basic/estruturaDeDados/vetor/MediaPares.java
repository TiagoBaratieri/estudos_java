package basic.estruturaDeDados.vetor;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int somaPares = 0;
        int pares = 0;
        double mediaPares;
        System.out.print("Quantos elentos vai ter o vetor? ");
        int n = scan.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite números inteiros: ");
            vetor[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                pares++;
            }
        }

        if (pares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            mediaPares = (double) somaPares / pares;

            System.out.printf("MEDIA DOS PARES = %.1f\n", mediaPares);
        }

    }
}
