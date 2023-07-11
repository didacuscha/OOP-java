/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author AndreaCardenasT
 */
public class ServicePais {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public HashSet<Pais> insertarPaises(){
        
        HashSet<Pais> paises = new HashSet();
        boolean sigue = true;
        
        do {
            System.out.println("Ingrese el nombre de un pais: ");
            String nombre = scanner.next();
            Pais pais = new Pais(nombre);
            paises.add(pais);
            
            System.out.println("Desea ingresar otro pais? (si/no)");
            String respuesta = scanner.next();
            
            if (respuesta.equalsIgnoreCase("si")) {
                sigue = true;
            } else {
                System.out.println("Ingreso de paises terminado, la lista es la siguiente: ");
                for (Pais countries : paises) {
                    System.out.println(countries + " ");
                }
                
                sigue = false;  
            }
            
        } while (sigue == true);
        
        return paises;
       
    }
    
    public HashSet<Pais> encontrarPais(HashSet<Pais> paises){
        
        System.out.println("\nIngrese el nombre del pais que desea buscar: ");
        String pais = scanner.next();
        Iterator iterator = paises.iterator();
        boolean encontrado = false;
        
        while (iterator.hasNext()){
            Pais country = (Pais) iterator.next();
            if (country.getNombre().equals(pais)) {
                iterator.remove();
                System.out.println("Se removio el pais buscado");
                encontrado = true;
            } 
        }
        
        if (!encontrado) {
            System.out.println("El pais buscado " + pais + " no se encuentra en este conjunto");
        }
        
        for (Pais pays : paises) {
            System.out.println(pays + " ");
        }
        System.out.println();
        
        return paises;
    }
}
