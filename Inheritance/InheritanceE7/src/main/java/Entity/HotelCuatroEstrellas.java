/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class HotelCuatroEstrellas extends Hoteles{
    
    protected Boolean gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public HotelCuatroEstrellas() {
    }

    public HotelCuatroEstrellas(Boolean gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroDeCamas, cantidadDePisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Boolean getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Boolean gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }
    
    @Override
    public Integer precioHabitacion(Hoteles hotel) {
        Integer precio = super.precioHabitacion(hotel);
        Integer precioRestaurante = 0;
        if (capacidadRestaurante < 30) {
            precioRestaurante = 10;
        } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50){
            precioRestaurante = 30;
        } else {
            precioRestaurante = 50;
        }
        
        Integer valorGym;
        if (gimnasio == true) {
            valorGym = 50;
        } else {
            valorGym = 30;
        }
        
        precio += precioRestaurante + valorGym;
        hotel.setPrecioHabitaciones(precio);
        
        return precio;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de alojamiento: Hotel Cuatro Estrellas");
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
