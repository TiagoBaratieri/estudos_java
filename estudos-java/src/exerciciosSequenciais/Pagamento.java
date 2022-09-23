package exerciciosSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o nome do funcionario:");
        String nome = scan.nextLine();

        System.out.print("Informe o valor por hora trabalhada:");
        double valorHora = scan.nextDouble();

        System.out.print("Infforme o total de horas trabalhadas:");
        int horas = scan.nextInt();

        double pagamento = valorHora * horas;

        System.out.printf("O pagamentto pa %s deve ser %.2f\n", nome, pagamento);
    }
}
