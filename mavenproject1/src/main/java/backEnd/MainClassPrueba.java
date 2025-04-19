package backEnd;
// import backEnd.Empleado;

public class MainClassPrueba {
    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado(
            1, // idEmpleado
            "9:00 AM - 5:00 PM", // horario
            "foto.jpg", // foto
            "123456789", // numeroSS
            "RFC123456", // RFC
            "Juan Pérez", // nombre
            "5551234567", // celular
            "Calle Falsa 123" // direccion
        );

        // Mostrar los datos del empleado
        empleado.mostrarDatosPersona();
    }
}