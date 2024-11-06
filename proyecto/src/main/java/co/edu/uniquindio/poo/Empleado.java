package co.edu.uniquindio.poo;
public class Empleado extends Usuario {
    public int idEmpleado;

    public Empleado(String nombre, String clave, String preguntaSeguridad, String respuestaSeguridad, double salario,
            int idEmpleado) {
        super(nombre, clave, preguntaSeguridad, respuestaSeguridad, salario);
        this.idEmpleado = idEmpleado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    

    
}