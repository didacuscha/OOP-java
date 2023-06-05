/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class DNI {
    
    private char NIF;
    private long DNI;
    
    public DNI(){
        
    }

    public DNI(char NIF, long DNI) {
        this.NIF = NIF;
        this.DNI = DNI;
    }

    public char getNIF() {
        return NIF;
    }

    public void setNIF(char NIF) {
        this.NIF = NIF;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }
    
    
}
