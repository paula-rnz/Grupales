package PooSlack;

/*Crea una clase "Estudiante" con los atributos nombre, edad y número de estudiante.
 *  Incluye un constructor para inicializar los atributos y métodos para obtener 
 *  y establecer los valores de los atributos.
 */

public class Estudiante {
	
	String nombre;
	int edad;
	int numeroEstudiante;
	
	public Estudiante(String nombre, int edad, int numeroEstudiante) {
		this.nombre = nombre;
		this.edad = edad;
		this.numeroEstudiante = numeroEstudiante;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setNumeroEstudiante(int numeroEstudiante) {
		this.numeroEstudiante = numeroEstudiante;
	}
	
	public int getNumeroEstudiante() {
		return numeroEstudiante;
	}

}
