/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import java.util.Scanner;
import Entidad.Persona;
import com.m.oopej01.oopej01;
/**
 *
 * @author AndreaCardenasT
 */
public class PersonaService {
    
    public Persona crearPersona() {
        
        Scanner leer = new Scanner(System.in);
        Persona personaCompleta = new Persona("Bubu", 15, 2008);
        System.out.println("Ingrese el nombre de la persona: ");
        personaCompleta.setName(leer.next());
        
        return personaCompleta;
    }
}
