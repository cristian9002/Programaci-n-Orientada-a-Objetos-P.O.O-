//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
//Autor, Número de páginas, y un constructor con todos los atributos pasados por
//parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
//datos al usuario y luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el numero de páginas.


package ejercicio1.entidades;

import java.util.Scanner;

public class Libro {
    // Atributos
    public int isbn;
    public String titulo;
    public String autor;
    public int paginas;
    
    // constructor vacio
    public Libro() {
        
    }
    // constructor con parametros
    public Libro(int isbn,String titulo, String autor, int paginas){
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
        // metodo para tomar datos del libro:
    public void tomaDato (){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el titulo del libro ");
        titulo = leer.nextLine();
        
        System.out.println("Ingrese el autor del libro ");
        autor = leer.nextLine();
         
        System.out.println("Ingrese el isbn del libro ");
        isbn = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de paginas del libro ");
        paginas = leer.nextInt();
    }
// metodo toString
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + '}';
    }
    }



      


    


