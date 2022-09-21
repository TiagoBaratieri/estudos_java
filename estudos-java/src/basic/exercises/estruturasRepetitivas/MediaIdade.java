package basic.exercises.estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int soma;
        int nPessoas;

        System.out.print("Digite a idade: ");
        int idade = scan.nextInt();

        if (idade < 0) {
            System.out.println("Impossível calcular");
        } else {
            soma = 0;
            nPessoas = 0;

            while (idade > 0) {
                soma += idade;
                nPessoas++;
                idade = scan.nextInt();
            }

            double media;
            media = soma / nPessoas;

            System.out.printf("Média = %.2f\n", media);
            scan.close();
        }
    }
}
