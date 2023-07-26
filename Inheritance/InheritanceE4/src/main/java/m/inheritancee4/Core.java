/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.inheritancee4;

import Entity.Circle;
import Entity.Rectangle;

/**
 *
 * @author AndreaCardenasT
 */
public class Core {
    
    public static void main(String[] args){
        
        Circle circle = new Circle(8);
        System.out.println("The area of the circle is: " +circle.calculateArea());
        System.out.println("The perimeter of the circle is: " +circle.calculatePerimeter());
        
        
        Rectangle rectangle = new Rectangle(5.5, 7);
        System.out.println("The area of the rectangle is: " +rectangle.calculateArea());
        System.out.println("The perimeter of the rectangle is: " +rectangle.calculatePerimeter());
    }
}
