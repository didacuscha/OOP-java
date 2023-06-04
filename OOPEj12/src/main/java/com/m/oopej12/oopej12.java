/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m.oopej12;


import Entidad.Persona;
import ServicioPersona.ServicioPersona;


public class oopej12 {


    public static void main(String[] args) {
        int edad;
        
        // primero el servicio
        ServicioPersona sp = new ServicioPersona();
        //objeto
        Persona p = sp.crearPersona();
        edad = sp.calcularEdad(p);
        sp.menorQue(p, edad);
        sp.mostrarPersona(p);
        
    }
    
}
