package grupal13;

import java.time.LocalDate;

public class Usuario {

	private String nombre;
    private LocalDate fechaNacimiento;
    private String run;

    public Usuario(String nombre, LocalDate fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }
    
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", run='" + run + '\'' +
                '}';
    }
}
