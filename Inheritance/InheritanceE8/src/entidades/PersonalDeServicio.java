/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.EstadoCivil;
import enumeraciones.Seccion;
import java.time.LocalDate;

/**
 *
 * @author TOSHIBA
 */
public class PersonalDeServicio extends Empleados {
    
    protected Seccion sec;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(Seccion sec) {
        this.sec = sec;
    }

    public PersonalDeServicio(Seccion sec, LocalDate anioIncorporacion, Integer numdespacho) {
        super(anioIncorporacion, numdespacho);
        this.sec = sec;
    }

    public PersonalDeServicio(Seccion sec, LocalDate anioIncorporacion, Integer numdespacho, String nombre, String apellido, Integer numDocumento, EstadoCivil estado) {
        super(anioIncorporacion, numdespacho, nombre, apellido, numDocumento, estado);
        this.sec = sec;
    }

    public Seccion getSec() {
        return sec;
    }

    public void setSec(Seccion sec) {
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" + "sec=" + sec + '}';
    }
    
    
        public void reasignacionSeccion(PersonalDeServicio ps){
        System.out.println("Ingrese la seccion");
        String aux = leer.next();
        Seccion secc = enumeraciones.Seccion.valueOf(aux.toUpperCase());
        switch (secc) {
            case BIBLIOTECA:
                ps.setSec(Seccion.BIBLIOTECA);
                break;
                case DECANATO:
                ps.setSec(Seccion.DECANATO);
                break;
                case SECRETARIA:
                ps.setSec(Seccion.SECRETARIA);
                break;
        }
    }
    
}
