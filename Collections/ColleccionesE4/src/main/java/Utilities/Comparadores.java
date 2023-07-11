/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Entity.Movie;
import java.util.Comparator;

/**
 *
 * @author AndreaCardenasT
 */
public class Comparadores {
    
    public static Comparator<Movie> ordenarPorDuracionDesc = new Comparator<Movie>(){
        @Override
        public int compare(Movie o1, Movie o2){
            
            return o2.getDuration().compareTo(o1.getDuration());
        }
    };
    
    public static Comparator<Movie> ordenarPorDuracionAscen = new Comparator<Movie>(){
        @Override
        public int compare(Movie o1, Movie o2){
            
            return o1.getDuration().compareTo(o2.getDuration());
        }
    };
    
    public static Comparator<Movie> ordenarPorTituloAlf = new Comparator<Movie>(){
        @Override
        public int compare(Movie o1, Movie o2){
            
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };
    
    public static Comparator<Movie> ordenarPorDirectorAlf = new Comparator<Movie>(){
        @Override
        public int compare(Movie o1, Movie o2){
            
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}

