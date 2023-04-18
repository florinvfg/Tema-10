import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*10.3 Resuelta

Repetir la Actividad resuelta 10.2 usando un flujo de texto con bufer. */

public class App {
    public static void main(String[] args) throws Exception {
        String textoString = "";
        BufferedReader in = null;
       
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\JAVA\\Desktop\\Carpeta general\\tema 9\\Tema 9 Aplicacion\\9_11Aplicacion\\src\\Main.java"));
        String linea = in.readLine();
        while (linea != null) {
            textoString = textoString + linea + "\n ";
            linea = in.readLine();
        }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        } finally {
            if (in != null) {
            }try {
                in.close();
            
             } catch (IOException ex) {
                System.out.println(ex);
               
            }

        }
        
   
    System.out.println(textoString);
}
}
