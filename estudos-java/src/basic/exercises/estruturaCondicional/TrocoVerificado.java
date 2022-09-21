package basic.exercises.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o preço unitário do produto:");
        double preco = scan.nextDouble();

        System.out.print("Informe a quantidade de produtos comprados:");
        int quantidade = scan.nextInt();

        System.out.print("Informe o dinheiro recebido:");
        double dinheiro = scan.nextDouble();

        if (preco * quantidade > dinheiro) {
            double faltam = preco * quantidade - dinheiro;
            System.out.printf("Dinheiro insuficiente. Faltam %.2f\n", faltam);
        } else {
            double troco = dinheiro - preco * quantidade;
            System.out.printf("Troco = %.2f\n", troco);
        }
    }
}
