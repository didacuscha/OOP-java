/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.colleccionese4;

import Entity.Movie;
import Service.ServiceMovie;
import Utilities.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author AndreaCardenasT
 */
public class E4 {
    
    public static void main(String[] args){
        
        ServiceMovie sm = new ServiceMovie();
        ArrayList<Movie> movies = sm.enterMovies();
        System.out.println("--------");
        //sm.pelisMayoresA1h(movies);
        
        Collections.sort(movies, Comparadores.ordenarPorDuracionDesc);
        
        for (Movie movie : movies) {
           System.out.println(movie);
        } 
       
        System.out.println("----;----");
        
        Collections.sort(movies, Comparadores.ordenarPorDuracionAscen);
        
        for (Movie movie : movies) {
           System.out.println(movie);
        }
         
         System.out.println("----:----");
        
        Collections.sort(movies, Comparadores.ordenarPorTituloAlf);
        
        for (Movie movie : movies) {
           System.out.println(movie);
        }
        
        System.out.println("----!----");
        
        Collections.sort(movies, Comparadores.ordenarPorDirectorAlf);
        
        for (Movie movie : movies) {
           System.out.println(movie);
        }
    }
}