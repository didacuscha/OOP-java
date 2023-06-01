/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.util.Scanner;
import Entity.Persona;

/**
 *
 * @author AndreaCardenasT
 */
public class ServicePersona {
    
    Scanner scanner = new Scanner(System.in);
    
    public Persona crearPersona(){

        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = scanner.next();
        System.out.println("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();
  
        System.out.println("Ingrese el sexo de la persona: (H/M/O)");
        char sexo = scanner.next().charAt(0);
        if (sexo == 'm' || sexo == 'h'|| sexo == 'o'){   
        } else {
            System.out.println("sexo incorrecto, por favor ingrese h(hombre), m(mujer) u o(otro)");
        }
        System.out.println("Ingrese el peso de la persona: ");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese la altura de la persona: ");
        double altura = scanner.nextDouble();
        
        return new Persona(nombre, edad, sexo, peso, altura);
        
    }
    
    public boolean mayorDeEdad(Persona persona){
        if (persona.getEdad() > 18){
            System.out.println("es mayor de edad");
            return true;
        } else {
            System.out.println("es menor de edad");
            return false;
        }
    }
    
    public int calcularIMC(Persona persona){
        double imc = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        if (imc < 20){
            System.out.println(persona.getNombre() + " Se encuentra bajo(a) de imc");
            return -1;
        } else if (imc >= 20 && imc <= 25){
            System.out.println(persona.getNombre() + " Ok de imc, e encuentra en el rango");
            return 0;
        } else {
            System.out.println(persona.getNombre() + " esta obeso/obesa");
            return 1;
        }
    }
}
