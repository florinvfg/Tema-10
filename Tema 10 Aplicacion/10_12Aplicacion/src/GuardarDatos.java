/* Diseña una aplicacion que pida al usuario su nombre y edad.Estos datos deben guardarse en el fichero datos.txt.
Si este fichero existe,deben añadirse al final en una nueva linea,y en caso de no existir,debe crearse.*/

 import java.io.FileWriter; // Importamos la clase FileWriter para poder escribir en un archivo
import java.io.BufferedWriter; // Importamos la clase BufferedWriter para escribir en un archivo de manera más eficiente
import java.io.IOException; // Importamos la clase IOException para manejar posibles errores de entrada/salida

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class GuardarDatos {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Creamos un objeto de la clase Scanner para leer la entrada del usuario
        
        System.out.println("Ingresa tu nombre:"); // Pedimos al usuario que ingrese su nombre
        String nombre = input.nextLine(); // Guardamos el nombre ingresado en una variable de tipo String
        
        System.out.println("Ingresa tu edad:"); // Pedimos al usuario que ingrese su edad
        int edad = input.nextInt(); // Guardamos la edad ingresada en una variable de tipo entero
        
        input.close(); // Cerramos el objeto Scanner para evitar pérdidas de memoria
        
        try {
            FileWriter fw = new FileWriter("datos.txt", true); // Creamos un objeto FileWriter para escribir en el archivo datos.txt, el segundo argumento "true" indica que el archivo debe abrirse en modo de añadir para no sobreescribir datos
            BufferedWriter bw = new BufferedWriter(fw); // Creamos un objeto BufferedWriter para escribir en el archivo de manera más eficiente
            bw.write(nombre + "," + edad + "\n"); // Escribimos el nombre y la edad del usuario en una nueva línea del archivo, separados por una coma
            bw.close(); // Cerramos el objeto BufferedWriter para evitar pérdidas de memoria
        } catch (IOException e) { // Manejamos posibles errores de entrada/salida con una excepción
            System.out.println("Ha ocurrido un error: " + e.getMessage()); // Mostramos un mensaje de error en caso de que algo salga mal
        }
        
        System.out.println("Los datos han sido guardados en el archivo datos.txt"); // Mostramos un mensaje indicando que los datos han sido guardados
    }


 }

