/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author DANIEL
 */
public class Marca {

      //ATRIBUTOS
      private String marca;

      //CONSTRUCTOR
      public Marca(int idMarca, String nombreMarca) {
          this.marca = nombreMarca;
      }

      public Marca() {
          this.marca = "";
      }

      //GETTERS Y SETTERS

      public void setNombreMarca(String nombreMarca) {
          this.marca = nombreMarca;
      }
      public String getNombreMarca() {
          return marca;
      }

      //TO STRING
        @Override
        public String toString() {
            return "Marca{" + "marca=" + marca + '}';
        }
}