package basic.exercises.estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;

        int codigo = 0;


        while (codigo != 4) {
            System.out.println("Pesquisa de combustiveis mais uttilizados pelos clientes:");
            System.out.println("=-=-=-=-=--=-=-=--=-=-=--=-==--==-=-==--==-=-=--=-=-=-=-===");

            System.out.println("Informe o código do combustivel utilizado:");
            System.out.println("1-Alcool: ");
            System.out.println("2-Gasolina: ");
            System.out.println("3-Diesel: ");
            System.out.println("4-Sair: ");
            codigo = scan.nextInt();

            switch (codigo) {
                case 1 -> {
                    System.out.println("Você abasteceu com Alcool!");
                    alcool++;
                }
                case 2 -> {
                    System.out.println("Você abasteceu com Gasolina!");
                    gasolina++;
                }
                case 3 -> {
                    System.out.println("Você abasteceu com Diesel!");
                    diesel++;
                }
            }
        }

        System.out.println("MUITO OBRIGADO!");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }
}
