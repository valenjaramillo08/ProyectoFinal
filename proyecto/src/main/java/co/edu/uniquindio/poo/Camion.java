package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    public double capacidadCarga;
    public boolean aireAcondicionado;
    public boolean frenosAire;
    public boolean abs;
    public int ejes;
    public TipoCamion tipoCamion;
    public Camion(String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, double capacidadCarga, boolean aireAcondicionado, boolean frenosAire,
            boolean abs, int ejes, TipoCamion tipoCamion) {
        super(marca, modelo, nuevo, tipoCombustible, tipoTrasnmision);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenosAire = frenosAire;
        this.abs = abs;
        this.ejes = ejes;
        this.tipoCamion = tipoCamion;
    }
    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }
    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    public boolean isFrenosAire() {
        return frenosAire;
    }
    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }
    public boolean isAbs() {
        return abs;
    }
    public void setAbs(boolean abs) {
        this.abs = abs;
    }
    public int getEjes() {
        return ejes;
    }
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }
    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }
    @Override
    public double calcularPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecio'");
    }

    
    
}
