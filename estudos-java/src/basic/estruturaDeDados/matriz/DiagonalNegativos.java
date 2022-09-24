package basic.estruturaDeDados.matriz;

import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz?");
        int n = scan.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]:", i, j);
                matriz[i][j] = scan.nextInt();
            }
        }

        System.out.println("Diagonal principal:");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", matriz[i][i]);
        }

        int qtdNegativos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    qtdNegativos++;
                }
            }
        }
        System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d\n", qtdNegativos);
    }
}
