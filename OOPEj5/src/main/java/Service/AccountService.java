/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Entity.Account;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class AccountService {
    Scanner scanner = new Scanner(System.in);
    
    public Account createAccount(){
        System.out.println("Bienvenido a bitbank, tu banco donde podras manejar todos los servicios que ofrece un banco tradicional ademas de acceso a guardar tus criptomonedas.");
        System.out.println("Primero debemos abrir una cuenta, cual es tu DNI? ");
        int DNI = scanner.nextInt();
        System.out.println("Cuanto deseas depositar inicialmente?");
        int balance = scanner.nextInt();
        System.out.println("Excelente, ya tienes una cuenta con bitbank");
        int accountNo = 60015351;

        return new Account(DNI, balance, accountNo);
    }
    
    public int depositar(Account cuenta){
        System.out.println("Ingrese la cantidad a depositar: ");
        int deposito = scanner.nextInt();
        cuenta.setBalance(deposito + cuenta.getBalance());
        return deposito;
    }
    
    public int retirar(Account cuenta){
        System.out.println("Ingrese la cantidad a retirar: ");
        int retiro = scanner.nextInt();
        
        if (retiro < cuenta.getBalance()){
            cuenta.setBalance(cuenta.getBalance() - retiro);
            System.out.println("retiro exitoso");
        } else {
            System.out.println("Cantidad insuficiente en la cuenta para retirar.");
        }
        return retiro;
    } 
    
    public void extraccionRapida(Account cuenta){
        System.out.println("Ingrese el valor a retirar rapido, recuerde que esta opcion rapida tiene un tope del 20% saldo de su cuenta");
        int rapido = scanner.nextInt();
        if (rapido < (cuenta.getBalance() * 0.8)){
            cuenta.setBalance(cuenta.getBalance() - rapido);
            System.out.println("retiro rapido exitoso");
        } else {
            System.out.println("Operacion fracasada, El monto ingresado supera el limite del 20%");
        }
        
    }
    
    public void consultarSaldo(Account cuenta){
        System.out.println(cuenta.getBalance());
    }
    
    public void consultarDatos(Account cuenta){
        System.out.println("cuenta numero: " + cuenta.getAccountNo());
        System.out.println("cuenta pertenece al DNI: " + cuenta.getDNI());
        System.out.println("El balance de la cuenta es: " + cuenta.getBalance());
        
    }
}
