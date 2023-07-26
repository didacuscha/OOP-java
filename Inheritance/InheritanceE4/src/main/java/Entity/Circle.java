/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class Circle implements Shape{
    
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculatePerimeter(){
        return PI * (radius * 2);
    }
    
    @Override
    public double calculateArea(){
        return PI * (radius * radius);
    }
}
