import java.lang.reflect.Array;
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

		menucrud.mostrarRotulo("x");

		// mostrar todo el array inicial
		inicializarDatos.inicializar(serie, "x");
		System.out.println(Arrays.toString(serie) + "serie");

		inicializarDatos.inicializar(plataforma, "x");
		System.out.println(Arrays.toString(plataforma) + "plataforma");

		inicializarDatos.inicializar(genero, "x");
		System.out.println(Arrays.toString(genero) + "género");

		do {
			eleccion = menucrud.mostrarMenu();

			eleccion = lector.nextInt();
			lector.nextLine();

			switch (eleccion) {
			case 1:

				if (longitud >= serie.length || longitud >= plataforma.length || longitud >= genero.length) {
					System.out.println("el array está completo");

				} else {

					System.out.println("introduzca una serie");
					posicion = (buscador.buscar(serie, "x"));
					serie[posicion] = lector.nextLine();
					
					System.out.println(Arrays.toString(serie));

					System.out.println("introduzca plataforma");
					posicion = (buscador.buscar(plataforma, "x"));
					plataforma[posicion] = lector.nextLine();
					System.out.println(Arrays.toString(plataforma));

					System.out.println("introduzca género");
					posicion = (buscador.buscar(genero, "x"));
					genero[posicion] = lector.nextLine();
					System.out.println(Arrays.toString(genero));
					longitud++;
					System.out.println("-------------------");

					System.out.println(Arrays.toString(serie));
					System.out.println(Arrays.toString(plataforma));
					System.out.println(Arrays.toString(genero));
				}
				break;

			case 2:

				try {

					System.out.println(Arrays.toString(serie));
					System.out.println("indique qué Serie desea modificar?");
					nombre = lector.nextLine();
					posicion = (buscador.buscar(serie, nombre));
					System.out.println("indique nueva entrada?");
					nuevaposicion = lector.nextLine();
					serie[posicion] = nuevaposicion;
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

					System.out.println(Arrays.toString(serie));
					System.out.println(Arrays.toString(plataforma));
					System.out.println(Arrays.toString(genero));
					
					
				} catch (Exception e) {
					System.out.println("error");
				}
				break;

				case 3:
	
					try {
						System.out.println("el array contiene: ");
						System.out.println(Arrays.toString(serie));
						System.out.println(Arrays.toString(plataforma));
						System.out.println(Arrays.toString(genero));
						longitud--;
						
						System.out.println("indique la posición qué desea eliminar?");
						delete = lector.nextInt();
						deletecadena(serie, delete);
						deletecadena(plataforma, delete);
						deletecadena(genero, delete);
						longitud--;
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

				try {

					
					System.out.println("qué serie quiere buscar");
					nombre = lector.nextLine();

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
				System.out.println("Salió del programa");
				break;

			default:
				System.out.println("Por favor, elija una opción del menú");
				break;

			}

		} while (eleccion != 5);
	}

	private static void deletecadena(String[] cadenas, int posicion) {
		
		cadenas[posicion] ="x";
		for (int i=posicion;i<cadenas.length-1;i++) {
			
		}
	
	}

}
