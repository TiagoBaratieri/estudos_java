package basic.estruturaDeDados.vetor;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scan.nextInt();

        double[] vetor = new double[n];

        double maior = vetor[0];
        int posMaior = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Preencha o vetor com números reais: ");
            vetor[i] = scan.nextDouble();
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);
        scan.close();
    }
}
