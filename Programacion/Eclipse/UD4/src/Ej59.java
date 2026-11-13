import java.util.Random;
import java.util.Scanner;

public class Ej59 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int x = 0, y = 0 ;
		String[][] tablero = new String[3][3];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = "_";
			}
		}
		while (true) {
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[0].length; j++) {
					System.out.print(" "+tablero[i][j]+" ");
				}
				System.out.println("");
			}
			do {
				System.out.print("Dame donde quieres\n");
				x = s.nextInt();
				y = s.nextInt();
			} while ( !(y <= 3 && y >= 0)||!(x <= 3 && x >= 0));
			if (tablero[x][y].equalsIgnoreCase("_")) {
				tablero[x][y] = "X";
			}
			x = (int)(r.nextDouble()*3 + 0);
		}
	}

}
