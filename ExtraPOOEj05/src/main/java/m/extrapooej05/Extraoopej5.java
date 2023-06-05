/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.extrapooej05;


import Entity.Mes;
import Service.ServiceMes;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class Extraoopej5 {
    
    
    public static void main(String[] args){
        Random random = new Random();

        int mesAleatorio = random.nextInt(12) + 1;
        
        ServiceMes sm = new ServiceMes();
        
        Mes mes = new Mes(mesAleatorio);
        
        sm.adivinar(mes.getMes());
        
    }
}
