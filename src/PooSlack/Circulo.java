package PooSlack;

public class Circulo {
	
	/*Crea una clase "Circulo" con el atributo radio.
	 * Incluye un constructor para inicializar el radio y métodos para calcular el área y la circunferencia del círculo.
	 */
	
	private Double radio;
	
	public Circulo(Double radio) {
		this.radio = radio;		
	}
	
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
	public Double getRadio() {
		return radio;
	}
	
	public Double obtenerArea() {
		return (radio*radio*Math.PI);
	}
	
	public Double obtenerPerimetro() {
		return (2*radio*Math.PI);
	}

}
