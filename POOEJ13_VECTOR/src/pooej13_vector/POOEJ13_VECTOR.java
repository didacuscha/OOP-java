/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej13_vector;

import Entidad.Cursos;
import ServicioCurso.ServicioCurso;

/**
 *
 * @author erika
 */
public class POOEJ13_VECTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioCurso sc = new ServicioCurso();
        Cursos c = sc.crearCurso();
        sc.calcularGananciaSemanal(c);
        
        
    }
    
}
