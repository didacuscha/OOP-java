/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.DNI;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ServiceDNI {
    
    Scanner scanner = new Scanner(System.in);
    public DNI crearNif(){
        
        System.out.println("Ingrese su DNI: ");
        long DNI = scanner.nextLong();
        DNI dni = new DNI();
        dni.setDNI(DNI);
        
        int verifier = (int) DNI % 23;
        System.out.println(verifier);
        
        char[] letters = new char[23];
        letters[0] = 'T';
        letters[1] = 'R';
        letters[2] = 'W';
        letters[3] = 'A';
        letters[4] = 'G';
        letters[5] = 'M';
        letters[6] = 'Y';
        letters[7] = 'F';
        letters[8] = 'P';
        letters[9] = 'D';
        letters[10] = 'X';
        letters[11] = 'B';
        letters[12] = 'N';
        letters[13] = 'J';
        letters[14] = 'Z';
        letters[15] = 'S';
        letters[16] = 'Q';
        letters[17] = 'V';
        letters[18] = 'H';
        letters[19] = 'L';
        letters[20] = 'C';
        letters[21] = 'K';
        letters[22] = 'E';
     
        if (verifier < 23) {
            char additional = letters[verifier];
            String verifierString = Long.toString(DNI) + "-" + letters[verifier]; // Convert long to String and concatenate the character
            System.out.println(verifierString);
        }
        
        return dni;
    }
}
