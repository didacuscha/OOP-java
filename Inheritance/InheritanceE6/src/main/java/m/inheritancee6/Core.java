/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.inheritancee6;

import Entity.Edificio;
import Entity.EdificioDeOficinas;
import Entity.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author AndreaCardenasT
 */
public class Core {
    
    public static void main(String[] args){
        
        EdificioDeOficinas bacata = new EdificioDeOficinas(20, 20, 20, 30.0, 3.0, 15.0);
        EdificioDeOficinas huawei = new EdificioDeOficinas(18, 20, 25, 20.0, 2.5, 18.0);
        
        Polideportivo campin = new Polideportivo("Campin", false, 68.0, 10.0, 105.0);
        Polideportivo monumental = new Polideportivo("Monumental", true, 80.0, 20.0, 110.0);
        
        
        ArrayList<Edificio> edificios = new ArrayList();
        edificios.add(bacata);
        edificios.add(campin);
        edificios.add(huawei);
        edificios.add(monumental);
        
        for (Edificio edificio : edificios){
            edificio.calcularSuperficie();
            edificio.calcularVolumen();
            
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioDeOficinas = (EdificioDeOficinas) edificio;
                edificioDeOficinas.cantPersonas();
            } else if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Techado: " + polideportivo.getTechado());
            }
        }
        
    }
}
