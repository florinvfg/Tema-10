
import java.util.InputMismatchException;
import java.util.Scanner;

       

public class Main {

    public static void main(String[] args) {
        int entero = leerEntero();
        System.out.println("El entero ingresado es: " + entero);
    }

    public static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        int entero;
        while (true) {
            System.out.print("Ingrese un entero: ");
            try {
                entero = Integer.parseInt(scanner.nextLine());
                break; // Salimos del bucle si el entero es válido
            } catch (NumberFormatException e) {
                System.out.println("Error: debe ingresar un entero válido.");
            }
        }
        return entero;
    }
}
/*static Integer leerEntero() {
    Integer resultado;
    while (true) {
        try {
            System.out.println("Introducir entero: ");
            resultado = new Scanner(System.in).nextInt();
            break;
        }catch (InputMismatchException ex) {
            System.out.println("Tipo erroneo" );
        }
    }
    return resultado;
}
}
    */

