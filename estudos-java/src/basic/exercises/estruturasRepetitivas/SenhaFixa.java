package basic.exercises.estruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan =  new Scanner(System.in);

        int senha;
        System.out.print("Informe a senha: ");
        senha = scan.nextInt();

        while (senha != 2022){
            System.out.println("Senha invalida!");
            senha = scan.nextInt();
        }

        System.out.println("Acesso permitido!");
    }
}
