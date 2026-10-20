import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0, y = 0;
		System.out.println("Dame");
		System.out.println("X");
		x = s.nextInt();
		System.out.println("Y");
		y = s.nextInt();
		if (x > 0 && y > 0) {
			System.out.println("esta en el Primer Cuadrante ");
		} else if (x < 0 && y > 0) {
			System.out.println("esta en el Segundo Cuadrante ");
		} else if (x < 0 && y < 0) {
			System.out.println("esta en el Tercer Cuadrante ");
		} else if (x > 0 && y < 0) {
			System.out.println("esta en el Cuarto Cuadrante ");
		} else if (x == 0 && y != 0) {
			System.out.println("esta en el Eje abscisas");
		} else if (x != 0 && y == 0) {
			System.out.println("esta en el Eje ordenadas ");
		} else if (x == 0 && y == 0) {
			System.out.println("esta en el origen Coordenadas");
		}
		;

		;
	}

}
