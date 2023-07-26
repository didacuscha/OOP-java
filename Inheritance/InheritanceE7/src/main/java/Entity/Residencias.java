/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class Residencias extends AlojamientosExtraHoteleros{
    
    private Boolean descuentos;
    private Boolean campoDeportivo;

    public Residencias() {
    }

    public Residencias(Boolean descuentos, Boolean campoDeportivo, Boolean privado, Double cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetrosCuadrados, nombre, direccion, localidad, gerente);
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public Boolean getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Boolean descuentos) {
        this.descuentos = descuentos;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de alojamiento: Residencia");
        sb.append("\nTiene descuentos: ").append(descuentos);
        sb.append("\nTiene campo deportivo: ").append(campoDeportivo);
        sb.append("\nEs privado: ").append(getPrivado());
        sb.append("\nCantidad de metros cuadrados: ").append(getCantidadMetrosCuadrados());
        sb.append("\nNombre: ").append(getNombre());
        sb.append("\nDirección: ").append(getDireccion());
        sb.append("\nLocalidad: ").append(getLocalidad());
        sb.append("\nGerente: ").append(getGerente());
        return sb.toString();
    }
    
}
