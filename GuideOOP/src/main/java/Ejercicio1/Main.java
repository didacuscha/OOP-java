/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class Main {
    
    public static void main(String[] args){
        
        Libro libro = new Libro("lord of the rings", "j.j tolkien", "AEB1543", 645);
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro: ");
        String titulo = scanner.nextLine();
        libro.setTitulo(titulo);
        
        System.out.println("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        libro.setAutor(autor);
        
        System.out.println("Ingrese el ISBN del libro: ");
        String ISBN = scanner.nextLine();
        libro.setISBN(ISBN);
        
        System.out.println("Ingrese las paginas del libro: ");
        int paginas = scanner.nextInt();
        libro.setPaginas(paginas);
        
        System.out.println(libro.toString());
    }
}
