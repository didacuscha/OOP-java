/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Raices;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ServiceRaices {
    
    Scanner scanner = new Scanner(System.in);
    
    public Raices crearNumeros(){     
        
        System.out.println("Ingrese la variable a: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese la variable b: ");
        int b = scanner.nextInt();
        System.out.println("Ingrese la variable c: ");
        int c = scanner.nextInt();
        
        return new Raices(a, b, c);
    }
    
    public double getDiscriminante(Raices numeros){ 
        double discriminante = ((Math.pow(numeros.getB(), 2)) - (4 * numeros.getA() * numeros.getC()));
        //System.out.println("la discriminante es: " + discriminante);
        return discriminante;
    }
    
    public boolean tieneRaices(Raices numeros){
        
        
        double discriminante = getDiscriminante(numeros);
        if (discriminante > 0) {
            System.out.println("Tiene dos soluciones");
            return true;
        } else {
            System.out.println("No tiene dos soluciones");
            return false;
        }
    }
    
    public boolean tieneRaiz(Raices numeros){
        
        double discriminante = getDiscriminante(numeros);
        if (discriminante == 0) {
            System.out.println("Tiene una unica solucion");
            return true;
        } else {
            System.out.println("Tiene mas de una solucion o no tiene solucion");
            return false;
        }
    }
    
    public double[] obtenerRaices(Raices numeros){
        
        double discriminante = getDiscriminante(numeros);
        double[] soluciones = new double[2];
        
        if (tieneRaices(numeros) == true) {
            soluciones[0] = (-numeros.getB() + Math.sqrt(discriminante)) / (2 * numeros.getA());
            soluciones[1] = (-numeros.getB() - Math.sqrt(discriminante)) / (2 * numeros.getA());
            System.out.println("solucion 1: " + soluciones[0]);
            System.out.println("Solucion 2: " + soluciones[1]);
            return soluciones;
        } else {
            System.out.println("Error, no se encontraron 2 soluciones para este set de numeros ");
            return null;
        }
        
    }
    
    public double obtenerRaiz(Raices numeros){
        double discriminante = getDiscriminante(numeros);
        if (discriminante == 0) {
            double solucion = -numeros.getB() / (2 * numeros.getA());
            System.out.println("La solución es: " + solucion);
            return solucion;
        } else{
            System.out.println("No tiene solucion unica");
            return 0.0;
        }
    }
    
    public void calcular(Raices numeros){
        double discriminante = getDiscriminante(numeros);
        boolean tiene2 = tieneRaices(numeros);
        boolean tiene1 = tieneRaiz(numeros);
        
        if (tiene2 && !tiene1) {
            obtenerRaices(numeros);
        } else if (tiene1 && !tiene2){
            obtenerRaiz(numeros);
        } else {
            System.out.println("No tiene solucion");
        }
        
    }
}
