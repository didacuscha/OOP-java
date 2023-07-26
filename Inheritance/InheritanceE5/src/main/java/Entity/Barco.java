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
public class Barco {
    
    protected String matricula;
    protected Integer eslora;
    protected LocalDate fechaFabricación;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, LocalDate fechaFabricación) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fechaFabricación = fechaFabricación;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public LocalDate getFechaFabricación() {
        return fechaFabricación;
    }

    public void setFechaFabricación(LocalDate fechaFabricación) {
        this.fechaFabricación = fechaFabricación;
    }
    
    public double precioFinal(Barco barco){
        Integer precioFinal = barco.eslora * 10;
        System.out.println("El precio final es: " + precioFinal);
        return precioFinal;
    }
    
}
