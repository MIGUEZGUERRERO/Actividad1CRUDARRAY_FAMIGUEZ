/**
 * Clase que contiene metodo que interactua con la consola principal, contiene
 * menu
 * 
 * @author Francisco Miguez
 * @version 1.3
 */
public class menucrud {
	/**
	 * Inserta mensaje de bienvenida al programa principal.
	 * 
	 * @author Francisco Miguez
	 * @version 1.1
	 * @param texto a mostrar en rotulo
	 */
	public static void mostrarRotulo(String texto) {
		// Mensaje de bienvenida para mostrar por consola.

		System.out.println("Bienvenido al programa LA CLAQUETA");
		System.out.println("**********************************");
		System.out.println("****Elija una opción del menu*****");
	}

	/**
	 * Inserta Menú a programa principal
	 * 
	 * @author Francisco Miguez
	 * @version 1.2
	 * @return Devuelve número entero dependiendo de la eleción del usuario.
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
