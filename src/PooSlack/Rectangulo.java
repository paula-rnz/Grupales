package PooSlack;

public class Rectangulo {
	
	/*Crea una clase "Rectangulo" con los atributos longitud y ancho. 
	  Incluye un constructor para inicializar los atributos y métodos para calcular el área y el perímetro del rectángulo.*/

	int longitud;
	int ancho;
	
	public Rectangulo(int longitud,int ancho) {
		this.longitud =longitud;
		this.ancho = ancho;
	}
	
	public void setlongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public int getlongitud() {
		return longitud;
	}
	
	public void setancho(int ancho) {
		this.ancho = ancho;
	}
	
	public int getancho() {
		return ancho;
	}
	
	public int getArea() {
		return (longitud*ancho);
	}
	
	public int getPerimetro() {
		return (2*ancho +2*longitud);
	}
	
	
}
