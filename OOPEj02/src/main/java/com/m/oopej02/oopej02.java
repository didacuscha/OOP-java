/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m.oopej02;
import java.util.Scanner;
import Entidad.Circunferencia;
import Servicio.CircunferenciaService;
/**
 *
 * @author AndreaCardenasT
 */


public class oopej02 {
    
    public static void main(String[] args) {
        
        CircunferenciaService circService = new CircunferenciaService();
        Circunferencia randomCircunference = circService.crearCircunferencia();
        
        double area = circService.area(randomCircunference.getRadio());
        double perimeter = circService.perimeter(randomCircunference.getRadio());
        double radius = randomCircunference.getRadio();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
