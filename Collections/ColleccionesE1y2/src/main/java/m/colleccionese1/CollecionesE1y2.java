/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.colleccionese1;

import Entity.Perros;
import Service.ServicePerros;
import java.util.ArrayList;

/**
 *
 * @author AndreaCardenasT
 */
public class CollecionesE1y2 {
    
    public static void main(String[] args){
        
        ServicePerros sp = new ServicePerros();
        
        ArrayList<Perros> perritos = sp.crearLista();
        
        sp.encontrarPerrito(perritos);
    }
}
