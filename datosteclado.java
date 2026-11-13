import java.util.InputMismatchException;
import java.util.Scanner;

public class datosteclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce tu edad: ");
            int edad = scanner.nextInt();
            System.out.println("Tu edad es: " + edad);
        } catch (InputMismatchException e) {
            System.out.println("Error: debes introducir un número entero.");
        } finally {
            scanner.close();
        }
    }
}