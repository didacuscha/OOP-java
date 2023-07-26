/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.inheritancee5;

import Entity.Alquiler;
import Entity.Barco;
import Entity.BarcoMotor;
import Entity.Velero;
import Entity.Yate;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class Core {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        LocalDate fechaFabricacionBM = LocalDate.of(2020, 7, 18);
        Barco titanic = new BarcoMotor(120, "yk420", 20, fechaFabricacionBM);
        
        titanic.precioFinal(titanic);
        
        LocalDate fechaFabricacionYate = LocalDate.of(2023, 1, 10);
        Barco nautilius = new Yate(600, 5, "california69", 25, fechaFabricacionYate);
        nautilius.precioFinal(nautilius);
                
        LocalDate fechaFabricacionVelero = LocalDate.of(2004, 5, 25);
        Barco perlanegra = new Velero(4, "ben502", 30, fechaFabricacionVelero);
        perlanegra.precioFinal(perlanegra);
        
        System.out.println("Bienvenido a rentaTuBote.com");
        System.out.println("Ingrese la fecha de inicio de su renta (formato: yyyy-MM-dd): ");
        String inicioAlquilerStr = scanner.nextLine();
        LocalDate inicioAlquiler = LocalDate.parse(inicioAlquilerStr);

        System.out.println("Ingrese la duracion en dias de su renta: ");
        int duracionAlquiler = scanner.nextInt();
        LocalDate finAlquiler = inicioAlquiler.plusDays(duracionAlquiler);
        
        System.out.println("Ingrese el tipo de barco que desea alquilar(Yate, BarcoMotor, o Velero:");
        String barco = scanner.next().toLowerCase();
        if (barco.equalsIgnoreCase("yate")){
            Alquiler renta = new Alquiler("Diego", 19440091, inicioAlquiler, finAlquiler, "parqueado", "yate");
            renta.calcularAlquiler(nautilius, duracionAlquiler);
        } else if (barco.equalsIgnoreCase("velero")) {
            Alquiler renta = new Alquiler("Diego", 19440091, inicioAlquiler, finAlquiler, "parqueado", "velero");
            renta.calcularAlquiler(perlanegra, duracionAlquiler);
        } else if (barco.equalsIgnoreCase("barcomotor")) {
            Alquiler renta = new Alquiler("Diego", 19440091, inicioAlquiler, finAlquiler, "parqueado", "barcoMotor");
            renta.calcularAlquiler(titanic, duracionAlquiler);
        } else {
            System.out.println("Error, ninguno de los tipos de barco que ingreso son validos.");
        }
        
        
        
    
    }
}
