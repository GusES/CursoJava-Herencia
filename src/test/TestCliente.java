package test;

import domain.Cliente;

public class TestCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        String view = c1.toString();
        System.out.println(view);
        
    }
}
