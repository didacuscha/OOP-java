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
public class Televisor extends Electrodomestico{
    
    protected Integer tamanio;
    protected boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer tamanio, boolean sintonizador) {
        this.tamanio = tamanio;
        this.sintonizador = sintonizador;
    }

    public Televisor(Integer tamanio, boolean sintonizador, double precio, String color, String consumo, Integer peso) {
        super(precio, Color.valueOf(color.toUpperCase()), Consumo.valueOf(consumo.toUpperCase()), peso);
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
    
    @Override
    public Electrodomestico crearElectrodomestico() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Televisor televisor = new Televisor();

        super.crearElectrodomestico();

        System.out.println("Ingrese el tamanio del televisor: ");
        int size = scanner.nextInt();
        televisor.setTamanio(size);

        System.out.println("El televisor tiene sintonizador TDT incluido(si/no)?: ");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("si")) {
            televisor.setSintonizador(true);
        } else {
            televisor.setSintonizador(false);
        }
        
        televisor.setColor(super.getColor());
        televisor.setConsumo(super.getConsumo());
        televisor.setPrecio(super.getPrecio());
        televisor.setPeso(super.getPeso());

    return televisor;
    }
    
    @Override
    public void precioFinal(Electrodomestico x) {
        
        super.precioFinal(x);
        
        if (sintonizador == true){
            x.setPrecio(getPrecio() + 500);
        }
        
        if (tamanio > 40) {
            x.setPrecio(getPrecio() * 1.3); 
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
