/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.inheritancee7;

import Entity.Alojamiento;
import Entity.Camping;
import Entity.HotelCincoEstrellas;
import Entity.HotelCuatroEstrellas;
import Entity.Hoteles;
import Entity.Residencias;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author AndreaCardenasT
 */
public class Core {
    /* public HotelCincoEstrellas(Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer cantidadLimosinas,
    Boolean gimnasio, String nombreRestaurante, Integer capacidadRestaurante, 
    Integer cantidadHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, 
    Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        

     public HotelCuatroEstrellas(Boolean gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, 
                                 Integer numeroDeCamas, Integer cantidadDePisos, 
                                Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) 
    
    public Camping(Integer capacidadMaxCarpas, Integer cantidadBanios, Boolean restaurante, Boolean privado, Double cantidadMetrosCuadrados, 
    String nombre, String direccion, String localidad, String gerente)
    
    public Residencias(Boolean descuentos, Boolean campoDeportivo, Boolean privado, Double cantidadMetrosCuadrados, String nombre, 
    String direccion, String localidad, String gerente)
        
    */
    
    public static void main(String[] args){
        HotelCuatroEstrellas hotel4e = new HotelCuatroEstrellas(false, "DiLucca", 30, 100, 120, 10, 0, "Ceasar's Palace", "123 Road", "vegas", "cesar");
        HotelCincoEstrellas hotel5e = new HotelCincoEstrellas(3, 10, 10, true, "Primi", 35, 120, 150, 12, 0, "Venetian", "Cll 138", "Bogota", "diego");
        
        System.out.println("precio final por habitacion del hotel 4 estrellas: " + hotel4e.precioHabitacion(hotel4e));
        System.out.println("precio final por habitacion del hotel 5 estrellas: " + hotel5e.precioHabitacion(hotel5e));
        
        Camping camping = new Camping(10, 3, true, false, 500.0, "Chingaza", "Via al llano", "Llanos", "Armando");
        Camping glamping = new Camping(20, 6, false, true, 1000.0, "Orion", "Desierto de la Tatacoa", "Huila", "Mario");
        Residencias airbnb = new Residencias(true, false, true, 100.0, "Penthouse", "Poblado", "Medellin", "Bubu");
        Residencias apto = new Residencias(true, true, true, 150.0, "Casa", "Cabrera", "Bogota", "Diego");
        
        ArrayList<Alojamiento> alojamientos = new ArrayList();
        alojamientos.add(hotel5e);
        alojamientos.add(hotel4e);
        alojamientos.add(camping);
        alojamientos.add(glamping);
        alojamientos.add(airbnb);
        alojamientos.add(apto);
        
        System.out.println("FIRST METHOD. SHOW ALL ALOJAMIENTOS");
        
        System.out.println("------");
        for (Alojamiento alojamiento : alojamientos){
            System.out.println(alojamiento);
            System.out.println("************************");
        }
        
        System.out.println("2ND METHOD. SHOW HOTELS BY PRICE FROM LOW TO HIGH");
        
        System.out.println("------------");
        ArrayList<Hoteles> hotelesList = new ArrayList<>();
        hotelesList.add(hotel5e);
        hotelesList.add(hotel4e);

        // Sorting the hotels based on their precioHabitaciones (from cheapest to more expensive)
        Collections.sort(hotelesList, new Comparator<Hoteles>() {
            @Override
            public int compare(Hoteles hotel1, Hoteles hotel2) {
                return Integer.compare(hotel1.getPrecioHabitaciones(), hotel2.getPrecioHabitaciones());
            }
        });

        // Printing the sorted hotels
        for (Hoteles hotel : hotelesList) {
            System.out.println(hotel);
            System.out.println("---------------------");
        }
        
        System.out.println("3RD METHOD PRINT ALL CAMPINGS WITH RESTAURANT");
        
        System.out.println("------");
        for (Alojamiento alojamiento : alojamientos){
            if (alojamiento instanceof Camping) {
                Camping camp = (Camping) alojamiento;
                if (camp.getRestaurante()) {
                System.out.println("Camping con restaurante: " + camp.toString());
                System.out.println("---------------------");
        }

            }
        }
        
        System.out.println("4TH METHOD PRINT ALL RESIDENCIAS WITH DISCOUNT");
        
        System.out.println("---------");
        for (Alojamiento alojamiento : alojamientos){
            if (alojamiento instanceof Residencias) {
                Residencias resi = (Residencias) alojamiento;
                if (resi.getDescuentos()) {
                System.out.println("Residencia con descuento: " + resi.toString());
                System.out.println("---------------------");
                }
            }    
        }
        
        
    }
}    
