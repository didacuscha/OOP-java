/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class AlojamientosExtraHoteleros extends Alojamiento {
    
    protected Boolean privado;
    protected Double cantidadMetrosCuadrados;

    public AlojamientosExtraHoteleros() {
    }

    public AlojamientosExtraHoteleros(Boolean privado, Double cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Double getCantidadMetrosCuadrados() {
        return cantidadMetrosCuadrados;
    }

    public void setCantidadMetrosCuadrados(Double cantidadMetrosCuadrados) {
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de alojamiento: AlojamientosExtraHoteleros");
        sb.append("\nEs privado: ").append(privado);
        sb.append("\nCantidad de metros cuadrados: ").append(cantidadMetrosCuadrados);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nDirección: ").append(direccion);
        sb.append("\nLocalidad: ").append(localidad);
        sb.append("\nGerente: ").append(gerente);
        return sb.toString();
    }
}
