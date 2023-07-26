/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.inheritancee3;

import Entity.Electrodomestico;
import Entity.Lavadora;
import Entity.Televisor;
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
        
        
        Lavadora l = new Lavadora(1000, "azul", "a", 70, 50);
        //l.crearElectrodomestico();
        //l.precioFinal(l);
        //System.out.println(l);
        
        //System.out.println("-------------");
        
        Lavadora y = new Lavadora(1000, "rojo", "b", 70, 20);
        //y.crearElectrodomestico();
        //y.calcularPrecioFinal();
        //System.out.println(y);
        
        //System.out.println("-------------");
        
        Televisor tele = new Televisor(50, true, 1000, "gris", "a", 90);
        //tele.crearElectrodomestico();
        //tele.calcularPrecioFinal();
        //System.out.println(tele);
        
        //System.out.println("-------------");
        
        Televisor tele2 = new Televisor(60, false, 1000, "negro", "a", 90);
        //tele2.crearElectrodomestico();
        //PrecioFinal(tele2);
        //System.out.println(tele2);
        
        //System.out.println("---------------");
        
        ArrayList<Electrodomestico> electronics = new ArrayList();
        electronics.add(l);
        electronics.add(y);
        electronics.add(tele);
        electronics.add(tele2);
        
        double totalPrice = 0.0;
        for (Electrodomestico electrodomestico : electronics) {
            electrodomestico.precioFinal(electrodomestico);
            System.out.println(electrodomestico);
            totalPrice += electrodomestico.getPrecio();
        }

 
        System.out.println("Precio total de los electrodomesticos: " + totalPrice);
    }
}

