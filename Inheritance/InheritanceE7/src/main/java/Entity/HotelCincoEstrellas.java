/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class HotelCincoEstrellas extends HotelCuatroEstrellas {
    
    
    private Integer cantidadSalonesConferencia;
    private Integer cantidadSuites;
    private Integer cantidadLimosinas;

    public HotelCincoEstrellas() {
    }

    public HotelCincoEstrellas(Integer cantidadSalonesConferencia, Integer cantidadSuites, Integer cantidadLimosinas, Boolean gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroDeCamas, cantidadDePisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public Integer getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(Integer cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public Integer precioHabitacion(Hoteles hotel) {
        Integer precio = super.precioHabitacion(hotel);
        Integer precioLimosinas = cantidadLimosinas * 15;
        
        precio += precioLimosinas;
        
        hotel.setPrecioHabitaciones(precio);
        
        return precio;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de alojamiento: Hotel Cinco Estrellas");
        sb.append("\nCantidad salones de conferencia ").append(cantidadSalonesConferencia);
        sb.append("\nCantidad de suites: ").append(cantidadSuites);
        sb.append("\nCantidad de Limosinas ").append(cantidadLimosinas);
        sb.append("\nTiene gimnasio: ").append(gimnasio);
        sb.append("\nNombre del restaurante: ").append(nombreRestaurante);
        sb.append("\nCapacidad del restaurante: ").append(capacidadRestaurante);
        sb.append("\nCantidad de habitaciones: ").append(getCantidadHabitaciones());
        sb.append("\nNúmero de camas: ").append(getNumeroDeCamas());
        sb.append("\nCantidad de pisos: ").append(getCantidadDePisos());
        sb.append("\nPrecio de las habitaciones: ").append(getPrecioHabitaciones());
        sb.append("\nNombre: ").append(getNombre());
        sb.append("\nDirección: ").append(getDireccion());
        sb.append("\nLocalidad: ").append(getLocalidad());
        sb.append("\nGerente: ").append(getGerente());
        return sb.toString();
    }
}
