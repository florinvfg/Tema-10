/* 10.8 Resuelta
Escribir un programa que duplique el contenido de un fichero cuyo nombre se pide al usuario.El fichero copia tendra el mismo nombre con el prefijo <<copia_de_>>.
*/
 import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopiarArchivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre del archivo a copiar: ");
        String fichOriginal = sc.nextLine();

        String fichCopia = "copia_de_" + fichOriginal ;

        try (BufferedReader in = new BufferedReader(new FileReader(fichOriginal));
             BufferedWriter out = new BufferedWriter(new FileWriter(fichCopia))) {

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            System.out.println("Archivo copiado correctamente.");

        } catch (IOException ex) {
            System.out.println("Error al copiar el archivo: " + ex.getMessage());
        }
    }
}
