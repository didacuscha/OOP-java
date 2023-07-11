/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.colleccionese5;

import Entity.Pais;
import Service.ServicePais;
import Utilities.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author AndreaCardenasT
 */
public class E5 {
    
    public static void main(String[] args){
        
        ServicePais sp = new ServicePais();
        HashSet<Pais> paises = sp.insertarPaises();
        
        System.out.println("--------------------------------");
        ArrayList<Pais> paisesArray = new ArrayList(paises);
        
        Collections.sort(paisesArray, Comparadores.ordenarAlfAsc);
        
        for (Pais countries : paisesArray) {
           System.out.println(countries);
        } 
        
        System.out.println("-------------!!!--------------");
        
        sp.encontrarPais(paises);
        
    }
}
