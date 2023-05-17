package PooSlack;

import java.time.LocalDate;

public class Libro {
	
	/*Crea una clase "Libro" con los atributos título, autor y año de publicación. 
	 * Incluye un constructor para inicializar los atributos y métodos para obtener y establecer los valores de los atributos.
	 */

	private String titulo;
	private String autor;
	private LocalDate anio;
	
	public Libro(String titulo, String autor, LocalDate anio) {
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;		
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutos(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAnio(LocalDate anio) {
		this.anio = anio;
	}
	
	public LocalDate getAnio() {
		return anio;
	}

	
	
}
