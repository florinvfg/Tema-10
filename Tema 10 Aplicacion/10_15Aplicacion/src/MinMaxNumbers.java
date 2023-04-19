/* 10.15
En el archivo numeros.txt disponemos de una serie de numeros (uno por cada linea).Diseña un programa que 
procese el fichero y nos muestre el menor y el mayor.
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MinMaxNumbers {

    public static void main(String[] args) {
        // Nombre del archivo a leer
        String fileName = "numeros.txt";
        
        // Variables para almacenar el mínimo y el máximo
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Variable para almacenar cada línea del archivo
        String line = null;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                // Convertir la línea a un número entero
                int num = Integer.parseInt(line.trim());
                
                // Comprobar si es el mínimo o el máximo actual
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }
        } catch (IOException e) {
            // Si hay algún error al leer el archivo, imprimir el mensaje de error
            System.err.format("Error al leer el archivo '%s': %s%n", fileName, e.getMessage());
        } catch (NumberFormatException e) {
            // Si alguna línea no es un número válido, imprimir el mensaje de error
            System.err.format("Error al procesar la línea '%s': %s%n", line, e.getMessage());
        }
        
        // Imprimir el resultado
        System.out.format("El mínimo es %d y el máximo es %d%n", min, max);
    }
}
