/* 0.4 Resuelta

Crear con un editor el fichero de texto Numeros reales.txt en la carpeta de Visual Studio Code
actual y escribir en el una serie de numeros reales separados por espacios simples.
Implementar un programa que acceda a NumerosReales.txt,lee los numeros y calcule la suma y la
 media aritmetica,mostrando los resultados por pantalla.*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

class NumerosReales {
    public static void main(String[] args) {
        BufferedReader in = null;
        // todos los numeros estan en una unica linea
        try {
           in = new BufferedReader(new FileReader("NumerosReales.txt"));
            String texto = in.readLine(); //leemos la cadena con los numeros
            String[] subcadenas =texto.split(" "); //separamos las subcadenas
            double suma = 0;
            for (int i = 0; i < subcadenas.length; i++){
                suma += Double.valueOf(subcadenas[i]); //las convertimos y acumulamos
            }
            System.out.println("suma: " + suma + "\tmedia: " + suma / subcadenas.length);
} catch (IOException ex) {
    System.out.println(ex.getMessage());
} finally {
    if (in != null){
        try {
            in.close();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
    }}
