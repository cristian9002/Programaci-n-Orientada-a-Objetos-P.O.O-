// // Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
//atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
//operaciones asociadas a dicha clase son:
//• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//• Agregar los métodos getters y setters correspondientes
//• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
//ingresar y se la sumara a saldo actual.
//• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
//se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
//pondrá el saldo actual en 0.
//• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
//que el usuario no saque más del 20%.
//• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
package ejercicio5.principal;

import ejercicio5.entidades.Cuenta;
import ejercicio5.servicio.CuentaServicio;
import java.util.Scanner;

public class Cuenta1 {
    

    public static void main(String[] args) {
        
        Scanner imput = new Scanner(System.in);
        
        CuentaServicio cuentaServicio = new CuentaServicio();
        
        Cuenta cuenta = cuentaServicio.crearCuenta();
        int opcion;
        
        do{
            System.out.println("____________________________________"); 
        System.out.println("Ingrese la opcion que desee realizar:" );
        System.out.println("1. Depositar");   
        System.out.println("2. Retirar");
        System.out.println("3. Extraccion Rapida");
        System.out.println("4. Consultar Saldo");
        System.out.println("5. Consultar Datos de la Cuenta");
        System.out.println("6. Salir");
            System.out.println("_____________________________________");
        
        opcion = imput.nextInt();
        
        switch(opcion){
            
            case 1:
                cuentaServicio.ingresarDinero(cuenta);
            break;
            
            case 2:
                cuentaServicio.retirarDinero(cuenta);
            break;
            
            case 3:
                cuentaServicio.extraccionRapida(cuenta);
            break;
                
            case 4:
                cuentaServicio.consultarSaldo(cuenta);
            break;
            
            case 5:
                cuentaServicio.consultarCuenta(cuenta);
            break;
            
            case 6:
                System.out.println("Muchas gracias por utilizar nuestros servicios");
            break;
           
            default: 
                System.out.println("Opcion Incorrecta");  
        }
        } while(opcion != 6);
    }
}

        


                
        
        
        
       
        
        
        
        

