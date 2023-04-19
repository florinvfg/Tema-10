/*  10.17

En Linux disponemos del comando "more",al que se le pasa un fichero y lo muestra poco 
a poco:cada 24 lineas.Implementa un programa que funcione de forma similar.*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class More {
    public static void main(String[] args) throws IOException {
        

        // Crea un objeto FileReader para leer el archivo
        
        FileReader fileReader = new FileReader("fileReader.txt");

        // Crea un objeto BufferedReader para leer el archivo línea por línea
        BufferedReader bufferedReader = new BufferedReader(new FileReader("fileReader.txt"));

        // Inicializa una variable para contar el número de líneas leídas
        int lineCount = 0;

        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Lee la primera línea del archivo
        String line = bufferedReader.readLine();

        // Muestra las líneas del archivo de 24 en 24, hasta que se llegue al final
        while (line != null) {
            // Muestra la línea actual
            System.out.println(line);

            // Aumenta el contador de líneas
            lineCount++;

            // Si se han leído 24 líneas, espera la entrada del usuario para continuar
            if (lineCount % 24 == 0) {
                System.out.print("--More--");

                // Lee la entrada del usuario
                String input = scanner.nextLine();

                // Si la entrada es "q", sale del programa
                if (input.equalsIgnoreCase("q")) {
                    break;
                }
            }

            // Lee la siguiente línea del archivo
            line = bufferedReader.readLine();
        }

        // Cierra el archivo y el scanner
        bufferedReader.close();
        scanner.close();
    }
}

