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
package ejercicio5.servicio;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

public class CuentaServicio {
    
    private final Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        
        System.out.println("Ingrese su numero de cuenta : ");
        int numeroCuenta = leer.nextInt();
        
        System.out.println("Ingrese su dni: ");
        long dni = leer.nextLong();
        
        Cuenta cuenta = new Cuenta();
        
        cuenta.setDni(dni);
        cuenta.setNumeroCuenta(numeroCuenta);
     
        return cuenta;
           
        }
    
    public long ingresarDinero(Cuenta cuenta){
        
       Long SaldoActual;
       Long deposito;
       
       do{
        System.out.println("Ingrese el importe a depositar: ");
        deposito = leer.nextLong();
        
        System.out.println("Usted ah depositado: "+deposito+"$ exitosamente!");
        
        SaldoActual = cuenta.getSaldoActual() + deposito;
        }while( deposito < 0);
        
        cuenta.setSaldoActual(SaldoActual);
        
        return SaldoActual;
        
    }
    
    public long retirarDinero(Cuenta cuenta){
        
        System.out.println("Ingrese el importe a retirar: ");
        Long retiro = leer.nextLong();
        
        
        if( retiro > cuenta.getSaldoActual()){
            System.out.println("Usted solo puede retirar: "+cuenta.getSaldoActual());
        }else{
            cuenta.setSaldoActual(cuenta.getSaldoActual()- retiro);
            System.out.println("Usted retiro :"+retiro);
            System.out.println("El saldo actual de su cuenta es: "+cuenta.getSaldoActual());
        }
        return retiro;  
    }
    
    public Long extraccionRapida( Cuenta cuenta){
        
        System.out.println("Ingrese el importe que desee retirar: ");
        Long extraRapida = leer.nextLong();
        
         cuenta.setSaldoActual(cuenta.getSaldoActual()*80 / 100);
         if( extraRapida > cuenta.getSaldoActual()){
             System.out.println("Extraccion no valida, solo puede retira el 20% de su saldo actual");
         }else{
             System.out.println("Su retiro de: "+extraRapida+" fue exitoso");
             System.out.println("Su saldo actual es: "+ cuenta.getSaldoActual());
         }
        
        return extraRapida; 
    }
    public void consultarSaldo(Cuenta cuenta){
        
        System.out.println("Su saldo actual es: "+cuenta.getSaldoActual());
        
    }
    
    public void consultarCuenta( Cuenta cuenta){
        System.out.println("Los Datos de su cuenta son: ");
        System.out.println("DNI: "+cuenta.getDni());
        System.out.println("Numero de cuenta: "+cuenta.getNumeroCuenta());
    }
}

