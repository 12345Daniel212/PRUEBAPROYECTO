/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author DANIEL
 */
public class Cliente extends Persona{

    //ATRIBUTOS
    private double minCredito;
    private double maxCredito;

    //CONTRUCTORES

    public Cliente(double minCredito, double maxCredito, String RFC, String nombre, String celular, String direccion) {
        super(RFC, nombre, celular, direccion);
        this.minCredito = minCredito;
        this.maxCredito = maxCredito;
    }

    public Cliente() {
        super();
        this.minCredito = 0.0;
        this.maxCredito = 0.0;
    }


    //GETTERS Y SETTERS
    public void setMinCredito(double minCredito) {
        this.minCredito = minCredito;
    }
    public double getMinCredito() {
        return minCredito;
    }
    public void setMaxCredito(double maxCredito) {
        this.maxCredito = maxCredito;
    }
    public double getMaxCredito() {
        return maxCredito;
    }
    //TO STRING
    @Override
    public String toString() {
        return "Cliente{" + "minCredito=" + minCredito + ", maxCredito=" + maxCredito + ", RFC=" + RFC + ", nombre=" + nombre + ", celular=" + celular + ", direccion=" + direccion + '}';
    }

     //METODOS QUE SON HEREDADOS DE LA CLASE PERSONA

     @Override
     public void mostrarDatosPersona() {
       super.mostrarDatosPersona();
       System.out.println("RFC: " + RFC);
       System.out.println("Nombre: " + nombre);
       System.out.println("Celular: " + celular);
       System.out.println("Direccion: " + direccion);
       System.out.println("Minimo Credito: " + minCredito);
       System.out.println("Maximo Credito: " + maxCredito);

   }
}
