package basic.tratamenoExecoes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFinally {
    public static void main(String[] args) {
        File file = new File("c://temp//n.txt");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
