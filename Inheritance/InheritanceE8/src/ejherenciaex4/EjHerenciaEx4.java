/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejherenciaex4;

import entidades.Empleados;
import entidades.Estudiantes;
import entidades.Persona;
import entidades.PersonalDeServicio;
import entidades.Profesores;
import enumeraciones.Departamento;
import enumeraciones.EstadoCivil;
import enumeraciones.Seccion;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class EjHerenciaEx4 {

    /**
     * @param args the command line arguments
     */
    /*
Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
    */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        boolean aux2=true;
        do {
            System.out.println("****MENU*****");
        System.out.println("1. cambiar de estado civil a una persona");
        System.out.println("2. reasigrnar despacho a un empleado");
        System.out.println("3. matricular estudiante en un nuevo curso");
        System.out.println("4. cambio de departamento de un profesor.");
        System.out.println("5. traslado de sección de un empleado del personal de servicio.");
        System.out.println("6. SALIR ");
        byte aux = leer.nextByte();
            switch (aux) {
            case 1:
                Persona p = new Persona("diego","charry",13203132,EstadoCivil.SOLTERO);
                System.out.println(p);
                p.cambiarEstado(p);
                System.out.println(p);
                break;
            case 2: 
                LocalDate fechaIncorp = LocalDate.of(2020, 7, 2);
                Empleados e = new Empleados(fechaIncorp,10);
                System.out.println(e);
                e.reasignacionDespacho(e);
                break;
            case 3:
                Estudiantes es = new Estudiantes("11-A");
                System.out.println(es);
                es.cambiarCurso(es);
                System.out.println(es);
                break;
            case 4:
                Profesores pro = new Profesores(Departamento.MATEMATICAS);
                System.out.println(pro);
                pro.reasignacionDepto(pro);
                System.out.println(pro);
                break;
            case 5:
                PersonalDeServicio ps = new PersonalDeServicio(Seccion.SECRETARIA);
                System.out.println(ps);
                ps.reasignacionSeccion(ps);
                System.out.println(ps);
                break;
            case 6:
                aux2=false;
        }
        } while (aux2);
        
        
    }
    
}
