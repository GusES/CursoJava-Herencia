package test;

import domain.Empleado;

public class TestEmpleado {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan", 5000);
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Clara", 4000);
        System.out.println(e2);
    }
}
