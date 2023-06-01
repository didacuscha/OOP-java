/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.util.Scanner;
import Entity.Rectangle;

/**
 *
 * @author AndreaCardenasT
 */
public class RectangleService {
    
    Scanner scanner = new Scanner(System.in);
    
    public Rectangle createRectangle() {
        System.out.println("Enter the base of the rectangle: ");
        int base = scanner.nextInt();
        System.out.println("Enter the height of the rectangle: ");
        int height = scanner.nextInt();
        
        Rectangle bob = new Rectangle();
        bob.setBase(base);
        bob.setHeight(height);
        
        return bob;
    }
    
    public int surface(Rectangle bob) {
        int surface = bob.getHeight() * bob.getBase();
        return surface;   
    }
    
    public int perimeter(Rectangle bob) {
        int perimeter = (bob.getHeight() + bob.getBase()) * 2;
        return perimeter;
    }
    
    public String draw(Rectangle bob) {
        String done = "Program terminated.";
        for (int i = 0; i < bob.getHeight(); i++) {
            for (int j = 0; j < bob.getBase(); j++) {
                if (i == 0 || (i == bob.getHeight() -1) || j == 0 || (j == bob.getBase()-1)) {
                    System.out.print("*");
               } else {
                    System.out.print(" ");
               }
            
            } System.out.println();
        
        } 
        return done; 
    }
}
