package basic.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Dardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe as três distancias: ");
        double distancia1 = scan.nextDouble();
        double distancia2 = scan.nextDouble();
        double distancia3 = scan.nextDouble();

        double maior;
        if (distancia1 > distancia2 && distancia1 > distancia3) {
            maior = distancia1;
        } else if (distancia2 > distancia1 && distancia2 > distancia3) {
            maior = distancia2;
        } else {
            maior = distancia3;
        }

        System.out.printf("Maior disttancia = %.2f", maior);
    }
}
