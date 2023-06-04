
package ServicioPersona;
import Entidad.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ServicioPersona {
    
    public Persona crearPersona(){
        int d,m,a;
        
        Persona p = new Persona();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la persona:");
        p.setNombre(leer.nextLine());
        
        System.out.println("Ingrese la fecha de nacimiento de la persona:");
        System.out.println("Ingrese el año:");
        a=leer.nextInt();
        System.out.println("Ingrese el mes:");
        m=leer.nextInt();
        System.out.println("Ingrese el dia:");
        d=leer.nextInt();
        Date nacimiento = new Date(a-1900,m-1,d);
        p.setFechaNacimiento(nacimiento);
        
        System.out.println(p);
        return p;
        
    }
    
    public int calcularEdad(Persona p){
        int edad;
        //para la fecha actual usamos Date()
        Date fechaHoy = new Date();
        
        edad = (int)(fechaHoy.getYear()-p.getFechaNacimiento().getYear());
        System.out.println("La edad de la persona es: "+edad);
        return edad;
    }
    
    public void menorQue(Persona p,int edad){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la edad de la persona 2 para comparar:");
        int edad2 = leer.nextInt();
        System.out.println("la persona 2 es menor que la persona 1 ?: "+(edad2<edad));
        
    }
    
    public void mostrarPersona(Persona p){
        System.out.println("La persona " + p.getNombre() + " nacio el " + p.getFechaNacimiento());
    }
}