/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class CircunferenciaService {
    
    public Circunferencia crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();
        Circunferencia circunference = new Circunferencia();
        circunference.setRadio(radius);
        return circunference;
    }
    
    public double area(double radio){
       double area = Math.PI * radio * radio;
       return area;
    }
    
    public double perimeter(double radio) {
        double perimeter = 2 * Math.PI * radio;
        return perimeter;
    }
}
