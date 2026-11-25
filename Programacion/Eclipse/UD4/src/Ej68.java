import java.util.Random;

public class Ej68 {
	public static void main(String[] args) {
		Random r = new Random();
		int col = 0, fila = 0, intentos = 1;
		do {
			col = (int) (r.nextDouble() * 8 + 1);
			fila = (int) (r.nextDouble() * 8 + 1);
			System.out.println("INtento numero" + intentos);
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (col == i || fila == j) {

						System.out.print("+");
					} else {
						System.out.print(".");

					}
				}
				System.out.println("");
			}
			intentos ++;
		} while (!(col == 4 && fila == 4));
	}
}
