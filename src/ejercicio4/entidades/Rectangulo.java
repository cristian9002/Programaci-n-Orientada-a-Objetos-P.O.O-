// Crear una clase Rectángulo que modele rectángulos por medio de un atributo
// privado base y un atributo privado altura. La clase incluirá un método para crear el
// rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
// método para calcular la superficie del rectángulo y un método para calcular el
// perímetro del rectángulo. Por último, tendremos un método que dibujará el
// rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
// los métodos getters, setters y constructores correspondientes.
// Superficie = base * altura / Perímetro = (base + altura) * 2.
package ejercicio4.entidades;

import java.util.Scanner;

public class Rectangulo {
    
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public Double superficie(){
        return base * altura;
    }
    
    public Double perimetro(){
        return (base + altura) * 2;
    }
    
    public void dibujarRectangulo(){
        
        Double i;
        Double j;
        
    Scanner leer = new Scanner ( System.in);
    
        System.out.println("Ingrese la base del rectangulo: ");
        base = leer.nextDouble();
   
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = leer.nextDouble();
       
        for( i=0.0;i<base;i++){
            System.out.print("* ");
        }
        System.out.println("");
        for( i=1.0 ;i<altura-1;i++){
            for ( j=0.0;j<base;j++){
                if(j==0 || j==(base-1)){
                    System.out.print("*");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");    
        }
        for(i=0.0;i<base;i++){
            System.out.print("* ");
        }
        System.out.println("");
    }
   
    }
    

    

    




    
    

    
    

