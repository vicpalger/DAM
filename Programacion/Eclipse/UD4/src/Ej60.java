import java.util.Random;
import java.util.Scanner;

public class Ej60 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int filas = 0, columnas = 0, rangoMin = 0, rangoMax = 0;
		System.out.println("Coloque Tamaño de Matriz");
		System.out.print("\tFilas:");
		filas = s.nextInt();
		System.out.print("\tColumnas:");
		columnas = s.nextInt();
		int[][] matriz = new int[filas][columnas];

		do {
			if (rangoMax == 0 && rangoMin == 0) {
				System.out.println("Reñeremos la matriz con un rango de numeros ");
			}
			if (rangoMax == 0 || rangoMax < rangoMin) {
				System.out.print("\tMaximo:");
				rangoMax = s.nextInt();
			}
			if (rangoMin == 0) {
				System.out.print("\tMinimo:");
				rangoMin = s.nextInt();
			}
			if (rangoMax > rangoMin) {
				break;
			} else if (rangoMax == 0 || rangoMax < rangoMin) {
				System.out.println("El rango Maximo deve ser mayor al Minimo ("+rangoMin+")");
			}
		} while (true);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = (int)(r.nextDouble() * (rangoMax - rangoMin + 1) + rangoMin);
			}
			
		}
		while (true) {
			System.out.println("Que numero quieres que busque");
		}
	}

}
