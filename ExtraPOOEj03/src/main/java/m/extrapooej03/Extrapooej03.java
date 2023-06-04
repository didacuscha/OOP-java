/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.extrapooej03;

import Entity.Raices;
import Service.ServiceRaices;

/**
 *
 * @author AndreaCardenasT
 */
public class Extrapooej03 {
    
    public static void main(String[] args){
        ServiceRaices sr = new ServiceRaices();
    
        Raices numeros = sr.crearNumeros();

        //sr.getDiscriminante(numeros);
        sr.calcular(numeros);
    
    }
    
}
