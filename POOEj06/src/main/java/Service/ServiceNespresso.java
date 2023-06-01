/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Entity.Nespresso;
import java.util.Scanner;
/**
 *
 * @author AndreaCardenasT
 */
public class ServiceNespresso {
    
    Scanner scanner = new Scanner(System.in);
    
    public Nespresso crearCafetera(){
        
        System.out.println("Bienvenido, ingrese el modelo de su cafetera Nespresso: (Vertuo/Essenza)");
        String model = scanner.next();
        int cap = 0;
        int actuel = 0;
        
        if (model.equalsIgnoreCase("vertuo")) {
            cap = 1000;
        } else if (model.equalsIgnoreCase("essenza")){
            cap = 600;
        } else {
            System.out.println("Please enter a valid model.");
        }
        
        Nespresso machine = new Nespresso();
        machine.setQuantiteMax(cap);
        return machine;
    }
    
    public Nespresso llenarCafetera(Nespresso machine){
        machine.setQuantiteActuel(machine.getQuantiteMax());
        return machine;
    }
    
    public Nespresso servirTaza(Nespresso machine){
        System.out.println("De que tamanio desea su cafe? (alto/corto)");
        String size = scanner.next();
        int mls = 0;
        
        
        if (size.equalsIgnoreCase("alto")) {
             mls = 230;
        } else if (size.equalsIgnoreCase("corto")){
            mls = 40;
        } else {
            System.out.println("Please enter a valid size");
        }
        
        if (machine.getQuantiteActuel() > mls) {
            machine.setQuantiteActuel(machine.getQuantiteActuel() - mls);
            System.out.println("Enjoy your " + size + " " + mls + " coffee");
        } else if (machine.getQuantiteActuel() > 0 && machine.getQuantiteActuel() < mls) {
            System.out.println("Out of coffee, we got you a cup with " + machine.getQuantiteActuel() + " that were left");
            machine.setQuantiteActuel(0);
        } else {
            System.out.println("No coffee, your cup of coffee wasn't served!");
            machine.setQuantiteActuel(0);
        }
        return machine;     
    }
    
    public Nespresso vaciarCafetera(Nespresso machine){
        machine.setQuantiteActuel(0);
        return machine;
    }
    
    public Nespresso agregarCafe(Nespresso machine){
        System.out.println("Enter the amount of coffee you want to add: ");
        
        int moreCoffee = scanner.nextInt();
        if (moreCoffee < (machine.getQuantiteMax() - machine.getQuantiteActuel())){
            machine.setQuantiteActuel(machine.getQuantiteActuel() + moreCoffee);
        } else {
            System.out.println("Sorry that's too much coffee, the actual capacity is " + (machine.getQuantiteMax() - machine.getQuantiteActuel()));
        }
        
        return machine;
    }

}
