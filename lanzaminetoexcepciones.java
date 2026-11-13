import java.util.Scanner;

public class lanzaminetoexcepciones {

    public static void comprobarEdad(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException(
                "Error: La edad debe ser igual o superior a 18 años."
            );
        }

        System.out.println("Acceso permitido.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce tu edad: ");
            int edad = scanner.nextInt();
            comprobarEdad(edad);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}