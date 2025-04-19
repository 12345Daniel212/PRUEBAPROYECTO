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
    protected String tipoProducto;

    //CONSTRUCTOR
    public tipoProducto(int idTipoProducto) {
      this.tipoProducto = this.tipoProducto;
    }

    public tipoProducto() {
      this.tipoProducto = "";
    }

    //GETTERS Y SETTERS
    public void setTipoProducto(String tipoProducto) {
      this.tipoProducto = tipoProducto;
    }
    public String getTipoProducto() {
      return tipoProducto;
    }
    //TO STRING
    @Override
    public String toString() {
      return "tipoProducto{" + "tipoProducto=" + tipoProducto + '}';
    }

}
