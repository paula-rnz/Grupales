package PooSlack;

import java.util.Date;

public class Libro {
	
	/*Crea una clase "Libro" con los atributos título, autor y año de publicación. 
	 * Incluye un constructor para inicializar los atributos y métodos para obtener y establecer los valores de los atributos.
	 */

	String titulo;
	String autor;
	Date anio;
	
	public Libro(String titulo, String autor, Date anio) {
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
	
	public void setAnio(Date anio) {
		this.anio = anio;
	}
	
	public Date getAnio() {
		return anio;
	}

	
	
}
