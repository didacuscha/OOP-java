/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.EstadoCivil;
import java.time.LocalDate;

/**
 *
 * @author TOSHIBA
 */

public class Empleados extends Persona {
    
    protected LocalDate anioIncorporacion;
    protected Integer numdespacho;

    public Empleados() {
    }

    public Empleados(LocalDate anioIncorporacion, Integer numdespacho) {
        this.anioIncorporacion = anioIncorporacion;
        this.numdespacho = numdespacho;
    }

    public Empleados(LocalDate anioIncorporacion, Integer numdespacho, String nombre, String apellido, Integer numDocumento, EstadoCivil estado) {
        super(nombre, apellido, numDocumento, estado);
        this.anioIncorporacion = anioIncorporacion;
        this.numdespacho = numdespacho;
    }

    public LocalDate getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(LocalDate anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public Integer getNumdespacho() {
        return numdespacho;
    }

    public void setNumdespacho(Integer numdespacho) {
        this.numdespacho = numdespacho;
    }

    @Override
    public String toString() {
        return "Empleados{" + "anioIncorporacion=" + anioIncorporacion + ", numdespacho=" + numdespacho + '}';
    }
    
    
    public void reasignacionDespacho(Empleados e){
        System.out.println("Ingrese el despacho");
        int aux = leer.nextInt();
        e.setNumdespacho(aux);
    }
    
}
