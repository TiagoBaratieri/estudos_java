package basic.estruturaDeDados.matriz;

import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual a ordem da matriz?");
        int n = scan.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = scan.nextInt();
            }
        }

        int somaAcima = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    somaAcima = somaAcima + matriz[i][j];
                }
            }
        }

        System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d\n", somaAcima);
        scan.close();
    }
}
