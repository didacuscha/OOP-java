/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.m.oopej3;
import Servicio.OperacionService;
import Entidad.Operacion;
/**
 *
 * @author AndreaCardenasT
 */
public class Oopej03 {
    
    public static void main(String[] args){
    
    OperacionService os = new OperacionService();
    Operacion ro = os.crearOperacion();
    
    double sum = os.sumar(ro.getNum1(), ro.getNum2());
    System.out.println(sum);
    double resta = os.restar(ro.getNum1(), ro.getNum2());
    System.out.println(resta);
    double multiplica = os.multi(ro.getNum1(), ro.getNum2());
    System.out.println(multiplica);
    double divide = os.divi(ro.getNum1(), ro.getNum2());
    System.out.println(divide);
   
 
   } 
}
