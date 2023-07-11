/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Entity.Pais;
import java.util.Comparator;

/**
 *
 * @author AndreaCardenasT
 */
public class Comparadores {
    
    public static Comparator<Pais> ordenarAlfAsc = new Comparator<Pais>(){
        @Override
        public int compare(Pais o1, Pais o2){
            
            return o1.getNombre().compareTo(o2.getNombre());
        }
    };
}
