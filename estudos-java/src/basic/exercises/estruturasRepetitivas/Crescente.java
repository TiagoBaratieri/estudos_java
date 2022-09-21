package basic.exercises.estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite dois números inteiros: ");
        int x = scan.nextInt();
        int y = scan.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Decrescente!");
            } else {
                System.out.println("Crescente!");
            }
            System.out.println("Digite outros 2 números: ");
            x = scan.nextInt();
            y = scan.nextInt();
        }

        scan.close();
    }
}
