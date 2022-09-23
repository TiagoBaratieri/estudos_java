package basic.estruturaDeDados.vetor;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scan.nextInt();

        double[] altura = new double[n];
        char[] genero = new char[n];
        double maiorAltura = altura[0];
        double menorAltura = altura[0];
        double mediaAltura;
        int nHomens = 0;
        double somaAltura = 0;
        double somaMulheres = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Altura da " + (i + 1) + " pessoa: ");
            altura[i] = scan.nextDouble();
            System.out.print("Genero da " + (i + 1) + " pessoa: (M/F) ");
            genero[i] = scan.next().charAt(0);
            if (genero[i] == 'M') {
                nHomens++;
            } else  {
                somaMulheres++;
                somaAltura = somaAltura + altura[i];
            }
            if (altura[i] > maiorAltura) {
                maiorAltura = altura[i];
            } else if (altura[i] < maiorAltura){
                menorAltura = altura[i];
            }
        }

        mediaAltura = somaAltura / somaMulheres;

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior Altura = " + maiorAltura);
        System.out.println("Media das alturas das mulheres = " + mediaAltura);
        System.out.println("Número de homens = " + nHomens);

        scan.close();
    }
}
