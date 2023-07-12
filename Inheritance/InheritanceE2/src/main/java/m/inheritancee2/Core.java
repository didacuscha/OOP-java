/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.inheritancee2;

import Entity.Electrodomestico;
import Entity.Lavadora;
import Entity.Televisor;
import Service.ElectrodomesticoService;
import Enumeraciones.Color;
import Enumeraciones.Consumo;
import java.util.ArrayList;

/**
 *
 * @author AndreaCardenasT
 */
public class Core {
    
    public static void main(String[] args){
        
        /* Para crear directamente un electrodomestico, no se implementa.
        ElectrodomesticoService service = new ElectrodomesticoService();
        Electrodomestico x = service.crearElectrodomestico();
        service.precioFinal(x);
        System.out.println(x);*/
        
        
        Lavadora l = new Lavadora();
        l = l.crearLavadora();
        l.calcularPrecioFinal();
        //System.out.println(l);
        
        System.out.println("-------------");
        
        Lavadora y = new Lavadora();
        y = y.crearLavadora();
        y.calcularPrecioFinal();
        //System.out.println(y);
        
        System.out.println("-------------");
        
        Televisor tele = new Televisor();
        tele = tele.crearTelevisor();
        tele.calcularPrecioFinal();
        //System.out.println(tele);
        
        System.out.println("-------------");
        
        Televisor tele2 = new Televisor();
        tele2 = tele2.crearTelevisor();
        tele2.calcularPrecioFinal();
        //System.out.println(tele2);
        
        System.out.println("---------------");
        
        ArrayList<Electrodomestico> electronics = new ArrayList();
        electronics.add(l);
        electronics.add(y);
        electronics.add(tele);
        electronics.add(tele2);
        
        double totalPrice = 0.0;
        for (Electrodomestico electrodomestico : electronics) {
            System.out.println(electrodomestico);
            totalPrice += electrodomestico.getPrecio();
        }

 
        System.out.println("Precio total de los electrodomesticos: " + totalPrice);
    }
}
