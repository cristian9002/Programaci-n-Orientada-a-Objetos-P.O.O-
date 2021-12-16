// Programa Nespresso. Desarrolle una clase Cafetera con los atributos
// capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
// cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
// menos, los siguientes métodos:
// • Constructor predeterminado o vacío
// • Constructor con la capacidad máxima y la cantidad actual
// • Métodos getters y setters.
// • Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
// máxima.
// • Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
// tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
// cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
// método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
// cuanto quedó la taza.
// • Método vaciarCafetera(): pone la cantidad de café actual en cero.
// • Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
// recibe y se añade a la cafetera la cantidad de café indicada.
package ejercicio6.principal;

import ejercicio6.entidades.Cafetera;
import ejercicio6.servicio.CafeteraServicio;
import java.util.Scanner;

public class Cafetera1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner ( System.in);
        
       CafeteraServicio cafeteraServicio = new CafeteraServicio();
        
       Cafetera cafetera = cafeteraServicio.llenarCafetera();
       int op;
       
       do{
           
           System.out.println("____________________________");
        System.out.println("Cual tarea desee realizar? ");
        System.out.println("1. Servir cafe");
        System.out.println("2. agregar cafe a la cafetera");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Salir ");
           System.out.println("____________________________");
        op = leer.nextInt();
        
        switch(op){
           case 1: 
               cafeteraServicio.servirTaza(cafetera);
            break;
            
           case 2:
               cafeteraServicio.agregarCafe(cafetera);
            break;
            
           case 3:
               cafeteraServicio.vaciarCafetera(cafetera);
            break;
            
           case 4:
               System.out.println("Muchas gracias");
            break;
               
           default:
               System.out.println("Opcion incorrecta");       
           
       }
       } while ( op !=4);
       }
}
       
           
           
       
        
    
    

