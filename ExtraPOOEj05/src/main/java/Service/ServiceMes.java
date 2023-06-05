/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ServiceMes {
    
    
    public void adivinar(int mesAleatorio){
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        
        while (!correct) {
            System.out.println("Ingrese un mes para verificar si el mes aleatorio que definio el programa: ");
            String elegido = scanner.next().toLowerCase();

            switch (elegido) {
                case "enero":
                    if (mesAleatorio == 1) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "febrero":
                    if (mesAleatorio == 2) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "marzo":
                    if (mesAleatorio == 3) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "abril":
                    if (mesAleatorio == 4) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "mayo":
                    if (mesAleatorio == 5) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "junio":
                    if (mesAleatorio == 6) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "julio":
                    if (mesAleatorio == 7) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "agosto":
                    if (mesAleatorio == 8) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "septiembre":
                    if (mesAleatorio == 9) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "octubre":
                    if (mesAleatorio == 10) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "noviembre":
                    if (mesAleatorio == 11) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                case "diciembre":
                    if (mesAleatorio == 12) {
                        System.out.println("Coincide con el mes aleatorio.");
                        correct = true;
                    } else {
                        System.out.println("No coincide con el mes aleatorio.");
                    }
                    break;
                default:
                    System.out.println("Ingrese un mes válido.");
                    break;
            }
        }
        
        
    } 

}
