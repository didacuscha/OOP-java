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
public class ServiceAlumnosFunciona {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Alumnos> crearAlumnos(){
        
        ArrayList<Alumnos> listaAlumnos = new ArrayList();
       
        boolean alfin = true;
        
        do {
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = scanner.next();
            Alumnos perroAlumno = new Alumnos();
            listaAlumnos.add(perroAlumno);
            perroAlumno.setNombre(nombre);
            
            ArrayList<Double> notas = new ArrayList();
            System.out.println("Ingrese la primera nota del alumno: ");
            double nota1 = scanner.nextDouble();
            notas.add(nota1);
            System.out.println("Ingrese la segunda nota del alumno: ");
            double nota2 = scanner.nextDouble();
            notas.add(nota2);
            System.out.println("Ingrese la tercera nota del alumno: ");
            double nota3 = scanner.nextDouble();
            notas.add(nota3);
            
            perroAlumno.setNotas(notas);
            
            System.out.println("Desea ingresar otro alumno?(si/no): ");
            String decision = scanner.next();
            if (decision.equalsIgnoreCase("si")) {
                alfin = true;
            } else {
                System.out.println("Ingreso de alumnos terminado, la lista de alumnos  y sus notas es la siguiente: ");
                for(Alumnos perritos : listaAlumnos) {
                    System.out.print(perritos.getNombre() + " ");
                    System.out.println(perritos.getNotas() + " ");
                }
                alfin = false;
            }
            
        } while (alfin == true);
        
        return listaAlumnos;
    }

    
     public void encontrarAlumno(ArrayList<Alumnos> alumnios){
        
        System.out.println("\nIngrese el alumno que desea buscar: ");
        String nombre = scanner.next();
        Iterator iterator = alumnios.iterator();
        double sum = 0;
        int count = 0;
        boolean found = false;
        
        while (iterator.hasNext()){
            Alumnos alumnio = (Alumnos) iterator.next();
            if (alumnio.getNombre().equals(nombre)) {
                
                ArrayList<Double> notas = alumnio.getNotas();
                for (double value : notas) {
                    sum += value;
                    count++;
                }
                
                double average = (double) sum/count;
                System.out.println("el promedio de " + alumnio.getNombre() + " es " + average);
                
                found = true;
                break;
            } 
        } 
        
        if (!found) {
            System.out.println("No se encontro el alumno: " + nombre);
        }
     }
}