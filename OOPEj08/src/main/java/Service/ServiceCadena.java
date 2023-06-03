/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Cadena;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ServiceCadena {
    
    Scanner scanner = new Scanner(System.in);
    
    public void mostrarVocales(Cadena cadena){
        String frase = cadena.getFrase();
        int vocales = 0;
        for (int i = 0; i < frase.length(); i++) {
            char character = frase.charAt(i);
            if (isVowel(character)){
                System.out.println("Vowel found: " + character);
                vocales++;
            }
        }
        
        System.out.println("Vowels found: " + vocales);
    }

    private boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    
    }
    
    public void invertirFrase(Cadena cadena){
        String frase = cadena.getFrase();
        String fraseAlReves = "";
        
        for (int i = frase.length()-1; i > -1; i--) {
            char character = frase.charAt(i);
            fraseAlReves = fraseAlReves.concat(String.valueOf(character));
        }
        
        System.out.println(fraseAlReves);
    }
    
    public void vecesRepetido(Cadena cadena){
        String frase = cadena.getFrase();
        int vecesRepetida = 0;
        System.out.println("Ingresa una letra para ver cuantas veces esta repetida en la frase: ");
        String input = scanner.next();
        char letter = input.charAt(0);
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letter){
                vecesRepetida++;
            }
        }
        
        System.out.println("La letra " + letter + " se repite " + vecesRepetida + " veces");
    }
    
    public void compararLongitud(Cadena cadena){
        String frase = cadena.getFrase();
        System.out.println("Ingrese una nueva frase para comparar la lontigud de ambas: ");
        String comparar = scanner.nextLine();
        
        if (frase.length() > comparar.length()){
            System.out.println("la primera frase es mas larga con " + frase.length() + " caracteres sobre los " + comparar.length() + " caracteres de la segunda frase");
        } else {
            System.out.println("la segunda frase es mas larga con " + comparar.length() + " caracteres sobre los " + frase.length() + " caracteres de la primera frase");
        }
    }
    
    public void unirFrases(Cadena cadena){
        String frase = cadena.getFrase();
        System.out.println("Ingrese una nueva frase para concatenarlas: ");
        String unir = scanner.nextLine();
        String unificada = frase.concat(" ").concat(unir);
        System.out.println("La frase unificada es: " + unificada);
        
    }
    
    public void contiene(Cadena cadena){
        String frase = cadena.getFrase();
        boolean trouve = false;
        System.out.println("Ingrese una letra para verificar si se encuentra en la frase previamente ingresada: ");
        String input = scanner.next();
        char letter = input.charAt(0);
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letter){
                trouve = true;  
            } 
        }
        
        if (trouve == true){
             System.out.println("Se encontro la letra " + letter + " en la frase");
        } else {
            System.out.println("No se encontro la letra  " + letter + " en la frase");
        }
    }
    
    public void reemplazar(Cadena cadena){
        String frase = cadena.getFrase();
        
        System.out.println("Ingrese una letra para reemplazar todas las a que se encuentren en la frase: ");
        String input = scanner.next();
        char letter = input.charAt(0);
        
        StringBuilder fraseReemplazada = new StringBuilder();
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a'){
                fraseReemplazada.append(letter);
            } else {
                fraseReemplazada.append(frase.charAt(i));
            }
        }
        
        System.out.println("frase reemplazada: " + fraseReemplazada.toString());
    }
}
