package test;

import domain.Cliente;
import java.util.Date;

public class TestCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan", 'm', 27, "Entre Rios 2500", new Date(), true);       
        System.out.println(c1.toString());
        
        Cliente c2 = new Cliente("Juana", 'f', 22, "Entre Rios 2500", new Date(), false);       
        System.out.println(c2.toString());
    }
}
