/**
 * Clase que contiene metodo que interactua con la consola principal, contiene
 * inicializarDatos
 * 
 * @author Francisco Miguez
 * @version 1.0
 */
public class inicializarDatos {
	/**
	 * Metodo para inicializar array
	 * 
	 * @author Francisco Miguez
	 * @version 1.0
	 * @param lista array vacio
	 * @param dato  dentro del array
	 */

	public static void inicializar(String[] lista, String dato) {
		// Recibe un array de String y lo inicializa.
		// Variable longitud para calcular tamaño del array.
		// Se evita que cada vuelta de bucle tenga que realizar una operación más.
		int longitud = lista.length;
		for (int i = 0; i < longitud; i++) {
			lista[i] = dato;
		}

	}
}
