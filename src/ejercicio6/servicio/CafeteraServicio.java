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
package ejercicio6.servicio;

import ejercicio6.entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
    
    Scanner leer = new Scanner( System.in);
    
    public  Cafetera llenarCafetera(){
        
        float cantidadActual;
          
        System.out.println("Ingrese la capacidad de la cafetera : ");
        float capacidadMaxima = leer.nextFloat();
        
        cantidadActual = capacidadMaxima;
        
        Cafetera cafetera = new Cafetera();
        
        cafetera.setCantidadActual(cantidadActual);
        cafetera.setCapacidadMaxima(capacidadMaxima);
        
        return cafetera;
         
    }
    
    public float servirTaza(Cafetera cafetera){
        
        System.out.println("Ingrese el tamaño de la taza a servir : ");
        float taza = leer.nextFloat();
        
       if(taza > cafetera.getCantidadActual()){
           System.out.println("La taza solo se lleno hasta :"+cafetera.getCantidadActual());
           cafetera.setCantidadActual(0);
          
       }else{
       if( taza < cafetera.getCantidadActual()){
           
           System.out.println("La taza esta llena"); 
           cafetera.setCantidadActual(cafetera.getCantidadActual()-taza);
           System.out.println("solo queda "+cafetera.getCantidadActual()+" de cafe");
           
       }else{
           
           System.out.println("No hay mas cafe");
       }
       }
        return taza;
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        
        cafetera.setCantidadActual(0);
        System.out.println("la cafetera esta vacia");
        
    }
    
    public void agregarCafe( Cafetera cafetera){
        
        int cafe;
        
        
        System.out.println("Ingrese la cantidad de cafe que desea añadir a la cafetera: ");
        cafe = leer.nextInt();
        
        float cafLlena = cafe + cafetera.getCantidadActual();
        
        System.out.println("La cantidad nueva de cafe es: "+cafLlena);
        
    }
}
         
    

