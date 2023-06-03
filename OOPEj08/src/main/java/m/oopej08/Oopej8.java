/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.oopej08;

import Entity.Cadena;
import Service.ServiceCadena;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class Oopej8 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una frase, puede ser una palabra o frase: ");
        String frase = scanner.nextLine();
        
        Cadena cadena = new Cadena(frase);
        //cadena.setFrase(frase);
        //cadena.setLongitud(frase.length());
        
        //System.out.println(cadena.getFrase() + " " + cadena.getLongitud());
        
        ServiceCadena sc = new ServiceCadena();
        
        //sc.mostrarVocales(cadena);
        //sc.invertirFrase(cadena);
        //sc.vecesRepetido(cadena);
        //sc.compararLongitud(cadena);
        //sc.unirFrases(cadena);
        //sc.contiene(cadena);
        sc.reemplazar(cadena);
    }
}
