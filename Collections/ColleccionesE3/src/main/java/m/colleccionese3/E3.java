/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.colleccionese3;

import Entity.Alumnos;
import ServiceAlumnos.ServiceAlumnos;
import ServiceAlumnos.ServiceAlumnosFunciona;
import java.util.ArrayList;

/**
 *
 * @author AndreaCardenasT
 */
public class E3 {
    
    public static void main(String[] args){
        
       
        ServiceAlumnosFunciona saf = new ServiceAlumnosFunciona();
        ArrayList<Alumnos> alumnios = saf.crearAlumnos();
        saf.encontrarAlumno(alumnios);
        
    }
}
