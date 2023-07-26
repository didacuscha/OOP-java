/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.EstadoCivil;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Persona {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String nombre,apellido;
    protected Integer numDocumento;
    protected EstadoCivil estado;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer numDocumento, EstadoCivil estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDocumento = numDocumento;
        this.estado = estado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(Integer numDocumento) {
        this.numDocumento = numDocumento;
    }

    public EstadoCivil getEstado() {
        return estado;
    }

    public void setEstado(EstadoCivil estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", numDocumento=" + numDocumento + ", estado=" + estado + '}';
    }
    
    public void cambiarEstado(Persona p){
        System.out.println("Ingrese el estado civil");
        String aux = leer.next();
        EstadoCivil estado = enumeraciones.EstadoCivil.valueOf(aux.toUpperCase());
        switch (estado){
            case CASADO:
                p.setEstado(EstadoCivil.CASADO);
                break;
                case DIVORCIADO:
                p.setEstado(EstadoCivil.DIVORCIADO);
                break;
                case SOLTERO:
                p.setEstado(EstadoCivil.SOLTERO);
                break;
        }
    }
    
}
