/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Productos;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author AndreaCardenasT
 */
public class ServiceProductos {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public HashMap<Integer, Productos> agregarProductos(){
        
        HashMap<Integer, Productos> products = new HashMap();
        boolean sigue = true;
        Integer llave = 1;
        
        do {
 
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = scanner.next();

            System.out.println("Ingrese el precio del producto: ");
            Integer precio = scanner.nextInt();
            
            Productos producto = new Productos(nombre, precio);
            products.put(llave, producto);
            
            llave++;
            
            System.out.println("Desea ingresar otro producto? (si/no)");
            String respuesta = scanner.next();
            
            if (respuesta.equalsIgnoreCase("si")) {
                sigue = true;
            } else {
                System.out.println("Ingreso de productos terminado");
                sigue = false;
            }
            
            
            
        } while (sigue == true);
        
        return products;
    }
    
    public void mostrarProductos(HashMap<Integer, Productos> productos){
        
        for (Map.Entry<Integer, Productos> aux : productos.entrySet()) {
            Integer key = aux.getKey();
            Productos value = aux.getValue();
            
            System.out.println("key " + key + " value " + value);
        }
        
    }
    
    public HashMap<Integer, Productos> eliminarProducto(HashMap<Integer, Productos> productos){
        
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String eliminar = scanner.next();
        
        for (Iterator<Map.Entry<Integer, Productos>> iterator = productos.entrySet().iterator(); iterator.hasNext();) {
            
            Map.Entry<Integer, Productos> entry = iterator.next();
            Productos value = entry.getValue();
            
            if (value.getNombre().equalsIgnoreCase(eliminar)) {
                iterator.remove();
                System.out.println("Producto eliminado: " + value.getNombre());
            }
        }
        
        return productos;
    }
    
    public HashMap<Integer, Productos> modificarPrecio(HashMap<Integer, Productos> productos){
        
        System.out.println("Ingrese el nombre del producto al que desea modificarle el precio: ");
        String modificar = scanner.next();
        
        for (Iterator<Map.Entry<Integer, Productos>> iterator = productos.entrySet().iterator(); iterator.hasNext();) {
            
            Map.Entry<Integer, Productos> entry = iterator.next();
            Productos value = entry.getValue();
            
            if (value.getNombre().equalsIgnoreCase(modificar)) {
                
                System.out.println("El precio actual del producto " + value.getNombre() + " es: " + value.getPrecio() + " Ingrese el nuevo precio");
                Integer price = scanner.nextInt();
                value.setPrecio(price);
                
                System.out.println("Precio modificado: " + value.getPrecio());
            }
        }
        
        return productos;
    }
    
    public HashMap<Integer, Productos> agregarProducto(HashMap<Integer, Productos> products) {
        
        Integer lastKey = products.isEmpty() ? 1 : Collections.max(products.keySet());

        System.out.println("Ingrese el nombre del producto: ");
        String nombre = scanner.next();

        System.out.println("Ingrese el precio del producto: ");
        Integer precio = scanner.nextInt();

        Productos producto = new Productos(nombre, precio);
        products.put(lastKey + 1, producto);

        System.out.println("Producto agregado correctamente.");
        return products;
    }

}
