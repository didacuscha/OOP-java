/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.EstadoCivil;

/**
 *
 * @author TOSHIBA
 */
public class Estudiantes extends Persona {
    
    protected String curso;

    public Estudiantes() {
    }

    public Estudiantes(String curso) {
        this.curso = curso;
    }

    public Estudiantes(String curso, String nombre, String apellido, int numDocumento, EstadoCivil estado) {
        super(nombre, apellido, numDocumento, estado);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "curso=" + curso + '}';
    }
    
    public void cambiarCurso(Estudiantes es){
        System.out.println("Ingrese el Curso");
        String aux = leer.next();
        es.setCurso(aux);
    }
    
}
