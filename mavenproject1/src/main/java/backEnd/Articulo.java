/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author DANIEL
 */
public class Articulo extends Marca {

  //ATRIBUTOS
  protected int idArticulo;
  protected String nombre;
  protected double costo;

      // Composición: incluir Marca y tipoProducto como atributos
      protected Marca marca;
      protected tipoProducto tipoProducto;


  //CONSTRUCTOR
    public Articulo(int idArticulo, String nombre, double costo, Marca marca, tipoProducto tipoProducto) {
      this.idArticulo = idArticulo;
      this.nombre = nombre;
      this.costo = costo;
      this.marca = marca;
      this.tipoProducto = tipoProducto;
  }

  //GETTERS Y SETTERS
  public void setIdArticulo(int idArticulo) {
    this.idArticulo = idArticulo;
  }
  public int getIdArticulo() {
    return idArticulo;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getNombre() {
    return nombre;
  }
  public void setCosto(double costo) {
    this.costo = costo;
  }
  public double getCosto() {
    return costo;
  }
  public void setMarca(Marca marca) {
    this.marca = marca;
  }
  public Marca getMarca() {
    return marca;
  }
  public void setTipoProducto(tipoProducto tipoProducto) {
    this.tipoProducto = tipoProducto;
  }
  public tipoProducto getTipoProducto() {
    return tipoProducto;
  }
  //TO STRING
  @Override
  public String toString() {
    return "Articulo{" + "idArticulo=" + idArticulo + ", nombre=" + nombre + ", costo=" + costo + ", marca=" + marca + ", tipoProducto=" + tipoProducto + '}';
  }




    //METODOS QUE SERAN HEREDADOS

    public void mostrarDatosArticulo() {
      System.out.println("idArticulo: " + idArticulo);
      System.out.println("Nombre: " + nombre);
      System.out.println("Costo: " + costo);
      System.err.println("Marca: " + marca.getNombreMarca());
      System.out.println("Tipo de Producto: " + tipoProducto.getTipoProducto());
  }

}
