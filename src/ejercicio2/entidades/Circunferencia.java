//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
//de tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
//del objeto.
//d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
//e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
package ejercicio2.entidades;

import java.util.Scanner;


public class Circunferencia {
    
    // atributos
    
    private Double radio;
    
    // constructor
    
    public Circunferencia(Double radio) {
        this.radio = radio;  
    }    
    // getter
    
    public Double getRadio() {
        return radio;
    }
    // setter
    
    public void setRadio(Double radio) {
        this.radio = radio;
    }
    // metodo para crear circunferencia
    
    public void crearCircunferencia(){
       
        Scanner rad = new Scanner( System.in);
        System.out.println("Ingrese el radio: ");
        radio = rad.nextDouble();
        System.out.println("El radio es: "+radio);
    }
        
    // metodo para calcular el area:
    
        public Double crearArea(){   
            return 3.14 * radio;   
    }
    // metodo para calcular el perimetro:
        
        public Double perimetro(){
           return 2 *3.14 * radio;
}
    }
  
    

    
    
    

