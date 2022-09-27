package basic.tratamenoExecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {
        method1();

        System.out.println("End of program");
    }
    public static void method1() {
        System.out.println("Method 1 start");
        method2();
    }
    public static void method2() {
        System.out.println("Method2 start");
        Scanner scanner = new Scanner(System.in);

        try {
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.fillInStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        scanner.close();
        System.out.println("Method 2 end");
        System.out.println("Method 1 end");
    }
}

