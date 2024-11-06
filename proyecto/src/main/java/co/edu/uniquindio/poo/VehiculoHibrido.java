package co.edu.uniquindio.poo;

public class VehiculoHibrido extends Vehiculo implements IVehiculoHibrido {
    private double autonomia; // Autonomía en km
    private double tiempoRecarga;
    public VehiculoHibrido(String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
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
    @Override
    public boolean isEnchufable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEnchufable'");
    }
    @Override
    public void setEnchufable(boolean enchufable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEnchufable'");
    }
    @Override
    public boolean isHibridiLigero() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isHibridiLigero'");
    }
    @Override
    public void setHibridiLigero(boolean hibridiLigero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHibridiLigero'");
    } 

    
}
