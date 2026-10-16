
public class Ej29 {

	public static void main(String[] args) {
		final int temporada = 8, capitulo = 10;
		for (int t = 1; t != temporada + 1; t++) {
			if (t % 2 != 0) {
				for (int c = 1; c != capitulo + 1; c++) {
					if (c % 2 == 0) {
						if (t == 3 && c == 9) {
							System.out.println("Capitulo " + t + "x" + c + ": La boda roja");
						} else if (t == 6 && c == 10) {
							System.out.println("Capitulo " + t + "x" + c + ": Vientos de invierno.");
						} else {
							System.out.println("Capitulo " + t + "x" + c + "");
						}
						;
					}
					;
				}
				;
			}
			;
		}

		;

	}

}
