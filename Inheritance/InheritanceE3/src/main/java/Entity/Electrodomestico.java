/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Enumerations.Color;
import Enumerations.Consumo;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class Electrodomestico {
    
    protected double precio;
    protected Color color;
    protected Consumo consumo;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, Color color, Consumo consumo, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public void comprobarConsumoEnergetico(Consumo consumation, Electrodomestico x){
         
        switch (consumation) {
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
    
    public void comprobarColor(Color coleur, Electrodomestico x){
       
        switch (coleur) {
            case NEGRO:
                x.setColor(Color.NEGRO);
                break;
            case ROJO:
                x.setColor(Color.ROJO);
                break;
            case AZUL:
                x.setColor(Color.AZUL);
                break;
            case GRIS:
                x.setColor(Color.GRIS);
                break;
            default:
                x.setColor(Color.BLANCO);
                break;
        }
    }
    
    public Electrodomestico crearElectrodomestico(){
        
        Electrodomestico x = new Electrodomestico();
        
        System.out.println("Ingrese el color del Electrodomestico: ");
        String colorString = scanner.next();
        Color coleur = Enumerations.Color.valueOf(colorString.toUpperCase());
        comprobarColor(coleur, x);
        
        
        System.out.println("Ingrese el consumo del Electrodomestico: ");
        scanner.nextLine();
        String input = scanner.nextLine();
        Consumo consumation = Enumerations.Consumo.valueOf(input.toUpperCase());
        x.setConsumo(consumation);
        
        Integer precioInicial = 1000;
        x.setPrecio(precioInicial);
        
        System.out.println("Ingrese el peso del Electrodomestico: ");
        Integer poids = scanner.nextInt();
        x.setPeso(poids);
        
        
        return x;
    }
    
    public void precioFinal(Electrodomestico x) {
        Integer pesoo = x.getPeso();
        if (pesoo != null) {
            if (pesoo >= 1 && pesoo <= 19) {
                x.setPrecio(x.getPrecio() + 100);
            } else if (pesoo >= 20 && pesoo <= 49) {
                x.setPrecio(x.getPrecio() + 500);
            } else if (pesoo >= 50 && pesoo <= 79) {
                x.setPrecio(x.getPrecio() + 800);
            } else {
                x.setPrecio(x.getPrecio() + 1000);
            }
        }
        
        Consumo consumoo = x.getConsumo();
        comprobarConsumoEnergetico(consumoo, x);
    }

    
    /*public void precioFinal(Electrodomestico x){
        
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
        
        comprobarConsumoEnergetico(x.getConsumo(), x);
    }*/
}