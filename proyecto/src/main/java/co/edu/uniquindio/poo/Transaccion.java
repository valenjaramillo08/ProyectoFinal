package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Transaccion {
    public int idTransaccion;
    public LocalDate fecha;
    public Empleado empleado;
    public Vehiculo vehiculo;
    public Cliente cliente;
    public Transaccion(int idTransaccion, LocalDate fecha, Empleado empleado, Vehiculo vehiculo, Cliente cliente) {
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.empleado = empleado;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }
    public int getIdTransaccion() {
        return idTransaccion;
    }
    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
