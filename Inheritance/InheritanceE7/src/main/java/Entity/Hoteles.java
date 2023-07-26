/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author AndreaCardenasT
 */
public class Hoteles extends Alojamiento{
    
    protected Integer cantidadHabitaciones;
    protected Integer numeroDeCamas;
    protected Integer cantidadDePisos;
    protected Integer precioHabitaciones;

    public Hoteles() {
    }

    public Hoteles(Integer cantidadHabitaciones, Integer numeroDeCamas, Integer cantidadDePisos, Integer precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public void setNumeroDeCamas(Integer numeroDeCamas) {
        this.numeroDeCamas = numeroDeCamas;
    }

    public Integer getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(Integer cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    public Integer getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Integer precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    public Integer precioHabitacion(Hoteles hotel) {
        Integer base = 50;
        Integer capacity = 1 * cantidadHabitaciones;
        Integer hotelPrice = base + capacity;
        return hotelPrice;   
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tipo de alojamiento: Hotel");
        sb.append("\nCantidad de habitaciones: ").append(cantidadHabitaciones);
        sb.append("\nNúmero de camas: ").append(numeroDeCamas);
        sb.append("\nCantidad de pisos: ").append(cantidadDePisos);
        sb.append("\nPrecio de las habitaciones: ").append(precioHabitaciones);
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nDirección: ").append(direccion);
        sb.append("\nLocalidad: ").append(localidad);
        sb.append("\nGerente: ").append(gerente);
        return sb.toString();
    }
}


