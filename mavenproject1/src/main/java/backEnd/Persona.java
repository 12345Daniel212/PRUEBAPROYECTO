/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author DANIEL
 */
public class Persona {

    //ATRIBUTOS

    String RFC;
    String nombre;
    String celular;
    String direccion;

    //CONSTRUCTORES
    public Persona() {
        this.RFC = "";
        this.nombre = "";
        this.celular =  "";
        this.direccion = "";
    }
    public Persona(String RFC, String nombre, String celular, String direccion) {
        this.RFC = RFC;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
    }

    //GETTERS Y SETTERS

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCelular() {
        return celular;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    //TO STRING
    @Override
    public String toString() {
        return "Persona{" + "RFC=" + RFC + ", nombre=" + nombre + ", celular=" + celular + ", direccion=" + direccion + '}';
    }


    //METODOS QUE SERAN HEREDADOS

    public void mostrarDatos() {
        System.out.println("RFC: " + RFC);
        System.out.println("Nombre: " + nombre);
        System.out.println("Celular: " + celular);
        System.out.println("Direccion: " + direccion);
    }

}
