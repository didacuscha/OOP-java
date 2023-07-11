/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceAlumnos;

import Entity.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ServiceAlumnos {

    Scanner leer = new Scanner(System.in);

    ArrayList<Double> notas = new ArrayList();
    ArrayList<Alumnos> grupo = new ArrayList();
    Iterator <Alumnos>ite = grupo.iterator();

    public Alumnos crearAlumno() {
        Alumnos al = new Alumnos();

        System.out.println("ingrese el nombre del alumno: ");
        al.setNombre(leer.next());

        for (int i = 1; i < 4; i++) {
            System.out.println("ingrese la nota " + i + ": ");
            notas.add(leer.nextDouble());

        }
        
        al.setNotas(notas);
        return al;
    }

    public ArrayList<Alumnos> agregarAlumno() {
        String saux;
        boolean baux = true;
        do {
            System.out.println("desea agregar otro alumno?");
            saux = leer.next();
            if (!saux.equals("no")) {
                grupo.add(crearAlumno());

            } else {
                baux = false;
            }

        } while (baux);

        return grupo;
    }

    public double notaFinal(ArrayList<Alumnos> grupo) {
      
        System.out.println("que alumno quiere revisar");
        String valu = leer.next();
        double sumaTotal = 0;
        boolean auxBoolean = true;
       // while(ite.hasNext()&&(auxBoolean)){

       for (Alumnos alumno : grupo){
           if (alumno.getNombre().equals(valu)){
               System.out.println("hola");
               ArrayList<Double> prueba = new ArrayList();
               
                  
             for (Double nota : prueba) {
                  sumaTotal += nota;
                  System.out.println("chau");
             
           }
             
       }
                   
    }
        return sumaTotal/3;
    }
}
