package basic.exercises.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double porcentagem;
        double aumento;
        double novoSalario;

        System.out.print("Informe o salário da pessoa: ");
        double salario = scan.nextDouble();

        if (salario >= 1000.0) {
            porcentagem = 20;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;

        } else if (salario <= 3000.0) {
            porcentagem = 15;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
        } else {
            porcentagem = 5;
            aumento = salario * porcentagem / 100;
            novoSalario = salario + aumento;
        }

        System.out.printf("Novo salario = R$ %.2f\n", novoSalario);
        System.out.printf("Aumento = R$ %.2f\n", aumento);
        System.out.printf("Porcentagem = %.2f\n", porcentagem);
        scan.close();

    }
}
