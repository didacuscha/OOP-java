/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m.oopej01;

import Entidad.Persona;
import Servicio.PersonaService;

public class oopej01 {
    
    public static void main(String[] args){
          
        Persona primeraPersona = new Persona("Diego", 26, 1996);
        System.out.println(primeraPersona.name);
       
    
        Persona segundaPersona = new Persona("Bubu", 26, 1997);
        
        segundaPersona.setName("changedName");
        //System.out.println(segundaPersona.toString());
        segundaPersona.setAge(27);
        
        //System.out.println(segundaPersona.getName());
        //System.out.println(segundaPersona.getAge());
        
        PersonaService persServicio = new PersonaService();
        Persona terceraPersona = persServicio.crearPersona();
        System.out.println(primeraPersona.toString());
        System.out.println(segundaPersona.toString());
        System.out.println(terceraPersona.toString());
    }
}
 