/* 10.16


Un libro de firmas es util para recoger los nombres de todas las personas que han pasado por un determinado lugar.
Crea una aplicacion que permita mostrar el libro de firmas e insertar un nuevo nobre (comprobando que no se
 encuentre repetido).Llamaremos al fichero firmas.txt. */



 import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.HashSet;
 import java.util.Scanner;
 import java.util.Set;
 
 public class LibroDeFirmas {
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String nombre;
 
         // Cargamos los nombres existentes en el archivo firmas.txt en un conjunto (Set)
         Set<String> nombresExistentes = cargarNombresExistentes();
 
         // Mostramos los nombres existentes en el archivo
         System.out.println("Nombres existentes en el libro de firmas:");
         for (String n : nombresExistentes) {
             System.out.println(n);
         }
 
         // Solicitamos al usuario que ingrese un nuevo nombre
         System.out.print("Ingrese un nuevo nombre: ");
         nombre = sc.nextLine();
 
         // Verificamos que el nombre no esté repetido
         if (nombresExistentes.contains(nombre)) {
             System.out.println("El nombre ya se encuentra en el libro de firmas.");
         } else {
             // Si el nombre no está repetido, lo agregamos al archivo y al conjunto
             nombresExistentes.add(nombre);
             escribirNombreEnArchivo(nombre);
             System.out.println("El nombre ha sido agregado al libro de firmas.");
         }
 
         sc.close();
     }
 
     /**
      * Carga los nombres existentes en el archivo firmas.txt en un conjunto (Set).
      */
     private static Set<String> cargarNombresExistentes() {
         Set<String> nombresExistentes = new HashSet<>();
 
         try (BufferedReader br = new BufferedReader(new FileReader("firmas.txt"))) {
             String nombre;
             while ((nombre = br.readLine()) != null) {
                 nombresExistentes.add(nombre);
             }
         } catch (IOException e) {
             System.out.println("Error al cargar los nombres existentes.");
             e.printStackTrace();
         }
 
         return nombresExistentes;
     }
 
     /**
      * Escribe un nuevo nombre en el archivo firmas.txt.
      */
     private static void escribirNombreEnArchivo(String nombre) {
         try (FileWriter fw = new FileWriter("firmas.txt", true)) {
             fw.write(nombre + "\n");
         } catch (IOException e) {
             System.out.println("Error al escribir el nuevo nombre en el archivo.");
             e.printStackTrace();
         }
     }
 }
 
 
