/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.Departamento;
import enumeraciones.EstadoCivil;
import java.time.LocalDate;

/**
 *
 * @author TOSHIBA
 */
public class Profesores extends Empleados {
    
    protected Departamento depto;

    public Profesores() {
    }

    public Profesores(Departamento depto) {
        this.depto = depto;
    }

    public Profesores(Departamento depto, LocalDate anioIncorporacion, Integer numdespacho) {
        super(anioIncorporacion, numdespacho);
        this.depto = depto;
    }

    public Profesores(Departamento depto, LocalDate anioIncorporacion, Integer numdespacho, String nombre, String apellido, Integer numDocumento, EstadoCivil estado) {
        super(anioIncorporacion, numdespacho, nombre, apellido, numDocumento, estado);
        this.depto = depto;
    }

    public Departamento getDepto() {
        return depto;
    }

    public void setDepto(Departamento depto) {
        this.depto = depto;
    }

    @Override
    public String toString() {
        return "Profesores{" + "depto=" + depto + '}';
    }
    
    
    public void reasignacionDepto(Profesores p){
        System.out.println("Ingrese el Departamento");
        String aux = leer.next();
        Departamento dep = enumeraciones.Departamento.valueOf(aux.toUpperCase());        
        switch (dep) {
            case ARQUITECTURA:
                p.setDepto(Departamento.ARQUITECTURA);
                break;
                case LENGUAJES:
                p.setDepto(Departamento.LENGUAJES);
                break;
                case MATEMATICAS:
                p.setDepto(Departamento.MATEMATICAS);
                break;
                case SISTEMAS:
                p.setDepto(Departamento.SISTEMAS);
                break;
        }
    }
}
