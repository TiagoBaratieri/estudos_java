package basic.estruturaDeDados.vetor;

import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scan.nextInt();

        double soma = 0;
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Preencha o vetor com elementos reais: ");
            soma += vetor[i] = scan.nextDouble();
        }

        double media = soma / n;

        System.out.printf("Média = %.3f\n", media);
        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < media){
                System.out.printf("%.1f\n", vetor[i]);
            }
        }
        scan.close();
    }
}
