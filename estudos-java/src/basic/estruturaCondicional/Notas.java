package basic.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.print("informe a segunda nota:");
        double nota2 = scan.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("Nota final do aluno = %.1f\n", notaFinal);

        if (notaFinal < 60.0){
            System.out.println("Aluno reprovado!");
        }

        scan.close();
    }
}
