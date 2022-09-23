package exerciciosSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome:");
        String nome1 = scan.nextLine();
        scan.nextLine(); // --------------> limpeza de buffer
        System.out.print("Idade:");
        int idade1 = scan.nextInt();

        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome:");
        String nome2 = scan.nextLine();
        scan.nextLine(); // --------------> limpeza de buffer
        System.out.print("Idade:");
        int idade2 = scan.nextInt();

        double media = (idade1 + idade2) / 2.0;

        System.out.printf("A idade media de %s e %s é de %.1f anos", nome1, nome2, media);

        scan.close();


    }
}
