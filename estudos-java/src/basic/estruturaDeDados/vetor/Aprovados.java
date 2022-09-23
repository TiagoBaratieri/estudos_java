package basic.estruturaDeDados.vetor;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados? ");
        int n = scan.nextInt();

        double media;
        String[] alunos = new String[n];
        double[] notas1 = new double[n];
        double[] notas2 = new double[n];


        for (int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
            scan.nextLine();
            alunos[i] = scan.nextLine();
            notas1[i] = scan.nextDouble();
            notas2[i] = scan.nextDouble();
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < n; i++) {
            media = (notas1[i] + notas2[i]) / 2;

            if (media >= 6.0) {
                System.out.printf("%s\n", alunos[i]);
            }
        }

        scan.close();
    }
}

