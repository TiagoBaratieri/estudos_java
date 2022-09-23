package basic.estruturaDeDados.vetor;


import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int soma = 0;
        double media;

        System.out.print("Informe o tamanho do veto:");
        int n = scan.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Preencha o basic.estruturaDeDados.vetor com números reais: ");
            vetor[i] = scan.nextDouble();
        }

        System.out.print("");
        System.out.println("Vetor Preenchido...");
        for (int i = 0; i < n; i++) {
            System.out.printf("Valores:%.1f\n", vetor[i]);
        }

        System.out.println("Somando elementos do basic.estruturaDeDados.vetor.");
        System.out.print("");
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        System.out.printf("Soma = %d \n", soma);
        System.out.printf("Média = %,2f ", media);
        scan.close();
    }
}
