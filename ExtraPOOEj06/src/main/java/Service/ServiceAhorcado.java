/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Ahorcado;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ServiceAhorcado {
    
    Scanner scanner = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
        
        String secretWord = "apple";
        int longitud = secretWord.length();
        int maxPlays = longitud -1;
        String[] word = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            word[i] = String.valueOf(secretWord.charAt(i));
        }
        
        Ahorcado juego = new Ahorcado(); // Create a new Ahorcado object
        juego.setPalabra(word); // Set the word array to the palabra attribute
        juego.setLetters(longitud); // Set the letters attribute
        juego.setMaxPlays(maxPlays);
        return juego;
    }
    
    public void longitud(Ahorcado juego){
        int longitud = juego.getLetters();
        System.out.println("longitud de la palabra :" + juego.getLetters() + " letras");
    }
    
    public void buscar(Ahorcado juego){
        
        int lettersFound = 0;
        int maxPlays = juego.getMaxPlays();
        String[] palabra = juego.getPalabra();
        String[] guessedWord = new String[juego.getLetters()];
        List<Integer> letterIndices = new ArrayList<>();

        boolean letraEncontrada = false;
        
        while (maxPlays > 0) {
        System.out.println("Ingrese la letra a buscar: ");
        String letra = scanner.next().toLowerCase();
        letterIndices.clear();

        for (int i = 0; i < juego.getLetters(); i++) {
            if (palabra[i].equalsIgnoreCase(letra) && guessedWord[i] == null) {
                guessedWord[i] = palabra[i];
                letterIndices.add(i);
            }
        }

        if (!letterIndices.isEmpty()) {
            System.out.println("La letra " + letra + " está presente en la palabra " + letterIndices.size() + " veces.");

            for (int index : letterIndices) {
                System.out.println("Encontrada en la posición " + (index + 1));
            }
            
        } else {
            maxPlays--;
            System.out.println("Letra " + letra + " no encontrada en la palabra, " + maxPlays + " intentos restantes");
        }

        // Check if the entire word has been guessed correctly
        boolean wordGuessed = true;
        for (int i = 0; i < juego.getLetters(); i++) {
            if (guessedWord[i] == null) {
                wordGuessed = false;
                break;
            }
        }

        if (wordGuessed) {
            String palabraAdivinada = String.join("", juego.getPalabra());
            System.out.println("¡Felicidades! Has adivinado la palabra correctamente. La palabra era: " + palabraAdivinada);
            break;
        }
    }
    }
}
