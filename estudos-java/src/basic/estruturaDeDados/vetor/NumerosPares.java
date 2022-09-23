package basic.estruturaDeDados.vetor;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite um número inteiro: ");
            vetor[i] = scan.nextInt();
        }

        int par = 0;
        System.out.println("Vetor de números pares:");
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                par++;
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Quantidade de números pares: " + par);

    }
}
