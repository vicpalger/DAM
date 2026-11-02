import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Scaner
		Scanner s = new Scanner(System.in);

		// Declaracion de Variables
		int anyo = 0, alturaAct = 0, newActura = 0, movimientos = 0, subidas = 0, bajadas = 0, media = 0;
		String nombre = "";

		// Preguntas iniciales
		System.out.println("Introduzca el año de fabricaccion de avion");
		anyo = s.nextInt();
		s.nextLine();
		System.out.println("Introduzca el nombre del avion");
		nombre = s.nextLine();

		// Inicio del bucle de preguntas
		while (newActura >= 0) {

			// Pedida de datos de altura
			System.out.println("Introduzca la nueva altura para " + nombre);
			newActura = s.nextInt();

			// Compovacion de altura (Subida / Bajada)
			if (newActura > alturaAct && newActura > 0) {
				// Subida
				alturaAct = newActura;
				subidas++;
				media += newActura;
				movimientos++;
			} else if (newActura < alturaAct && newActura > 0) {
				// Bajada
				alturaAct = newActura;
				bajadas++;
				media += newActura;
				movimientos++;
			}

		}
		// Mostrar resultados
		System.out.println("Subidas: " + subidas);
		System.out.println("Bajadas: " + bajadas);
		System.out.println("Altura media: " + (media / movimientos));
	}

}
