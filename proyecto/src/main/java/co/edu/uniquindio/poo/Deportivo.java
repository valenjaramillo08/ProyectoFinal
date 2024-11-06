package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo{
    public int pasajeros;
    public int puertas;
    public int bolsasAire;
    public int caballosFuerza;
    public double tiempoVelocidad0a100;
    public Deportivo(String marca, String modelo, boolean nuevo, TipoCombustible tipoCombustible,
            TipoTransmision tipoTrasnmision, int pasajeros, int puertas, int bolsasAire, int caballosFuerza,
            double tiempoVelocidad0a100) {
        super(marca, modelo, nuevo, tipoCombustible, tipoTrasnmision);
        this.pasajeros = pasajeros;
        this.puertas = puertas;
        this.bolsasAire = bolsasAire;
        this.caballosFuerza = caballosFuerza;
        this.tiempoVelocidad0a100 = tiempoVelocidad0a100;
    }
    public int getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }
    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    public int getBolsasAire() {
        return bolsasAire;
    }
    public void setBolsasAire(int bolsasAire) {
        this.bolsasAire = bolsasAire;
    }
    public int getCaballosFuerza() {
        return caballosFuerza;
    }
    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }
    public double getTiempoVelocidad0a100() {
        return tiempoVelocidad0a100;
    }
    public void setTiempoVelocidad0a100(double tiempoVelocidad0a100) {
        this.tiempoVelocidad0a100 = tiempoVelocidad0a100;
    }
    @Override
    public double calcularPrecio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularPrecio'");
    }
    
    
}
