/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class Polideportivo extends Edificio {
    
    private String nombre;
    private Boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, Boolean techado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return techado;
    }

    public void setTechado(Boolean techado) {
        this.techado = techado;
    }
    
    @Override
    public Double calcularSuperficie(){
        Double superficie = (this.largo * this.ancho);
        System.out.println("La superficie del Polideportivo es: " + superficie + " m2");
        return superficie;
    }
    
    @Override
    public Double calcularVolumen(){
        Double volumen = (this.largo * this.ancho * this.alto);
        System.out.println("El volumen del Polideportivo es:" + volumen + " m3");
        return volumen;
    }
    
    
}
