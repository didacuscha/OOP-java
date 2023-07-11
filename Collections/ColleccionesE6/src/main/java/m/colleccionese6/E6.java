/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m.colleccionese6;

import Entity.Productos;
import Service.ServiceProductos;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class E6 {
    
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        
        ServiceProductos sp = new ServiceProductos();
        
        System.out.println("Bienvenido a Tahoe, la plataforma donde podras vender cualquier producto! ");
        boolean stay = true;
        
        System.out.println("Para una experiencia de la app comenzaremos automaticamente con el ingreso de productos.");
        HashMap<Integer, Productos> productos = sp.agregarProductos();
        
        do {
            System.out.println("MENU");
            System.out.println("Escribe 1 para agregar un producto");
            System.out.println("Escribe 2 para mostrar tus productos");
            System.out.println("Escribe 3 para modificar el precio de un producto");
            System.out.println("Escribe 4 para eliminar un producto");
            System.out.println("Escribe 5 para salir");
            
            int input = scanner.nextInt();
            
            if (input == 1) {
                sp.agregarProducto(productos);
            } else if (input == 2) {
                System.out.println("Lista de productos: ");
                sp.mostrarProductos(productos);
            } else if (input == 3) {
                sp.modificarPrecio(productos);
            } else if (input == 4) {
                sp.eliminarProducto(productos);
            } else {
                System.out.println("Programa terminado");
                stay = false;
            }
            
        } while (stay == true);
        
    }
}
