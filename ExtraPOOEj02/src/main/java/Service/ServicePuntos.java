/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import java.util.Scanner;
import Entity.Puntos;
/**
 *
 * @author AndreaCardenasT
 */
public class ServicePuntos {
    
    public Puntos crearPuntos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las coordenadas del primer punto:");
        System.out.println("x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Ingrese las coordenadas del segundo punto:");
        System.out.println("x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("y2: ");
        double y2 = scanner.nextDouble();
        
        
        return new Puntos(x1, y1, x2, y2);
    }
    
    public double calcularDistancia(Puntos points) {
        double distancia = Math.sqrt(Math.pow(points.getX2() - points.getX1(), 2) + Math.pow(points.getY2() - points.getY1(), 2));
        System.out.println("la distancia entre los puntos es: " + distancia);
        return distancia;
    }
}
