/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.time.LocalDate;

/**
 *
 * @author AndreaCardenasT
 */
public class Yate extends Barco{
    
    private Integer potenciaCV;
    private Integer numCamarotes;

    public Yate() {
    }

    public Yate(Integer potenciaCV, Integer numCamarotes, String matricula, Integer eslora, LocalDate fechaFabricación) {
        super(matricula, eslora, fechaFabricación);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }
    
    @Override
    public double precioFinal(Barco barco){
        Integer precioBase = (barco.getEslora() + numCamarotes) * 10;
        Integer precioFinal = precioBase + potenciaCV;
        System.out.println("El precio valor modulo del yate es:" + precioFinal);
        return precioFinal;
    }
}
