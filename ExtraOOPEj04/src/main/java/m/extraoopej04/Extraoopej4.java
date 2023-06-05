/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.extraoopej04;

import Entity.DNI;
import Service.ServiceDNI;

/**
 *
 * @author Diego Charry
 */
public class Extraoopej4 {
    
    public static void main(String[] args){
        
        ServiceDNI sd = new ServiceDNI();
        
        DNI dni = sd.crearNif();
        
        
    }
    
}
