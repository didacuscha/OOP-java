/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class Nespresso {
    
    private int quantiteMax;
    private int quantiteActuel;
    
    public Nespresso(){
        
    }
    
    public Nespresso(int quantiteMAx, int quantiteActuel){
        this.quantiteMax = quantiteMax;
        this.quantiteActuel = quantiteActuel;
    }

    public int getQuantiteMax() {
        return quantiteMax;
    }

    public void setQuantiteMax(int quantiteMax) {
        this.quantiteMax = quantiteMax;
    }

    public int getQuantiteActuel() {
        return quantiteActuel;
    }

    public void setQuantiteActuel(int quantiteActuel) {
        this.quantiteActuel = quantiteActuel;
    }
    
    
}
