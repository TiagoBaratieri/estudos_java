package basic.estruturaDeDados.matriz;

import java.util.Locale;
import java.util.Scanner;

public class SomaMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter a matriz?");
        int m = scan.nextInt();
        System.out.print("Quantas colunas vai ter a matriz?");
        int n = scan.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Digite os valores da matriz A.");
                System.out.printf("Elemento [%d,%d]:", i, j);
                A[i][j] = scan.nextInt();
                System.out.println("Digite os valores da matriz B.");
                System.out.printf("Elemento [%d,%d]: ", i, j);
                B[i][j] = scan.nextInt();
                C[i][j] += A[i][j] + B[i][j];
            }
        }

        System.out.println("Matriz soma:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(C[i][j]);
            }
        }
        scan.close();
    }
}
