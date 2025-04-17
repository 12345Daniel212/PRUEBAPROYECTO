/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

/**
 *
 * @author DANIEL
 */
public class Empleado extends Persona {

      //ATRIBUTOS
      private int idEmpleado;
      private String horario;
      private String foto;
      private String numeroSS;

    //CONSTRUCTORES
    public Empleado() {
        super();
        this.idEmpleado = 0;
        this.horario = "";
        this.foto = "";
        this.numeroSS = "";
    }

    public Empleado(int idEmpleado, String horario, String foto, String numeroSS, String RFC, String nombre, String celular, String direccion) {
        super(RFC, nombre, celular, direccion);
        this.idEmpleado = idEmpleado;
        this.horario = horario;
        this.foto = foto;
        this.numeroSS = numeroSS;
    }

    //GETTERS Y SETTERS
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getHorario() {
        return horario;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getFoto() {
        return foto;
    }
    public void setNumeroSS(String numeroSS) {
        this.numeroSS = numeroSS;
    }
    public String getNumeroSS() {
        return numeroSS;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", horario=" + horario + ", foto=" + foto + ", numeroSS=" + numeroSS + super.toString() + '}';
    }

        //METODOS QUE SON HEREDADOS DE LA CLASE PERSONA

      @Override
        public void mostrarDatosPersona() {
          System.out.println("RFC: " + RFC);
          System.out.println("Nombre: " + nombre);
          System.out.println("Celular: " + celular);
          System.out.println("Direccion: " + direccion);
          System.out.println("ID Empleado: " + idEmpleado);
          System.out.println("Horario: " + horario);
          System.out.println("Foto: " + foto);
      }
}
