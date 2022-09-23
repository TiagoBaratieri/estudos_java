package exerciciosSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.print("Preço unitario do produto:");
        double preco = scan.nextDouble();

        System.out.print("Quantidade da compra:");
        int quantidade = scan.nextInt();

        System.out.print("Dinheiro recebido:");
        double dinheiro = scan.nextDouble();

        double troco = dinheiro - (preco * quantidade);

        System.out.printf("Troco = %.2f\n", troco);
    }
}
