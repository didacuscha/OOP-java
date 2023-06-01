/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


public class Persona {

    //atributos
    //constructores
    //metodos propios
    public String name;
    public int age;
    public int birthday;
    
    public Persona(String name, int age, int birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    
    
    

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", age=" + age + ", birthday=" + birthday + '}';
    }
    
    

}
