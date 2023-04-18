
/* 10.11
 
Escribe un programa que solicite al ususario el nombre de un fichero de texto y muestre
su contenido en pantalla.Si no se proporciona ningun nombre de fichero,la aplicacion 
utilizara por defecto prueba.txt. 
*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.w3c.dom.Text;

public class App {

    public static void main(String[] args) {
        String Texto = "";
        String nombreArchivo;
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);

        // Si se proporciona un nombre de archivo como argumento, lo usamos en lugar del
        // por defecto

        try {
            System.out.print("Introduce el nombre del archivo: ");
            nombreArchivo = sc.next();
            File archivo = new File(nombreArchivo + ".txt");
            if (!archivo.exists()) {
                nombreArchivo = "prueba.txt";
            }
            br = new BufferedReader(new FileReader(nombreArchivo));
            String linea = br.readLine();
            while (linea != null) {
                Texto = Texto + linea + '\n';
                linea = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        System.out.println(Texto);
    }
}
