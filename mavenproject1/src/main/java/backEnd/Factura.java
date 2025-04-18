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
public class Factura extends Articulo {

  //ATRIBUTOS
  protected int idFactura;
  protected String tipoFactura;
  protected Date fechaGeneracion;
  protected char status;
  protected double subTotal;
  protected double iva;
  protected double total;
  protected Date fechaPago;
  protected String horaCompra;

  //CONSTRUCTOR
  public Factura(int idFactura, String tipoFactura, Date fechaGeneracion, char status, double subTotal, double iva, double total, Date fechaPago, String horaCompra) {
    this.idFactura = idFactura;
    this.tipoFactura = tipoFactura;
    this.fechaGeneracion = fechaGeneracion;
    this.status = status;
    this.subTotal = subTotal;
    this.iva = iva;
    this.total = total;
    this.fechaPago = fechaPago;
    this.horaCompra = horaCompra;
  }
  public Factura() {
    this.idFactura = 0;
    this.tipoFactura = "";
    this.fechaGeneracion = new Date();
    this.status = ' ';
    this.subTotal = 0.0;
    this.iva = 0.0;
    this.total = 0.0;
    this.fechaPago = new Date();
    this.horaCompra = "";
  }

  //GETTERS Y SETTERS
  public void setIdFactura(int idFactura) {
    this.idFactura = idFactura;
  }
  public int getIdFactura() {
    return idFactura;
  }
  public void setTipoFactura(String tipoFactura) {
    this.tipoFactura = tipoFactura;
  }
  public String getTipoFactura() {
    return tipoFactura;
  }
  public void setFechaGeneracion(Date fechaGeneracion) {
    this.fechaGeneracion = fechaGeneracion;
  }
  public Date getFechaGeneracion() {
    return fechaGeneracion;
  }
  public void setStatus(char status) {
    this.status = status;
  }
  public char getStatus() {
    return status;
  }
  public void setSubTotal(double subTotal) {
    this.subTotal = subTotal;
  }
  public double getSubTotal() {
    return subTotal;
  }
  public void setIva(double iva) {
    this.iva = iva;
  }
  public double getIva() {
    return iva;
  }
  public void setTotal(double total) {
    this.total = total;
  }
  public double getTotal() {
    return total;
  }
  public void setFechaPago(Date fechaPago) {
    this.fechaPago = fechaPago;
  }
  public Date getFechaPago() {
    return fechaPago;
  }
  public void setHoraCompra(String horaCompra) {
    this.horaCompra = horaCompra;
  }
  public String getHoraCompra() {
    return horaCompra;
  }

  //TO STRING
  @Override
  public String toString() {
    return "Factura{" + "idFactura=" + idFactura + ", tipoFactura=" + tipoFactura + ", fechaGeneracion=" + fechaGeneracion + ", status=" + status + ", subTotal=" + subTotal + ", iva=" + iva + ", total=" + total + ", fechaPago=" + fechaPago + ", horaCompra=" + horaCompra + '}';
  }

  //METODOS QUE ESTAN SIENDO HEREDADOS
  @Override
  public void mostrarDatosArticulo() {
    super.mostrarDatosArticulo();
    System.out.println("idFactura: " + idFactura);
    System.out.println("Tipo de Factura: " + tipoFactura);
    System.out.println("Fecha de Generacion: " + fechaGeneracion);
    System.out.println("Status: " + status);
    System.out.println("SubTotal: " + subTotal);
    System.out.println("IVA: " + iva);
    System.out.println("Total: " + total);
    System.out.println("Fecha de Pago: " + fechaPago);
    System.out.println("Hora de Compra: " + horaCompra);
  }
}