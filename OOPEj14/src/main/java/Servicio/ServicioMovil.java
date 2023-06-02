/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;
import Entidad.Moviles;
import java.util.*;
 
public class ServicioMovil {
    Scanner scanner = new Scanner(System.in);
    
    public Moviles cargarCelular() {
        
        Moviles m = new Moviles();
        
        System.out.println("Ingrese la marca del telefono");
        m.setMarca(scanner.nextLine());
        System.out.println("Ingrese el modelo del telefono");
        m.setModelo(scanner.nextLine());
        System.out.println("Ingrese el precio del telefono");
        m.setPrecio(scanner.nextInt());
        System.out.println("Ingrese la memoria RAM del telefono");
        m.setMemoriaRam(scanner.nextInt());
        System.out.println("Ingrese el almacenamiento del telefono");
        m.setAlmacenamiento(scanner.nextInt());
        int[] vCodigo = ingresarCodigo();
        m.setCodigo(vCodigo);
        return m;
    }
    
    public int[] ingresarCodigo() {
        System.out.println("Ingresa el codigo de 7 caracteres");
        int[] vCodigo = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el digito " + (i+1));
            vCodigo[i] = scanner.nextInt();
            
             }
        return vCodigo;
    }
    
    public void mostrarMovil(Moviles m) {
        System.out.print(m);
        System.out.print(" El còdigo: ");
        for (int i = 0; i < 7; i++) {
        System.out.print("[" + m.getCodigo()[i] + "]");
    }        
    }
}
