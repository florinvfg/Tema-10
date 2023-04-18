import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

/* 6.10 Resueltas

Crear con un editor el fichero de texto Enteros.txt en la carpeta del proyecto actual de Visual Studio Code y escribir en el una 
serie de enteros separados por secuencia de espacios y tabuladores,incluso en lineas distintas,tal como:

2  3  45   73
123    4  21

Implementar un programa que acceda a Enteros.txt con un objeto Scanner a traves de un flujo de entrada,lea los numeros y calcule 
su suma y su media aritmetica,monstrando los resultados por pantalla.
*/

public class App {
    public static void main(String[] args) throws Exception {
       /*Primero ceamos el flujo de texto a partir del nombre delarchivo.Como dentro
     del bloque try solo se va a abrir el archivo y no se va a leer de el,
     basta con la exception FileNotFoundException,que es una subclase de IOException
    */

FileInputStream flujo = null;
try {
    flujo = new FileInputStream("Enteros.txt");
} catch (FileNotFoundException ex) { //validar su superclase IOException
  System.out.println(ex.getMessage());
}
Scanner s = new Scanner(flujo);
int contador = 0;
int suma = 0;
while (s.hasNext()) { //en principio,no sabemos cuantos numeros hay
    int n = s.nextInt();
    System.out.println(n + " "); //vamos mostrando los numeros leidos
    suma += n;
    contador ++;
 
}
double media = (double) suma / contador; //la media es un numero real
System.out.println ("\nsuma: " + suma + "  media: " + media );

    }
}
    

