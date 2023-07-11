/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Movie;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ServiceMovie {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Movie> enterMovies(){
    
    ArrayList<Movie> movies = new ArrayList();
    boolean alfin = true;
    
    do {
        System.out.println("Ingrese el nombre de la pelicula: ");
        String name = scanner.next();
        
        System.out.println("Ingrese el director de la pelicula: ");
        String director = scanner.next();
        
        System.out.println("Ingrese la duracion de la pelicula en horas: ");
        Integer duration = scanner.nextInt();
        
        Movie movie = new Movie(name, director, duration);
        movies.add(movie);
        
        System.out.println("Desea ingresar otra pelicula?(si/no): ");
        String decision = scanner.next();
        if (decision.equalsIgnoreCase("si")) {
            alfin = true;
        } else {
            System.out.println("Ingreso de peliculas terminado, la lista es la siguiente: ");
            for (Movie film : movies) {
                System.out.println(film + " ");
            }
            alfin = false;
        }

    } while (alfin == true);
    
    return movies;
    }
    
    public void pelisMayoresA1h(ArrayList<Movie> movies){
        
        for (Movie film : movies) {
            if (film.getDuration() > 1) {
                System.out.println(film);
            }
        }
    }
}
