import java.util.Scanner;

public class Ej31 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = 0, y = 0;
		System.out.println("Dame");
		System.out.println("Numero 1");
		x = s.nextInt();
		System.out.println("Numero 2");
		y = s.nextInt();
		if ((x >= 0 && y >= 0) || (x <= 0 && y <= 0)) {
			System.out.println("Positivo");
		} else if (x <= 0 && y >= 0 || (x <= 0 && y <= 0)) {
			System.out.println("Negativo");
		} 
		;

		;
	}
}
