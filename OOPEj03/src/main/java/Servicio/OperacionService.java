/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class OperacionService {
    
    public Operacion crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();
        
        Operacion x = new Operacion();
        x.setNum1(num1);
        x.setNum2(num2);
        
        return x;
    }
    
    public int sumar(int num1, int num2) {
        int suma = num1 + num2;
        return suma;
    }
    
    public int restar(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }
    
    public int multi(int num1, int num2) {
        int mult = 0;
        if (num1 == 0 || num2 == 0){
            System.out.println("Error, no es posible multiplicar por 0");
            return mult;
        } else {
            mult = num1 * num2;
        }
        return mult;
    }
    
    public int divi(int num1, int num2) {
        int div = 0;
        if (num1 == 0 || num2 == 0){
            System.out.println("Error, no es posible dividir por 0");
            return div;
        } else {
            div = num1 / num2;
        }
        return div;
    }
}
