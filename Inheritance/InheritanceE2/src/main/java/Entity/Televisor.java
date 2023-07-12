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
public class Televisor extends Electrodomestico{
    
    protected Integer tamanio;
    protected boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer tamanio, boolean sintonizador) {
        this.tamanio = tamanio;
        this.sintonizador = sintonizador;
    }

    public Televisor(Integer tamanio, boolean sintonizador, double precio, Color color, Consumo consumo, Integer peso) {
        super(precio, color, consumo, peso);
        this.tamanio = tamanio;
        this.sintonizador = sintonizador;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public Televisor crearTelevisor() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Televisor televisor = new Televisor();

        System.out.println("Ingrese el color del televisor: ");
        String colorString = scanner.next();
        Color color = Color.valueOf(colorString.toUpperCase());
        televisor.setColor(color);

        System.out.println("Ingrese el consumo del televisor: ");
        String input = scanner.next();
        Consumo consumo = Consumo.valueOf(input.toUpperCase());
        televisor.setConsumo(consumo);

        Integer precioInicial = 1000;
        televisor.setPrecio(precioInicial);

        System.out.println("Ingrese el peso del televisor: ");
        int peso = scanner.nextInt();
        televisor.setPeso(peso);

        System.out.println("Ingrese el tamanio del televisor: ");
        int tamanio = scanner.nextInt();
        televisor.setTamanio(tamanio);

        System.out.println("El televisor tiene sintonizador TDT incluido(si/no)?: ");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("si")) {
            televisor.setSintonizador(true);
        } else {
            televisor.setSintonizador(false);
        }

    return televisor;
    }
    
    public void calcularPrecioFinal() {
        
        ElectrodomesticoService service = new ElectrodomesticoService();
        service.precioFinal(this);
        
        if (sintonizador == true){
            setPrecio(getPrecio() + 500);
        }
        
        if (tamanio > 40) {
            setPrecio(getPrecio() * 1.3); 
        }
           
    }
    
    @Override
    public String toString() {
        return "Televisor{" +
                "precio=" + getPrecio() +
                ", color=" + getColor() +
                ", consumo=" + getConsumo() +
                ", peso=" + getPeso() +
                ", tamanio=" + tamanio +
                ", sintonizador=" + sintonizador +
                '}';
    }
}
