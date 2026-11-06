import java.util.Random;
import java.util.Scanner;

public class Ej51 {

	public static void main(String[] args) {
		Random  r = new Random();
		Scanner s = new Scanner(System.in);
		int colubnas = 0, filas = 0;
		do {
			System.out.println("Dame cantidad de filas");
			filas = s.nextInt();
			System.out.println("Dame cantdad de colubnas");
			colubnas = s.nextInt();
		} while (colubnas <= 0 || filas <= 0);
		int[][] matriz = new int[filas][colubnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < colubnas; j++) {
				System.out.println("Introduzca numero para: \t [" + (i + 1) + "] : [" + (j + 1) + "] ");
				matriz [i][j] = s.nextInt();
				
			}
		}
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < colubnas; j++) {
				System.out.print("["+matriz[i][j]+"]");
			}
			System.out.println("");
		}

	}

}
