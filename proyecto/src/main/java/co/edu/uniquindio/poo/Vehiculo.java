package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    public String marca;
    public String modelo;
    public boolean nuevo;
    public TipoCombustible tipoCombustible;
    public TipoTransmision tipoTrasnmision;
    
    public Vehiculo(String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision) {
        this.marca = marca;
        this.modelo = modelo;
        this.nuevo = nuevo;
        this.tipoCombustible = tipoCombustible;
        this.tipoTrasnmision = tipoTrasnmision;
    }

    public abstract double calcularPrecio();

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public boolean isNuevo() {
        return nuevo;
    }
    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public TipoTransmision getTipoTrasnmision() {
        return tipoTrasnmision;
    }
    public void setTipoTrasnmision(TipoTransmision tipoTrasnmision) {
        this.tipoTrasnmision = tipoTrasnmision;
    }

    
    
}
