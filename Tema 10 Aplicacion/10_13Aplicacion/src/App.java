/* 10.13

Implementa un programa que lea dos listas de numeros enteros no ordenados de sendos archivos con un numero por linea,
los reuna en una lista unica y los guarde en orden creciente en un tercer archivo,de nuevo uno por linea.*/
import java.io.*;
import java.util.*;

public class App {
    
public static void main(String[] args) {

        // Rutas de los archivos de entrada y salida
        String inputPath1 = "lista1.txt";
        String inputPath2 = "lista2.txt";
        String outputPath = "lista3.txt";

        // Listas para almacenar los números de los archivos de entrada
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();

        // Leer los números del primer archivo y agregarlos a la lista correspondiente
        try (Scanner scanner = new Scanner(new File(inputPath1))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numbers1.add(number);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: archivo " + inputPath1 + " no encontrado.");
            return;
        }

        // Leer los números del segundo archivo y agregarlos a la lista correspondiente
        try (Scanner scanner = new Scanner(new File(inputPath2))) {
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                numbers2.add(number);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: archivo " + inputPath2 + " no encontrado.");
            return;
        }

        // Unir las dos listas en una sola
        List<Integer> mergedNumbers = new ArrayList<>(numbers1);
        mergedNumbers.addAll(numbers2);

        // Ordenar la lista resultante en orden creciente
        Collections.sort(mergedNumbers);

        // Guardar los números ordenados en el archivo de salida
        try (PrintWriter writer = new PrintWriter(new File(outputPath))) {
            for (int number : mergedNumbers) {
                writer.println(number);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: no se pudo escribir en el archivo " + outputPath);
            return;
        }

        System.out.println("Los números han sido unidos y ordenados en el archivo " + outputPath);
    }


    }

