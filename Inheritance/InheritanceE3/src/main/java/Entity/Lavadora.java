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
public class Lavadora extends Electrodomestico {
    
    protected Integer carga;

    public Lavadora() {
    }
    
    public Lavadora(double precio, String color, String consumo, Integer peso, Integer carga) {
    super(precio, Color.valueOf(color.toUpperCase()), Consumo.valueOf(consumo.toUpperCase()), peso);
    this.carga = carga;
    }


    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    @Override
    public Electrodomestico crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Lavadora lavadora = new Lavadora();
        
        super.crearElectrodomestico();

        System.out.println("Ingrese la carga de la Lavadora: ");
        int capacity = scanner.nextInt();
        lavadora.setCarga(capacity);
        
        lavadora.setColor(super.getColor());
        lavadora.setConsumo(super.getConsumo());
        lavadora.setPrecio(super.getPrecio());
        lavadora.setPeso(super.getPeso());

        return lavadora;
    }
    

    @Override
    public void precioFinal(Electrodomestico x) {
        
        super.precioFinal(x);
        if (this.carga > 30) {
            x.setPrecio(getPrecio() + 500); 
        }
    }
    
    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + getPrecio() +
                ", color=" + getColor() +
                ", consumo=" + getConsumo() +
                ", peso=" + getPeso() +
                ", carga=" + carga +
                '}';
    }
}