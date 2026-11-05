
import java.util.Scanner;

public class ControlAcceso {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String claveCorrecta = "admin123";

		System.out.print("Introduce la clave (escribe admin123): ");

		String claveUsuario = teclado.nextLine();

		// Aunque el usuario escriba admin123, siempre deniega el acceso

		if (claveUsuario == claveCorrecta) {

			System.out.println("Acceso CONCEDIDO");

		} else {

			System.out.println("Acceso DENEGADO"); // <-- PONER BREAKPOINT AQUÍ

		}

		teclado.close();
	}
}
