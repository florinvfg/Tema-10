import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int contador = 1;
        try ( BufferedReader br = new BufferedReader(new FileReader("fichero.txt"))) {
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                if (contador % 24 == 0) {
                    System.out.println("         more");
                    //paramos la salida por pantalla (esperando intro):
                    new Scanner(System.in).nextLine();
                }
                linea = br.readLine();
                contador++;
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
