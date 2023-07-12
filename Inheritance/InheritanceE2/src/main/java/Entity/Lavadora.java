/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import Enumeraciones.Color;
import Enumeraciones.Consumo;
import Service.ElectrodomesticoService;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class Lavadora extends Electrodomestico {
    
    protected Integer carga;

    public Lavadora() {
    }
    
    public Lavadora(double precio, Color color, Consumo consumo, Integer peso, Integer carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    public Lavadora crearLavadora() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Lavadora lavadora = new Lavadora();

        System.out.println("Ingrese el color de la lavadora: ");
        String colorString = scanner.next();
        Color color = Color.valueOf(colorString.toUpperCase());
        lavadora.setColor(color);

        System.out.println("Ingrese el consumo de la lavadora: ");
        String input = scanner.next();
        Consumo consumo = Consumo.valueOf(input.toUpperCase());
        lavadora.setConsumo(consumo);

        Integer precioInicial = 1000;
        lavadora.setPrecio(precioInicial);

        System.out.println("Ingrese el peso de la lavadora: ");
        int peso = scanner.nextInt();
        lavadora.setPeso(peso);

        System.out.println("Ingrese la carga de la Lavadora: ");
        int carga = scanner.nextInt();
        lavadora.setCarga(carga);

        return lavadora;
    }

    
    public void calcularPrecioFinal() {
        
        ElectrodomesticoService service = new ElectrodomesticoService();
        service.precioFinal(this);

        
        if (carga > 30) {
            setPrecio(getPrecio() + 500); 
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
