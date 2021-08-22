package domain;

public class Empleado extends Persona {
    
    private int idEmpleado = ++Empleado.contador;
    private double sueldo;
    private static int contador;
    
    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.sueldo = sueldo;
    }
    
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    public double getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}
