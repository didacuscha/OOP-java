/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.time.LocalDate;

/**
 *
 * @author AndreaCardenasT
 */
public class Alquiler {
    
    private String nombre;
    private Integer docu;
    private LocalDate inicioAlquiler;
    private LocalDate finAlquier;
    private String posicion;
    private String barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer docu, LocalDate inicioAlquiler, LocalDate finAlquier, String posicion, String barco) {
        this.nombre = nombre;
        this.docu = docu;
        this.inicioAlquiler = inicioAlquiler;
        this.finAlquier = finAlquier;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocu() {
        return docu;
    }

    public void setDocu(Integer docu) {
        this.docu = docu;
    }

    public LocalDate getInicioAlquiler() {
        return inicioAlquiler;
    }

    public void setInicioAlquiler(LocalDate inicioAlquiler) {
        this.inicioAlquiler = inicioAlquiler;
    }

    public LocalDate getFinAlquier() {
        return finAlquier;
    }

    public void setFinAlquier(LocalDate finAlquier) {
        this.finAlquier = finAlquier;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getBarco() {
        return barco;
    }

    public void setBarco(String barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", docu=" + docu + ", inicioAlquiler=" + inicioAlquiler + ", finAlquier=" + finAlquier + ", posicion=" + posicion + ", barco=" + barco + '}';
    }
    
    public void calcularAlquiler(Barco barco, Integer duracion){
        double precioModulo = barco.precioFinal(barco);
        double precioAlquiler = (precioModulo * duracion);
        System.out.println("El precio total del alquiler para los " + duracion + " dias es de " + precioAlquiler);   
    }
}
