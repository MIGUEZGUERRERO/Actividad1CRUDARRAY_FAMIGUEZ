
public class menucrud {

	/**
	 * Inserta mensaje de bienvenida al programa principal.
	 * 
	 * @author Francisco Míguez.
	 * @version 1.1
	 * @see CRUD ARRAY EJERCICIO IMF.
	 */

	public static void mostrarRotulo(String texto) {
		// Mensaje de bienvenida para mostrar por consola.

		System.out.println("Bienvenido al programa LA CLAQUETA");
		System.out.println("**********************************");
		System.out.println("****Elija una opción del menu*****");
	}

	/**
	 * Inserta Menú a programa principal.
	 * 
	 * @author Francisco Míguez.
	 * @version 1.2
	 * @return Devuelve número entero dependiendo de la eleción del usuario.
	 * @see CRUD ARRAY EJERCICIO IMF.
	 */
	public static int mostrarMenu() {
		// Menú para mostrar por consola.

		System.out.println("1-Añadir ");
		System.out.println("2-Modificar ");
		System.out.println("3-Eliminar ");
		System.out.println("4-buscar ");
		System.out.println("5-Salir");

		return 5;
	}

}
