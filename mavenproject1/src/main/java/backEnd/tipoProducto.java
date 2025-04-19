/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author DANIEL
 */
public class tipoProducto {

    //ATRIBUTOS
    private String tipo;

    //CONSTRUCTOR
    public tipoProducto(String tipo) {
        this.tipo = tipo;
    }
    public tipoProducto() {
        this.tipo = "";
    }

    //GETTERS Y SETTERS
    public void setTipoProducto(String tipo) {
      this.tipo = tipo;
    }
    public String getTipoProducto() {
      return tipo;
    }
    //TO STRING
    @Override
    public String toString() {
      return "tipoProducto{" + "tipoProducto=" + tipo + '}';
    }

}
