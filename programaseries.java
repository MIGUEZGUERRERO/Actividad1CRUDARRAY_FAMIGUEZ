import java.util.Arrays;
import java.util.Scanner;

public class programaseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] serie = new String[5];
		String[] plataforma = new String[5];
		String[] genero = new String[5];
		String[] cadenas = new String[5];
		String nombre;
		String dato;
		int longitud = 0;
		int eleccion;
		int eleccionSub;
		int posicion = 0;
		String nuevaposicion;
		int delete;

		Scanner lector = new Scanner(System.in);

		menucrud.mostrarRotulo("");

		// mostrar todo el array inicial
		inicializarDatos.inicializar(serie, "");
		System.out.println(Arrays.toString(serie) + "serie");

		inicializarDatos.inicializar(plataforma, "");
		System.out.println(Arrays.toString(plataforma) + "plataforma");

		inicializarDatos.inicializar(genero, "");
		System.out.println(Arrays.toString(genero) + "género");

		do {
			eleccion = menucrud.mostrarMenu();

			eleccion = lector.nextInt();
			lector.nextLine();

			switch (eleccion) {
			case 1:

				if (longitud == serie.length) {
					System.out.println("el array está completo");
					break;
				}

				System.out.println("introduzca una serie");
				serie[longitud] = lector.nextLine();
				longitud++;
				System.out.println(Arrays.toString(serie));

				break;

			case 2:

				try {

					System.out.println(Arrays.toString(serie));
					System.out.println("indique qué desea modificar?");
					nombre = lector.nextLine();
					posicion = (buscador.buscar(serie, nombre));
					System.out.println("indique nueva entrada?");
					nuevaposicion = lector.nextLine();
					serie[posicion] = nuevaposicion;
					System.out.println(Arrays.toString(serie));

				} catch (Exception e) {
					System.out.println("error");
				}
				break;

			case 3:
				System.out.println("el array contiene: " + Arrays.toString(serie));
				System.out.println("indique la posición qué desea eliminar?");
				delete = lector.nextInt();
				deletecadena(serie, delete);

				System.out.println("el array contiene ahora: " + Arrays.toString(serie));

				break;

			case 4:

				try {

					System.out.println(Arrays.toString(serie));
					System.out.println("qué quieres buscar");
					nombre = lector.nextLine();
					
					System.out.println("POSICIÓN "+buscador.buscar(serie, nombre));
					System.out.println("Resultado -1 indica NO ENCONTRADO");
						
				} catch (Exception e) {  // Controla la excepción genérica.
					System.out.println("ERROR");
				}

				break;

			case 5:
				System.out.println("Salió del programa");
				break;

			default:
				System.out.println("Por favor, elija una opción del menú");
				break;

			}

		} while (eleccion != 5);
	}

	private static void deletecadena(String[] cadenas, int posicion) {

		cadenas[posicion] = "";
	}

}
