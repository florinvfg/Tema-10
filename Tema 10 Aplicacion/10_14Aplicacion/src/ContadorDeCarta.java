/* 10.14

Escribeun programa que lea un fichero de texto llamado carta.txt.tenemos que contar los carecteres,
las lineas y las palabras.Para simplificar supondremos que cada palabra esta separada de otra por un 
unico espacio en blanco o por un cambio de linea.*/


import java.io.*;

public class ContadorDeCarta {
    public static void main(String[] args) {
        File archivo = new File("carta.txt");  // Abrir archivo carta.txt
        int caracteres = 0;
        int lineas = 0;
        int palabras = 0;

        try {
            FileReader fr = new FileReader(archivo);  // Crear FileReader para leer archivo
            BufferedReader br = new BufferedReader(fr);  // Crear BufferedReader para leer líneas

            String linea;
            while ((linea = br.readLine()) != null) {  // Leer línea por línea
                lineas++;  // Incrementar contador de líneas
                caracteres += linea.length();  // Sumar longitud de la línea a contador de caracteres
                String[] palabrasLinea = linea.split(" ");  // Dividir línea en palabras
                palabras += palabrasLinea.length;  // Sumar cantidad de palabras a contador de palabras
            }

            br.close();  // Cerrar BufferedReader
            fr.close();  // Cerrar FileReader
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
            return;
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            return;
        }

        // Imprimir resultados
        System.out.println("El archivo tiene " + caracteres + " caracteres, " + lineas + " líneas, y " + palabras + " palabras.");
    }
}

