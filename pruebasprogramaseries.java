
import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que contiene metodo principal para ejecutar el programaseries
 * 
 * @author Francisco Miguez.
 * @version 1.6
 */
public class pruebasprogramaseries {
	/**
	 * Entrada a programaseries. Se declaran los array que contienen las series
	 * recogidas por usuario
	 * 
	 * @author Francisco Miguez.
	 * @version 1.6
	 * @param args dato de entrada
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] serie = new String[5];
		String[] plataforma = new String[5];
		String[] genero = new String[5];

		String nombre;
		int longitud = 0;
		int eleccion;
		int posicion = 0;
		String nuevaposicion;
		int delete;

		Scanner lector = new Scanner(System.in);

		menucrud.mostrarRotulo("_");

		// Muestra todo el array inicial
		// Llama al método inicializarDatos para inicializar los array.
		inicializarDatos.inicializar(serie, "_");
		System.out.println(Arrays.toString(serie) + "Serie");

		inicializarDatos.inicializar(plataforma, "_");
		System.out.println(Arrays.toString(plataforma) + "Plataforma");

		inicializarDatos.inicializar(genero, "_");
		System.out.println(Arrays.toString(genero) + "Género");

		do {
			eleccion = menucrud.mostrarMenu();// Llama al método menucrud para insertar menú inicial.

			eleccion = lector.nextInt();
			lector.nextLine();

			switch (eleccion) {
			// Gestiona la opción de añadir dentro de los array
			case 1:

				if (longitud >= serie.length || longitud >= plataforma.length || longitud >= genero.length) {
					System.out.println("el array está completo");

				} else {

					System.out.println("introduzca una serie");
					posicion = (buscador.buscar(serie, "_"));// Llama al método buscador para encontrar una posición.
					serie[posicion] = lector.nextLine();
					System.out.println(Arrays.toString(serie));

					System.out.println("introduzca plataforma");
					posicion = (buscador.buscar(plataforma, "_"));
					plataforma[posicion] = lector.nextLine();
					System.out.println(Arrays.toString(plataforma));

					System.out.println("introduzca género");
					posicion = (buscador.buscar(genero, "_"));
					genero[posicion] = lector.nextLine();
					System.out.println(Arrays.toString(genero));
					longitud++;
					System.out.println("-------------------");

					// Muestra los array actualizados.
					System.out.println(Arrays.toString(serie));
					System.out.println(Arrays.toString(plataforma));
					System.out.println(Arrays.toString(genero));
				}
				break;

			case 2:
				// Gestiona la opción de modificar los array
				try {

					System.out.println(Arrays.toString(serie));
					System.out.println("indique qué Serie desea modificar?");
					nombre = lector.nextLine();
					posicion = (buscador.buscar(serie, nombre));// Llama al método buscador para encontrar una posición.
					System.out.println("indique nueva entrada?");
					nuevaposicion = lector.nextLine();
					serie[posicion] = nuevaposicion;// Crea una nueva posición.
					System.out.println(Arrays.toString(serie));

					System.out.println(Arrays.toString(plataforma));
					System.out.println("indique qué Plataforma desea modificar?");
					nombre = lector.nextLine();
					posicion = (buscador.buscar(plataforma, nombre));
					System.out.println("indique nueva entrada?");
					nuevaposicion = lector.nextLine();
					plataforma[posicion] = nuevaposicion;
					System.out.println(Arrays.toString(plataforma));

					System.out.println(Arrays.toString(genero));
					System.out.println("indique qué Género desea modificar?");
					nombre = lector.nextLine();
					posicion = (buscador.buscar(genero, nombre));
					System.out.println("indique nueva entrada?");
					nuevaposicion = lector.nextLine();
					genero[posicion] = nuevaposicion;
					System.out.println(Arrays.toString(genero));

					System.out.println("-------------------");

					// Muestra los array actualizados.
					System.out.println(Arrays.toString(serie));
					System.out.println(Arrays.toString(plataforma));
					System.out.println(Arrays.toString(genero));

				} catch (Exception e) {
					System.out.println("error");
				}
				break;

			case 3:
				// Gestiona la opción de eliminar posiciónes de los array
				try {
					System.out.println("el array contiene: ");
					System.out.println(Arrays.toString(serie));
					System.out.println(Arrays.toString(plataforma));
					System.out.println(Arrays.toString(genero));
					longitud--;

					System.out.println("indique la posición qué desea eliminar?");
					delete = lector.nextInt();
					deletecadena(serie, delete);// Llama al método privado delete para eliminar una posición
					deletecadena(plataforma, delete);
					deletecadena(genero, delete);
					longitud--;

					// Muestra los array actualizados.
					System.out.println("el array contiene ahora: ");
					System.out.println(Arrays.toString(serie));
					System.out.println(Arrays.toString(plataforma));
					System.out.println(Arrays.toString(genero));
					longitud--;

				} catch (Exception e) { // Controla la excepción genérica.
					System.out.println("ERROR");
					e.printStackTrace();

				}
				break;

			case 4:
				// Gestiona la opción de buscar dentro de las posiciones de los array
				try {

					System.out.println("qué serie quiere buscar");
					nombre = lector.nextLine();

					// Llama al método buscador para encontrar una posición.
					System.out.println("existe una coincidencia en la posición " + buscador.buscar(serie, nombre));
					System.out.println("Resultado -1 indica NO ENCONTRADO");
					System.out.println(Arrays.toString(serie));
					System.out.println(Arrays.toString(plataforma));
					System.out.println(Arrays.toString(genero));

				} catch (Exception e) { // Controla la excepción genérica.
					System.out.println("ERROR");
					e.printStackTrace();
				}

				break;

			case 5:
				// Gestiona la opción de salir del programa.
				System.out.println("Salió del programa");
				break;

			default:
				// Si no está recogido dentro de las opciones del menú, pide al usuario que
				// elija una de las opciones.
				System.out.println("Por favor, elija una opción del menú");
				break;

			}

		} while (eleccion != 5);

		lector.close();
	}

	private static void deletecadena(String[] cadenas, int posicion) {
		/**
		 * Método privado para "eliminar" la posición dentro de un array, realmente la
		 * sustituye.
		 * 
		 * @author Francisco Miguez.
		 * @version 1.3
		 * @see CRUD ARRAY EJERCICIO IMF.
		 */

		cadenas[posicion] = "_";
		for (int i = posicion; i < cadenas.length - 1; i++) {// Recorre las posiciones del array.

		}

	}

}
