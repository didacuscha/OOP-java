/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.oopej11;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author AndreaCardenasT
 */

public class Oopej11 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el dia: ");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el anio: ");
        int anio = scanner.nextInt();
        
        Date fecha = new Date(anio - 1900, mes - 1, dia);
        
        Date fechaActual = new Date();
        
        int comparison = fecha.compareTo(fechaActual);

        if (comparison < 0) {
            System.out.println("La fecha ingresada es anterior a la fecha actual.");
        } else if (comparison > 0) {
            System.out.println("La fecha ingresada es posterior a la fecha actual.");
        } else {
            System.out.println("La fecha ingresada es igual a la fecha actual.");
        }
        
        Calendar calendarFecha = Calendar.getInstance();
        calendarFecha.setTime(fecha);

        Calendar calendarFechaActual = Calendar.getInstance();
        calendarFechaActual.setTime(fechaActual);

        int yearsDifference = calendarFechaActual.get(Calendar.YEAR) - calendarFecha.get(Calendar.YEAR);

        if (calendarFechaActual.get(Calendar.MONTH) < calendarFecha.get(Calendar.MONTH)
                || (calendarFechaActual.get(Calendar.MONTH) == calendarFecha.get(Calendar.MONTH)
                && calendarFechaActual.get(Calendar.DAY_OF_MONTH) < calendarFecha.get(Calendar.DAY_OF_MONTH))) {
            yearsDifference--;
        }

        System.out.println("Difference in years: " + yearsDifference);
    
    }
    
    
}
