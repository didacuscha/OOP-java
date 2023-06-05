/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class Ahorcado {
    
    private String[] palabra;
    private int letters;
    private int maxPlays;
    
    public Ahorcado(){
        
    }

    public Ahorcado(String[] palabra, int letters, int maxPlays){
        this.palabra = palabra;
        this.letters = letters;
        this.maxPlays = maxPlays;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetters() {
        return letters;
    }

    public void setLetters(int letters) {
        this.letters = letters;
    }

    public int getMaxPlays() {
        return maxPlays;
    }

    public void setMaxPlays(int maxPlays) {
        this.maxPlays = maxPlays;
    }
    
    
}
