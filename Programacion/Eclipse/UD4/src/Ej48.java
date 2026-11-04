import java.util.Random;
import java.util.Scanner;

public class Ej48 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int min = 0, max = 0, largo = 0, total = 0, cam = 0, num = 0;
		Random r = new Random();
		do {
			System.out.println("Dame el largo de la lista");
			largo = s.nextInt();
			if (largo <= 0)
				System.out.println("El valor tiene que ser mayor a 0");
			;
		} while (largo <= 0);
		System.out.println("Dame el rango de numeros");
		min = s.nextInt();
		max = s.nextInt();
		if (min > max) {
			cam = min;
			min = max;
			max = cam;
		}
		int[] vector = new int[largo];
		for (int i = 0; i < vector.length; i++) {
			num = (int) (r.nextDouble() * (max - min + 1) + min);
			vector[i] = num;
			total += num;
			System.out.print(" [" + num + "] ");
			if ((i + 1) % 10 == 0) {
				System.out.println("");
			}

		}
		System.out.println("El total es " + total);
	}

}
