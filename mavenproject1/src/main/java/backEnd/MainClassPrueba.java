package backEnd;
// import backEnd.Empleado;

import java.util.Date;

public class MainClassPrueba {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");

        Empleado empleado = new Empleado(1, "9:00 AM - 5:00 PM", "foto.jpg", "123456789", "RFC123456",
                "Daniel Rodriguez", "5551234567", "Direccion generica 123");
        empleado.mostrarDatosPersona();

        System.out.println("--------------------------------------------------");

        Cliente cliente = new Cliente(1000.0, 5000.0, "ROADJADK23J2K", "DANIEL", "31110203", "Direccion generica 321");
        cliente.mostrarDatosPersona();

        System.out.println("--------------------------------------------------");

        Marca marca = new Marca("Marca ");
        System.out.println("Marca: " + marca.getNombreMarca());
        System.out.println(marca.toString());

        System.out.println("--------------------------------------------------");

        tipoProducto tipoProducto = new tipoProducto("tipo de producto X");
        System.out.println("Tipo de Producto: " + tipoProducto.getTipoProducto());
        System.out.println(tipoProducto.toString());

        System.out.println("--------------------------------------------------");

        Factura factura = new Factura(001, "Factura", new Date(), 'P', 1230.0, 16.0, new Date(), "10:00", 1,
                "ArticuloX", 50.0, marca, tipoProducto);
        factura.calcularTotal();
        factura.mostrarDatosArticulo();
    }
}