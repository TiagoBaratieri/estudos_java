package basic.estruturaDeDados.matriz;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int n = scan.nextInt();

        double[][] matriz = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elementos [%d,%d]: ", i, j);
                matriz[i][j] = scan.nextDouble();
            }
        }
        int somaPositivos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > 0) {
                    somaPositivos += matriz[i][j];
                }
            }
        }

        System.out.printf("Soma dos positivos:\n\n" + somaPositivos);
        System.out.print("Escolha um linha: ");
        int indlinha = scan.nextInt();

        System.out.print("Linha escolida: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", matriz[indlinha][i]);
        }

        System.out.print("\n\nEscolha uma coluna: ");
        int indColuna = scan.nextInt();

        System.out.print("COLUNA ESCOLHIDA: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", matriz[i][indColuna]);
        }

        System.out.print("\n\nDIAGONAL PRINCIPAL: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", matriz[i][i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = Math.pow(matriz[i][j], 2);
                }
            }
        }

        System.out.println("\n\nMATRIZ ALTERADA:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%.1f ", matriz[i][j]);
            }
            System.out.println();
        }

        scan.close();
    }
}

