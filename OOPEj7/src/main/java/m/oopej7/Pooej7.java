/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.oopej7;

import Entity.Persona;
import Service.ServicePersona;

/**
 *
 * @author AndreaCardenasT
 */
public class Pooej7 {
    
    public static void main(String[] args){
        
        ServicePersona sp = new ServicePersona();
        
        
        Persona[] personas = new Persona[4];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = sp.crearPersona();
        }
        
        int imc = 0;
        int imcOk = 0;
        int imcBajo = 0;
        int imcObeso = 0;
        boolean aux = false;
        int mayores = 0;
        int menores = 0;
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].getNombre() + " " + personas[i].getEdad());
            imc = sp.calcularIMC(personas[i]);
            if (imc == -1){
                imcBajo++;
            } else if (imc == 0){
                imcOk++;
            } else if (imc == 1){
                imcObeso++;  
            }
            
            aux = sp.mayorDeEdad(personas[i]);
            if (aux == true) {
                mayores++;
            } else {
                menores++;
            }
        }
        
        int totalPeople = 4;
        double porcentajeImcOk = (imcOk / (double) totalPeople) * 100;
        double porcentajeImcBajo = (imcBajo / (double) totalPeople) * 100;
        double porcentajeImcObeso = (imcObeso / (double) totalPeople) * 100;
        double porcentajeMayores = (mayores / (double) totalPeople) * 100;
        double porcentajeMenores = (menores / (double) totalPeople) * 100;
        
        System.out.println("El porcentaje de personas con Imc adecuado en el rango es: " + porcentajeImcOk + "%");
        System.out.println("El porcentaje de personas con Imc bajo en el rango es: " + porcentajeImcBajo + "%");
        System.out.println("El porcentaje de personas con Imc obeso en el rango es: " + porcentajeImcObeso + "%");
        System.out.println("El porcentaje de personas mayores es: " + porcentajeMayores + "%");
        System.out.println("El porcentaje de personas menores es: " + porcentajeMenores + "%");
    }
}
