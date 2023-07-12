/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Electrodomestico;
import Enumeraciones.Color;
import Enumeraciones.Consumo;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ElectrodomesticoService {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public void comprobarConsumoEnergetico(Consumo consumo, Electrodomestico x){
             
        switch (consumo) {
            case A:
                x.setPrecio(x.getPrecio()+ 1000);
                break;
            case B:
                x.setPrecio(x.getPrecio()+ 800);
                break;
            case C:
                x.setPrecio(x.getPrecio()+ 600);
                break;
            case D:
                x.setPrecio(x.getPrecio()+ 500);
                break;
            case E:
                x.setPrecio(x.getPrecio()+ 300);
                break;
            default:
                x.setPrecio(x.getPrecio()+ 100);
                break;
        }       
    }
    
    public void comprobarColor(Color color, Electrodomestico x){
        
        switch (color) {
            case NEGRO:
                x.setColor(Color.NEGRO);
                break;
            case ROJO:
                x.setColor(Color.ROJO);
                break;
            case AZUL:
                x.setColor(Color.AZUL);;
                break;
            case GRIS:
                x.setColor(Color.GRIS);
                break;
            default:
                x.setColor(Color.BLANCO);;
                break;
        }
    }
    
    public Electrodomestico crearElectrodomestico(){
        
        Electrodomestico x = new Electrodomestico();
        ElectrodomesticoService service = new ElectrodomesticoService();
        
        System.out.println("Ingrese el color del Electrodomestico: ");
        String colorString = scanner.next();
        Color color = Enumeraciones.Color.valueOf(colorString.toUpperCase());
        service.comprobarColor(color, x);
        
        
        System.out.println("Ingrese el consumo del Electrodomestico: ");
        scanner.nextLine();
        String input = scanner.nextLine();
        Consumo consumo = Enumeraciones.Consumo.valueOf(input.toUpperCase());
        x.setConsumo(consumo);
        
        Integer precioInicial = 1000;
        x.setPrecio(precioInicial);
        
        System.out.println("Ingrese el peso del Electrodomestico: ");
        Integer peso = scanner.nextInt();
        x.setPeso(peso);
        
        
        return x;
    }
    
    public void precioFinal(Electrodomestico x){
        
        ElectrodomesticoService service = new ElectrodomesticoService();
        
        x.getPeso();
        if (x.getPeso() >= 1 && x.getPeso()  <= 19) {
            x.setPrecio(x.getPrecio() + 100);
        } else if (x.getPeso() >= 20 && x.getPeso()  <= 49) {
            x.setPrecio(x.getPrecio() + 500);
        } else if (x.getPeso() >= 50 && x.getPeso()  <= 79) {
            x.setPrecio(x.getPrecio() + 800);
        } else {
            x.setPrecio(x.getPrecio() + 1000);
        }
        
        service.comprobarConsumoEnergetico(x.getConsumo(), x);
    }
}
