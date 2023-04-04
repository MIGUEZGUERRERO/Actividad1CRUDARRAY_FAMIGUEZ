	/**
	 * Clase que contiene metodo que interactua con la consola principal, contiene
	 * buscador
	 * 
	 * @author Francisco Miguez
	 * @version 1.3
	 */
public class buscador {
	/**
	 * Método para buscar posición dentro de un array
	 * @author Francisco Miguez.
	 * @version 1.3
	 * @param lista array vacio
	 * @param dato dentro del array
	 * @return Devuelve una posición.
	 */

	public static int buscar(String[] lista, String dato) {

		int posicion = -1; // Almacena la posición encontrada, se inicia a -1, si se produce ese resultado
							// se interpreta como error.
		int longitud = lista.length; // Variable para saber la longitud del array.
		boolean encontrado = false; // Variable para saber si encontrado o no.
		int contador = 0; // Recorre las posiciones del array.

		while (contador < longitud && !encontrado) {// Controla que existan elementos dentro del array.

			if (lista[contador].equals(dato)) { // Contador almacena aumentando la unidad cada vez que recorra el array.
				encontrado = true;
				posicion = contador;
			}
			contador++;

		}

		return posicion;

	}

}
