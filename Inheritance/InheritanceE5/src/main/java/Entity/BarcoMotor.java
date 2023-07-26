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
public class BarcoMotor extends Barco {
    
    private Integer potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaCV, String matricula, Integer eslora, LocalDate fechaFabricación) {
        super(matricula, eslora, fechaFabricación);
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer PotenciaCV) {
        this.potenciaCV = PotenciaCV;
    }

    @Override
    public double precioFinal(Barco barco){
        Integer precioBase = barco.getEslora() * 10;
        Integer precioFinal = precioBase + potenciaCV;
        System.out.println("El precio valor modulo del barco a motor es:" + precioFinal);
        return precioFinal;
    }
    
}
