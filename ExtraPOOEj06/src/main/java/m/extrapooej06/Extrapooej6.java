/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.extrapooej06;

import Entity.Ahorcado;
import Service.ServiceAhorcado;

/**
 *
 * @author AndreaCardenasT
 */
public class Extrapooej6 {
    
    public static void main(String[] args){
    
        ServiceAhorcado sa = new ServiceAhorcado();
        Ahorcado juego = sa.crearJuego();
        sa.buscar(juego);
    }
}
