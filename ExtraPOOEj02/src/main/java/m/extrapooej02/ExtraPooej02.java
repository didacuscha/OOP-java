/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.extrapooej02;

import Entity.Puntos;
import Service.ServicePuntos;

/**
 *
 * @author AndreaCardenasT
 */
public class ExtraPooej02 {
    
    public static void main(String[] args){
        
        ServicePuntos ps = new ServicePuntos();
        
        Puntos points = ps.crearPuntos();
        
        ps.calcularDistancia(points);
    }
}
