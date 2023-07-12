/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.inheritancee1;

import Entity.Animal;
import Entity.Cat;
import Entity.Dog;
import Entity.Horse;

/**
 *
 * @author AndreaCardenasT
 */
public class Core {
    
    public static void main(String[] args){
        
        Animal dog1 = new Dog("Stitch", "Carnivore", 15, "Doberman");
        dog1.getFood();
        dog1.showFood();
        
        Animal cat1 = new Cat("Sanchis", "Carnivore", 11, "Egyptian");
        cat1.getFood();
        cat1.showFood();
        
        Animal horse1 = new Horse("Spark", "Herbivore", 5, "Fine pace");
        horse1.getFood();
        horse1.showFood();
    }
}
