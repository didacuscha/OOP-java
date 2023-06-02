/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.util.Random;
import Entity.Arreglos;
import java.util.Arrays;

/**
 *
 * @author AndreaCardenasT
 */
public class ServiceArreglos {
    
    Random random = new Random();
    
    public Arreglos[] crearArreglos(){
        
        Arreglos[] arregloA = new Arreglos[50];
        
        for (int i = 0; i < 50; i++) {
            Arreglos arreglo = new Arreglos();
            arreglo.value = random.nextDouble() * 50;
            arregloA[i] = arreglo;
            System.out.println(arregloA[i].getValue());
        }
        
        System.out.println("---------------------");
        System.out.println("---------------------");
        
        Arrays.sort(arregloA, (a, b) -> Double.compare(b.getValue(), a.getValue()));
        
        Arreglos[] top10 = new Arreglos[10];
        
        for (int i = 0; i < 10; i++) {

                top10[i] = arregloA[i];
                System.out.println(top10[i].getValue());
                
        }
        
        System.out.println("---------------------");
        System.out.println("---------------------");
        
        Arreglos[] arregloB = new Arreglos[20];
        
        for (int i = 0; i < 20; i++) {
            if(i < 10){
                arregloB[i] = top10[i];
            } else {
                Arreglos arreglo = new Arreglos();
                arreglo.value = 0.5;
                arregloB[i] = arreglo;
            }
            System.out.println(arregloB[i].getValue());
        }
        
        return top10;
        
        
    }
    
    public Arreglos[] crearArregloB(){
        Arreglos[] arregloB = new Arreglos[20];
        
        for (int i = 0; i < 50; i++) {
            Arreglos arreglo = new Arreglos();
            arreglo.value = random.nextDouble() * 50;
            arregloB[i] = arreglo;
            System.out.println(arregloB[i].getValue());
        }
        
        return arregloA;
    }
}
