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
public class Velero extends Barco {
    
    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles, String matricula, Integer eslora, LocalDate fechaFabricación) {
        super(matricula, eslora, fechaFabricación);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public double precioFinal(Barco barco){
        Integer precioFinal = (barco.getEslora() + mastiles) * 10;
        System.out.println("El precio valor modulo del velero es:" + precioFinal);
        return precioFinal;
    }
}
