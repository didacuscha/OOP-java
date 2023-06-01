/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.pooej06;
import Entity.Nespresso;
import Service.ServiceNespresso;

/**
 *
 * @author AndreaCardenasT
 */
public class Pooej6 {
    
    public static void main(String[] args){
        
        ServiceNespresso service = new ServiceNespresso();
        Nespresso machine1 = service.crearCafetera();
        
        System.out.println("Felicitaciones por su nueva maquina nespresso");
        service.servirTaza(machine1);
        
        service.agregarCafe(machine1);
        service.servirTaza(machine1);
        service.servirTaza(machine1);
    }
}
