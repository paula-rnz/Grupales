package Clase11;

public class Ejemplo2 {

	public static void main(String[] args) {
		final boolean valorconstante = false;
		String mensaje = "Lorem ipsum dolor sit amet,\r\n"
				+ "consectetur adipiscing elit. Donec facilisis est ac ante viverra,\r\n"
				+ "vel efficitur leo consequat. Maecenas quis lorem sit amet diam\r\n"
				+ "consequat lacinia non nec lacus. Phasellus egestas quam non dui\r\n"
				+ "dictum, sed fermentum dolor efficitur. Aliquam volutpat ex\r\n"
				+ "sodales pulvinar scelerisque. Donec sodales cursus tortor eu\r\n"
				+ "aliquam. Curabitur id purus arcu. Vestibulum ante ipsum primis in\r\n"
				+ "faucibus orci luctus et ultrices posuere cubilia curae;\r\n"
				+ "Suspendisse pretium, quam non consectetur scelerisque, diam\r\n"
				+ "tortor iaculis arcu, nec tincidunt diam eros sed urna. Ut at\r\n"
				+ "consequat enim. Orci varius natoque penatibus et magnis dis\r\n"
				+ "parturient montes, nascetur ridiculus mus. Donec sit amet\r\n"
				+ "ultricies dui. Donec aliquet rhoncus velit et sollicitudin.";
		int ola = 10;
		for (int i=0; i < ola; i++) {
			System.out.println ("Valor: " + (i*i));
			
			/*Esto es un comentario
			demasiado grande
			para que esté en una
			sola línea*/
			
			System.out.println ( "El mensaje es " + mensaje);
			System.out.println ("El valor de la constante es: " + valorconstante);		
		}
	}

}
