/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.oopej09;
import java.util.Random;
import java.lang.Math;
import Entity.Matematica;

/**
 *
 * @author AndreaCardenasT
 */
public class Oopej9 {
    
    public static void main(String[] args){
        
        Random random = new Random();
        double var1 = random.nextDouble(10);
        double var2 = random.nextDouble(10);
        Matematica pares = new Matematica(var1, var2);
        devolverMayor(pares);
        calcularPotencia(pares);
        calculaRaiz(pares);
    }
    
    public static double devolverMayor(Matematica pares){
        if (pares.getNum1() > pares.getNum2()){
            System.out.println("el numero " + pares.getNum1() + " es mayor a " + pares.getNum2());
            return pares.getNum1();
        } else {
            System.out.println("el numero " + pares.getNum2() + " es mayor a " + pares.getNum1());
            return pares.getNum2();
        }
        
    }
    
    public static int calcularPotencia(Matematica pares){
        double base = Math.round(pares.getNum1());
        double elevado = Math.round(pares.getNum2());
        int exponent;
        if (pares.getNum1() > pares.getNum2()){
            exponent = (int) Math.pow(base, elevado);
            System.out.println("el numero " + base + " elevado a la  " + elevado + " es: " + exponent);
            return exponent;
        } else {
            exponent = (int) Math.pow(elevado, base);
            System.out.println("el numero " + elevado + " elevado a la  " + base + " es: " + exponent);
            return exponent;
        }  
    }
    
    public static double calculaRaiz(Matematica pares){
        int abs1 = (int) Math.abs(pares.getNum1());
        int abs2 = (int) Math.abs(pares.getNum2());
        double raiz;
        
        if (pares.getNum1() < pares.getNum2()){
            raiz = Math.sqrt(abs1);
            System.out.println("la raiz del numero " + abs1 + " es: " + raiz);
            return raiz;
        } else {
            raiz = Math.sqrt(abs2);
            System.out.println("la raiz del numero " + abs2 + " es: " + raiz);
            return raiz;
        }
    }
}
