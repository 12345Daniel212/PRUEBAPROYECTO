package backEnd;
// import backEnd.Empleado;

import java.util.Date;


public class MainClassPrueba {
    public static void main(String[] args) {

        System.out.println("--------------------------------------------------");

        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado(
            1, // idEmpleado
            "9:00 AM - 5:00 PM", // horario
            "foto.jpg", // foto
            "123456789", // numeroSS
            "RFC123456", // RFC
            "Juan Pérez", // nombre
            "5551234567", // celular
            "Calle Falsa 123" // direccion
        );
        empleado.mostrarDatosPersona();

        System.out.println("--------------------------------------------------");

         //PRUEBA DEL AREA DE CLIENTE
         Cliente cliente = new Cliente( 1000.0, 5000.0 ,"ROADJADK23J2K", "DANIEL", "31110203", "Calle Verdadera 456");
         cliente.mostrarDatosPersona();

         System.out.println("--------------------------------------------------");


        //PRUEBA DE PRIMERO DAR DE ALTA UNA MARCA
        Marca marca = new Marca("Marca ");
        System.out.println("Marca: " + marca.getNombreMarca());
        System.out.println(marca.toString());

        System.out.println("--------------------------------------------------");


        //PRUEBA DE PRIMERO DAR DE ALTA UN TIPO DE PRODUCTO
        tipoProducto tipoProducto = new tipoProducto("tipo de producto X");
        System.out.println("Tipo de Producto: " + tipoProducto.getTipoProducto());
        System.out.println(tipoProducto.toString());

        System.out.println("--------------------------------------------------");


        //PRUEBA DE IMPRESION DE UNA FACTURA
        Factura factura = new Factura(001, "Factura", new Date(), 'P', 1230.0, 16.0, new Date(), "10:00", 1, "ArticuloX", 50.0, marca, tipoProducto);
        factura.calcularTotal(); // Calcular el total de la factura
        factura.mostrarDatosArticulo();
    }
}