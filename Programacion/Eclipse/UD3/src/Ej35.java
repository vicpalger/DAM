
public class Ej35 {
	public static void main(String[] args) {
		int filas = 9;
		for (int i = 0; i != filas; i++) {

			for (int c = 0; c != filas; c++) {
				if (c == i) {
					System.out.print("*");

				} else if (c+i == filas-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				;

			}
			;
			System.out.println("");
		}
		;
	}
}