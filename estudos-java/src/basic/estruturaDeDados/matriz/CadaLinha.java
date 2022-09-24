package basic.estruturaDeDados.matriz;

import java.util.Locale;
import java.util.Scanner;

public class CadaLinha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual é a ordem da matriz? ");
        int n = scan.nextInt();

        int maior;
        int[][] mattriz = new int[n][n];
        int[] maiorlinha = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                mattriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            maior = mattriz[0][i];
            for (int j = 0; j < n; j++) {
                if (mattriz[i][j] > maior) {
                    maior = mattriz[i][j];
                }
            }
            maiorlinha[i] = maior;
        }

        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\n", maiorlinha[i]);
        }
        scan.close();
    }
}
