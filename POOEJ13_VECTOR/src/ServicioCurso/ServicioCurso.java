/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCurso;

import Entidad.Cursos;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class ServicioCurso {
    
    Scanner scanner = new Scanner(System.in);
    public String[] cargarAlumnos(){
        
        String[] array = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese el nombre del alumno");
            array[i] = scanner.nextLine();
        }
        
        return array;
    }
    
    public Cursos crearCurso(){
        
        Cursos c = new Cursos();
        System.out.println("Ingrese el nombre del curso: ");
        c.setNombreCurso(scanner.nextLine());
        System.out.println("los alumnos del curso: ");
        String[] vAlumnos = new String[5];
        vAlumnos = cargarAlumnos();
        c.setAlumnos(vAlumnos);
        System.out.println("Ingrese el turno tarde/mañana");
        c.setTurno(scanner.nextLine());
        System.out.println("ingrese la cantidad de dias por semana que dicta el curso:");
        c.setCantidadDiasPorSemana(scanner.nextInt());
        System.out.println("ingrese la cantidad de horas por dia que dicta el curso:");
        c.setCantidadHorasPorDia(scanner.nextInt());
        System.out.println("Ingrese el precio por hora del curso:");
        c.setPrecioPorHora(scanner.nextInt());
        return c;  
    }
    
    public void calcularGananciaSemanal(Cursos c){
        System.out.println("La ganancia semanal es " + (c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getAlumnos().length * c.getCantidadDiasPorSemana()));
    }
}
