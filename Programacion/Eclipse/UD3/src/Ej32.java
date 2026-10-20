import java.util.Random;
import java.util.Scanner;

public class Ej32 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		final int Piedra = 0, Papel = 1, Tijera = 2;
		int num_maquina = ((int) r.nextDouble() * 3 + 1), num_usuario = 0;
		String respuesta = "";
		System.out.println("Dame tu eleccion (Piedra/ Papel / Tijera )");
		respuesta = s.nextLine();
		if (respuesta.equalsIgnoreCase("piedra") && respuesta.equalsIgnoreCase("tijera")
				&& respuesta.equalsIgnoreCase("papel")) {
			switch (respuesta) {
			case "papel":
				num_usuario = Papel;
				break;
			case "piedra":
				num_usuario = Piedra;
				break;
			case "tijera":
				num_usuario = Tijera;
				break;

			default:
				break;
			}
			// num_maquina = 0;

			if (num_maquina == num_usuario) {
				System.out.println("Empate");
			} else if (num_maquina + num_usuario == 1) {
				if (num_maquina == 1) {
					System.out.println("Gana la maquina");

				} else {
					System.out.println("Tu ganas");
				}
				;
			} else if (num_maquina + num_usuario == 2) {
				if (num_maquina == 0) {
					System.out.println("Gana la maquina");

				} else {
					System.out.println("Tu ganas");
				}
			} else if (num_maquina + num_usuario == 3) {
				if (num_maquina == 2) {
					System.out.println("Gana la maquina");

				} else {
					System.out.println("Tu ganas");
				}
				;
			}
			;
			System.out.println("La maquina : " + num_maquina);
			;
		} else {
			System.out.println("¡Eso no es una opción!");
		}
		;
	}
}
