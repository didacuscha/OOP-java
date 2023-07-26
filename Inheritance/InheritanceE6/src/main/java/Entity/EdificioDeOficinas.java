/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
import Entity.Edificio;
/**
 *
 * @author AndreaCardenasT
 */
public class EdificioDeOficinas extends Edificio {
    
    private Integer numOficinas;
    private Integer numPersonasXOficina;
    private Integer numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer numOficinas, Integer numPersonasXOficina, Integer numPisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.numPersonasXOficina = numPersonasXOficina;
        this.numPisos = numPisos;
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public Integer getNumPersonasXOficina() {
        return numPersonasXOficina;
    }

    public void setNumPersonasXOficina(Integer numPersonasXOficina) {
        this.numPersonasXOficina = numPersonasXOficina;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(Integer numPisos) {
        this.numPisos = numPisos;
    }

    
    @Override
    public Double calcularSuperficie(){
        Double superficie = (this.largo * this.ancho) * numPisos;
        System.out.println("La superficie del edificio de oficinas es: " + superficie + " m2");
        return superficie;
    }
    
    @Override
    public Double calcularVolumen(){
        Double volumen = (this.largo * this.ancho * this.alto) * numPisos;
        System.out.println("El volumen del edificio de oficinas es:" + volumen + " m3");
        return volumen;
    }
    
    public void cantPersonas(){
        Integer cantidad = this.numPersonasXOficina * this.numPisos;
        System.out.println("La cantidad de total de personas que ingresaria en este edificio es: " + cantidad);
    }
}
