package co.edu.uniquindio.poo;

public class Usuario {
    public String nombre;
    public String clave;
    public String preguntaSeguridad;
    public String respuestaSeguridad;
    public double salario;
    public Usuario(String nombre, String clave, String preguntaSeguridad, String respuestaSeguridad, double salario) {
        this.nombre = nombre;
        this.clave = clave;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
        this.salario = salario;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }
    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }
    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }
    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}
