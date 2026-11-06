import java.util.Random;

public class Ej53 {

	public static void main(String[] args) {
		final String[] notas = { "do", "re", "mi", "fa", "sol", "la", "si", "do" };
		Random r = new Random();
		int melodia = 0, nota = 0;
		String notaInicial = "";

		do {
			melodia = (int) (r.nextDouble() * 28 + 1);

		} while (melodia <= 4 || melodia >= 28 || melodia % 4 == 0);

		for (int i = 0; i <= melodia; i++) {
			for (int j = 0; j <= 4; j++) {
				nota = (int) (r.nextDouble() * notas.length - 1 + 1);
				if (i == 0 || j == 0) {
					notaInicial = notas[nota];
				}
				if (i == melodia || j == 4) {
					System.out.print(" " + notaInicial + " ");

				} else {
					System.out.print(" " + notas[nota] + " ");

				}

			}
			System.out.print(" |");
		}
		System.out.print(" |");
	}

}
