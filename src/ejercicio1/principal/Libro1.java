//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de páginas.
package ejercicio1.principal;

import java.util.Scanner;
import ejercicio1.entidades.Libro;



public class Libro1 {

    public static void main(String[] args) {
        
       Scanner leer = new Scanner( System.in);
       
         Libro l1 = new Libro(21893, "la cosa2", "juan", 34);
         l1.tomaDato();
  
         System.out.println(" Los datos del libro cargado son: "+l1.toString());
    }
    
}
