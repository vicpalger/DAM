import java.util.Random;
import java.util.Scanner;

public class Ej59 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int x = 0, y = 0, cont = 0;
		String[][] tablero = new String[3][3];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[0].length; j++) {
				tablero[i][j] = "_";
			}
		}
		while (true) {
			for (int i = 0; i < tablero.length; i++) {
				for (int j = 0; j < tablero[0].length; j++) {
					System.out.print(" " + tablero[i][j] + " ");
				}
				System.out.println("");
			}
			do {
				System.out.print("Dame donde quieres\n");
				x = s.nextInt();
				y = s.nextInt();
				if (x < 0 || x >= 3 || y < 0 || y >= 3) {
					System.out.println("Valores fuera de Rango (0 , 1 , 2)");
				} else if (!tablero[x][y].equalsIgnoreCase("_")) {
					if (tablero[x][y].equalsIgnoreCase("O")) {
						System.out.println("Espacio ya tiene dueño( Es del Rival )");
					} else if (tablero[x][y].equalsIgnoreCase("X")) {
						System.out.println("Este espacio te pertenece ");
					}
				}
			} while (x < 0 || x >= 3 || y < 0 || y >= 3 || !tablero[x][y].equalsIgnoreCase("_"));
			tablero[x][y] = "X";
			do {
				x = (int) (r.nextDouble() * 3 + 0);
				y = (int) (r.nextDouble() * 3 + 0);
			} while (x < 0 || x >= 3 || y < 0 || y >= 3 || !tablero[x][y].equalsIgnoreCase("_"));
			tablero[x][y] = "O";
			cont += 2;
			if ((tablero[0][0].equals("X") && tablero[0][1].equals("X") && tablero[0][2].equals("X"))
					|| (tablero[1][0].equals("X") && tablero[1][1].equals("X") && tablero[1][2].equals("X"))
					|| (tablero[2][0].equals("X") && tablero[2][1].equals("X") && tablero[2][2].equals("X")) ||

					(tablero[0][0].equals("X") && tablero[1][0].equals("X") && tablero[2][0].equals("X"))
					|| (tablero[0][1].equals("X") && tablero[1][1].equals("X") && tablero[2][1].equals("X"))
					|| (tablero[0][2].equals("X") && tablero[1][2].equals("X") && tablero[2][2].equals("X")) ||

					(tablero[0][0].equals("X") && tablero[1][1].equals("X") && tablero[2][2].equals("X"))
					|| (tablero[0][2].equals("X") && tablero[1][1].equals("X") && tablero[2][0].equals("X"))) {

				System.out.println("Ganaste");
				break;
			} else if ((tablero[0][0].equals("O") && tablero[0][1].equals("O") && tablero[0][2].equals("O"))
					|| (tablero[1][0].equals("O") && tablero[1][1].equals("O") && tablero[1][2].equals("O"))
					|| (tablero[2][0].equals("O") && tablero[2][1].equals("O") && tablero[2][2].equals("O")) ||

					(tablero[0][0].equals("O") && tablero[1][0].equals("O") && tablero[2][0].equals("O"))
					|| (tablero[0][1].equals("O") && tablero[1][1].equals("O") && tablero[2][1].equals("O"))
					|| (tablero[0][2].equals("O") && tablero[1][2].equals("O") && tablero[2][2].equals("O")) ||

					(tablero[0][0].equals("O") && tablero[1][1].equals("O") && tablero[2][2].equals("O"))
					|| (tablero[0][2].equals("O") && tablero[1][1].equals("O") && tablero[2][0].equals("O"))) {
				System.out.println("Jajaja Te gano la maquina");
				break;
			}else if (cont >= 9 ) {
				System.out.println("Fin de partida empate");
				break;
			}

		}
	}
}
