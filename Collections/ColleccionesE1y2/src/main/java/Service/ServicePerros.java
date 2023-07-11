/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ServicePerros {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Perros> crearLista(){
        
        ArrayList<Perros> listaPerros = new ArrayList();
       
        boolean alfin = true;
        
        do {
            System.out.println("Ingrese la raza del perro para guardarla en la lista: ");
            String raza = scanner.next();
            Perros perro = new Perros();
            listaPerros.add(perro);
            perro.setRaza(raza);
            
            System.out.println("Desea ingresar otro perro(si/no): ");
            String decision = scanner.next();
            if (decision.equalsIgnoreCase("si")) {
                alfin = true;
            } else {
                System.out.println("Ingreso de perros terminado, la lista de perros es la siguiente: ");
                for(Perros perrito : listaPerros) {
                    System.out.print(perrito.getRaza() + " ");
                }
                alfin = false;
            }
            
        } while (alfin == true);
        
        return listaPerros;
    }
    
    public ArrayList<Perros> encontrarPerrito(ArrayList<Perros> perros){
        
        System.out.println("\nIngrese el perro(por raza) que desea buscar: ");
        String raza = scanner.next();
        Iterator iterator = perros.iterator();
        
        while (iterator.hasNext()){
            Perros perro = (Perros) iterator.next();
            if (perro.getRaza().equals(raza)) {
                iterator.remove();
                System.out.println("Se removio el perro buscado");
            } 
        }
        
        for (Perros perro : perros) {
            System.out.println(perro + " ");
        }
        System.out.println();
        
        return perros;
    }
 
}
