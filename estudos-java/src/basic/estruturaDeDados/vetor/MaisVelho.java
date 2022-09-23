package basic.estruturaDeDados.vetor;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas deseja digitar? ");
        int n = scan.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];

        int maiorIdade = idades[0];
        int posicaoMaior = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa: ");
            System.out.print("Nome:");
            nomes[i] = scan.next();
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaoMaior]);

        scan.close();

    }
}
