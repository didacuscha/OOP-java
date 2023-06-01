/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.oopej4;
import Entity.Rectangle;
import Service.RectangleService;

/**
 *
 * @author AndreaCardenasT
 */
public class Pooej4 {
    
    public static void main(String[] args) {
        
        RectangleService luis = new RectangleService();
        Rectangle bob = luis.createRectangle();
        
        System.out.println("surface: " + luis.surface(bob));
        System.out.println("perimeter: " + luis.perimeter(bob));
        System.out.println(luis.draw(bob));
       
        

    }
}