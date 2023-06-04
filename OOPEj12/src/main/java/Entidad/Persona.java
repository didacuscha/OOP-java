
package Entidad;

import java.util.Date;


public class Persona {
    //atributos
    private String nombre;
    private Date fechaNacimiento;
    
    //constructor por defecto o vacio

    public Persona() {
    }
    
    //getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}