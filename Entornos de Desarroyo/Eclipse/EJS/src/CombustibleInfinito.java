
public class CombustibleInfinito {
	public static void main(String[] args) {

		int altitud = 0;

		int velocidad = 100;

		int combustible = 500;

		System.out.println("Iniciando ascenso...");

		while (altitud < 10000) {

			altitud += velocidad;

			combustible -= 10;

			// Al llegar a cierta altura, el viento frena la nave

			if (altitud >= 4500) {

				velocidad = 0 ;

			}

			// Sistema de emergencia mal programado

			if (combustible == 0) {

				combustible = 100;

			}

		}

		System.out.println("¡Órbita alcanzada!");

	}

}
