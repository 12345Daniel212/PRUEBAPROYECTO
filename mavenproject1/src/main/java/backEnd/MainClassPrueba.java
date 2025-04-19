package backEnd;

import java.util.Date;

public class MainClassPrueba {
    public static void main(String[] args) {
        //PRUEBA DEL AREA DE PERSONA (EMPLEADO)
        Empleado empleado = new Empleado(1, "9:00-18:00", "foto.jpg", "123456789", "RFC123", "Juan Perez", "5551234567", "Calle Falsa 123");
        System.out.println("ID Empleado: " + empleado.getIdEmpleado());
        System.out.println("Horario: " + empleado.getHorario());
        System.out.println("Foto: " + empleado.getFoto());
        System.out.println("Numero SS: " + empleado.getNumeroSS());
        System.out.println("RFC: " + empleado.getRFC());
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Celular: " + empleado.getCelular());
        System.out.println("Direccion: " + empleado.getDireccion());
        System.out.println(empleado.toString());
        empleado.mostrarDatosPersona();

        //PRUEBA DEL AREA DE CLIENTE
        Cliente cliente = new Cliente( 1000.0, 5000.0 ,"ROADJADK23J2K", "DANIEL", "31110203", "Calle Verdadera 456");
        System.out.println("RFC: " + cliente.getRFC());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Celular: " + cliente.getCelular());
        System.out.println("Direccion: " + cliente.getDireccion());
        System.out.println("Minimo Credito: " + cliente.getMinCredito());
        System.out.println("Maximo Credito: " + cliente.getMaxCredito());
        System.out.println(cliente.toString());
        cliente.mostrarDatosPersona();


        //PRUEBA DE PRIMERO DAR DE ALTA UNA MARCA
        Marca marca = new Marca("MarcaX");
        System.out.println("Marca: " + marca.getNombreMarca());
        System.out.println(marca.toString());
        System.out.println("Marca actualizada: " + marca.getNombreMarca());
        System.out.println(marca.toString());

        //PRUEBA DE PRIMERO DAR DE ALTA UN TIPO DE PRODUCTO
        tipoProducto tipoProducto = new tipoProducto("tipo de producto X");
        System.out.println("Tipo de Producto: " + tipoProducto.getTipoProducto());
        System.out.println(tipoProducto.toString());
        System.out.println("Tipo de Producto actualizado: " + tipoProducto.getTipoProducto());
        System.out.println(tipoProducto.toString());

        //PRUEBA DE PIMPRESION DE UNA FACTURA
        Factura factura = new Factura(001, "Factura", new Date(), 'A', 100.0, 16.0, 116.0, new Date(), "10:00", 1, "ArticuloX", 50.0, marca, tipoProducto);
        factura.mostrarDatosArticulo();




}
}