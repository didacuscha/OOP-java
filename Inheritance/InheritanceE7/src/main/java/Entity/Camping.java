/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class Camping extends AlojamientosExtraHoteleros {
    
    private Integer capacidadMaxCarpas;
    private Integer cantidadBanios;
    private Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer capacidadMaxCarpas, Integer cantidadBanios, Boolean restaurante, Boolean privado, Double cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantidadBanios = cantidadBanios;
        this.restaurante = restaurante;
    }

    public Integer getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(Integer capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public Integer getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(Integer cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de alojamiento: Camping");
        sb.append("\nCapacidad máxima de carpas: ").append(capacidadMaxCarpas);
        sb.append("\nCantidad de baños: ").append(cantidadBanios);
        sb.append("\nTiene restaurante: ").append(restaurante);
        sb.append("\nEs privado: ").append(getPrivado());
        sb.append("\nCantidad de metros cuadrados: ").append(getCantidadMetrosCuadrados());
        sb.append("\nNombre: ").append(getNombre());
        sb.append("\nDirección: ").append(getDireccion());
        sb.append("\nLocalidad: ").append(getLocalidad());
        sb.append("\nGerente: ").append(getGerente());
        return sb.toString();
    }
    
}
