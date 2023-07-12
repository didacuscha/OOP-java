/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class Animal {
    
    protected String name;
    protected String food;
    protected Integer age;
    protected String species;

    public Animal(String name, String food, Integer age, String species) {
        this.name = name;
        this.food = food;
        this.age = age;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
    
    
    
    public void showFood() {
        System.out.println("Yum yum");
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", food=" + food + ", age=" + age + ", species=" + species + '}';
    }
    
    
}
