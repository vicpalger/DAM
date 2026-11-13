import java.util.Scanner;

public class Ej57 {

	public static void main(String[] args) {
		int altura = 11, anchura = 11;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Dame ancho de la cuadricula");
			altura = s.nextInt();
			System.out.println("Dame alto de la matricula ");
			anchura = s.nextInt();
		} while (altura != anchura);
		for (int i = 0; i < altura * 2; i++) {
			for (int j = 0; j < anchura * 2; j++) {
				if (i >= altura) {
					if (j >= anchura) {
						System.out.print("\u001B[32m4\u001B[0m");
					} else {
						System.out.print("\u001B[31m3\u001B[0m");
					}
				} else {
					if (j >= anchura) {
						System.out.print("\u001B[33m2\u001B[0m");
					} else {
						System.out.print("\u001B[34m1\u001B[0m");
					}
				}

			}
			System.out.println("");
		}
	}

}
