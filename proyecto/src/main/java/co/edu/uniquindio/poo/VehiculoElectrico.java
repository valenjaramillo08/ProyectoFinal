package co.edu.uniquindio.poo;

public class VehiculoElectrico extends Vehiculo implements IVehiculoElectrico {
    private double autonomia; // Autonomía en km
    private double tiempoRecarga;
    public VehiculoElectrico(String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, double autonomia, double tiempoRecarga) {
        super(marca, modelo, nuevo, tipoCombustible, tipoTrasnmision);
        this.autonomia = autonomia;
        this.tiempoRecarga = tiempoRecarga;
    }
    public double getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }
    public double getTiempoRecarga() {
        return tiempoRecarga;
    }
    public void setTiempoRecarga(double tiempoRecarga) {
        this.tiempoRecarga = tiempoRecarga;
    }
    @Override
    public double calcularPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecio'");
    } 

    

}
