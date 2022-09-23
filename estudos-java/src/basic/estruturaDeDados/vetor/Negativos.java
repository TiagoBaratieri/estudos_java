package basic.estruturaDeDados.vetor;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt();
        }

        System.out.println("Núeros negativos.");

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }
        scan.close();
    }
}
