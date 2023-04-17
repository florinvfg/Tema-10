/*10.2 Resuelta

Leer el archivo de texto Main.java de uno de los proyectos que hayamos terminado y mostrarlo por pantalla.  */


        import java.io.File;
        import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
        
        public class Main {
            public static void main(String[] args) {
                // Ruta al archivo a leer
               /*  String filePath = "ruta/al/archivo/Main.java";
        
                try {
                    // Crear objeto File
                    File file = new File(filePath);
        
                    // Crear objeto Scanner para leer el contenido del archivo
                    Scanner scanner = new Scanner(file);
        
                    // Leer y mostrar el contenido del archivo línea por línea
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        System.out.println(line);
                    }
        
                    // Cerrar el objeto Scanner
                    scanner.close();
        
                } catch (FileNotFoundException e) {
                    System.out.println("El archivo no se pudo encontrar.");
                }
            }
        }
        */
      String texto ="";
      FileReader in = null;
      try { 
            in = new FileReader("C:\\Users\\JAVA\\Desktop\\Carpeta general\\tema 9\\Tema 9 Aplicacion\\9_11Aplicacion\\src\\Main.java");
            int c = in.read();
             while ( c != -1) {
            texto = texto + (char) c;
            c = in.read();
     }}
      catch (IOException ex) {
      System.out.println(ex.getMessage());
     } finally { 
      if (in != null){
      try {
            in.close();
             } catch (IOException ex) {
            System.out.println(ex);
                     }
                }
      }
      System.out.println(texto);  
}
}
