/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Objects;

/**
 *
 * @author AndreaCardenasT
 */
public class Pais {
    
    private String nombre;
    
    public Pais() {
        
    }
    
    public Pais(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    /** @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        return Objects.equals(this.nombre, other.nombre);
    } **/
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pais) {
            
            Pais pais = (Pais) obj;
            
            if (this.nombre.equalsIgnoreCase(pais.nombre)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    
    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }
    
    
}
