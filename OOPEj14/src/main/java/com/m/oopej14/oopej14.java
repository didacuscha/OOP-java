/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m.oopej14;

import Entidad.Moviles;
import Servicio.ServicioMovil;
/**
 *
 * @author AndreaCardenasT
 */
public class oopej14 {
    
    
    public static void main(String[] args){
        ServicioMovil sm = new ServicioMovil();
        Moviles m = sm.cargarCelular();
        sm.mostrarMovil(m);
    }
}
