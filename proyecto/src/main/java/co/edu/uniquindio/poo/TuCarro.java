package co.edu.uniquindio.poo;
import java.util.Collection;

public class TuCarro {
    public String nombre;
    public Collection<Vehiculo> vehiculos;
    public Collection<Cliente> clientes;
    public Collection<Transaccion> transacciones;
    public Collection<Usuario> usuarios;

    
    public TuCarro(String nombre, Collection<Vehiculo> vehiculos, Collection<Cliente> clientes,
            Collection<Transaccion> transacciones, Collection<Usuario> usuarios) {
        this.nombre = nombre;
        this.vehiculos = vehiculos;
        this.clientes = clientes;
        this.transacciones = transacciones;
        this.usuarios = usuarios;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(Collection<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public Collection<Cliente> getClientes() {
        return clientes;
    }
    public void setClientes(Collection<Cliente> clientes) {
        this.clientes = clientes;
    }
    public Collection<Transaccion> getTransacciones() {
        return transacciones;
    }
    public void setTransacciones(Collection<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
    public Collection<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(Collection<Usuario> usuarios) {
        this.usuarios = usuarios;
    }


    
    
}
