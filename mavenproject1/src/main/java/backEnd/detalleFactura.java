/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

import java.util.Date;

/**
 *
 * @author DANIEL
 */
public class detalleFactura extends Factura {

  //ATRIBUTOS
  private int cantidad;

  //CONSTRUCTOR
  public detalleFactura(int cantidad, int idFactura, String tipoFactura, Date fechaGeneracion, char status, double subTotal, double iva, double total, Date fechaPago, String horaCompra) {
    super(idFactura, tipoFactura, fechaGeneracion, status, subTotal, iva, total, fechaPago, horaCompra);
    this.cantidad = cantidad;
  }
  public detalleFactura() {
    super();
    this.cantidad = 0;
  }

  //GETTERS Y SETTERS
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
  public int getCantidad() {
    return cantidad;
  }

  //TO STRING
  @Override
  public String toString() {
    return "detalleFactura{" + "cantidad=" + cantidad + ", idFactura=" + idFactura + ", tipoFactura=" + tipoFactura + ", fechaGeneracion=" + fechaGeneracion + ", status=" + status + ", subTotal=" + subTotal + ", iva=" + iva + ", total=" + total + ", fechaPago=" + fechaPago + ", horaCompra=" + horaCompra + '}';
  }

  //METODOS QUE ESTAN SIENDO HEREDADOS
  @Override
  public void mostrarDatosArticulo() {
    System.out.println("LA FACTURA ES: " + idFactura);
    super.mostrarDatosArticulo();
    System.out.println("Cantidad: " + cantidad);
    }

}
