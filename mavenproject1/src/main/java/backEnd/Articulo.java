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

  //CONSTRUCTOR
  public Articulo(int idArticulo, String nombre, double costo) {
    this.idArticulo = idArticulo;
    this.nombre = nombre;
    this.costo = costo;
  }

  public Articulo() {
    this.idArticulo = 0;
    this.nombre = "";
    this.costo = 0.0;
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

  //TO STRING
  @Override
  public String toString() {
    return "Articulo{" + "idArticulo=" + idArticulo + ", nombre=" + nombre + ", costo=" + costo + '}';
  }


    //METODOS QUE SERAN HEREDADOS

    public void mostrarDatosArticulo() {
      System.out.println("idArticulo: " + idArticulo);
      System.out.println("Nombre: " + nombre);
      System.out.println("Costo: " + costo);
  }

}
