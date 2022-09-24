package basic.estruturaDeDados.matriz;

import java.util.Locale;
import java.util.Scanner;

public class NegativosMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a Quantidade de linhas da matriz? ");
        int m = scan.nextInt();
        System.out.print("Qual a Quantidade de colunas da matriz? ");
        int n = scan.nextInt();

        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Informe os números [%d,%d}", i, j);
                matriz[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println("Valores negativos: " + matriz[i][j]);
                }
            }
        }
    }
}
