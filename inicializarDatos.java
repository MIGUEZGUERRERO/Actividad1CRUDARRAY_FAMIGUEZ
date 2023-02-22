
public class inicializarDatos {

	/**
	 * Metodo para incicializar el array.
	 * 
	 * @author Francisco Míguez.
	 * @version 1.0
	 * @return Devuelve el array calculando las posiciones que tiene.
	 * @see CRUD ARRAY EJERCICIO IMF.
	 */

	public static void inicializar(String[] lista, String dato) {
		// Recibe un array de String y lo inicializa.

		int longitud = lista.length; // Se evita que cada vuelta de bucle tenga que realizar una operación más.
		for (int i = 0; i < longitud; i++) {
			lista[i] = dato;
		}

	}
}
